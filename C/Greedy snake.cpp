#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <time.h>
#include <windows.h>

#define WIDTH 80    // 游戏区域宽度
#define HEIGHT 25   // 游戏区域高度

// 定义颜色
#define COLOR_BLACK 0
#define COLOR_WHITE 15
#define COLOR_RED 12

// 枚举类型表示方向
enum Direction {
    UP, DOWN, LEFT, RIGHT
};

// 定义坐标结构体
struct Coordinate {
    int x;
    int y;
};

// 定义节点结构体
struct Node {
    struct Coordinate pos;      // 坐标
    struct Node *next;          // 下一个节点
};

// 定义贪吃蛇结构体
struct Snake {
    struct Node *head;          // 蛇头
    struct Node *tail;          // 蛇尾
    enum Direction direction;   // 移动方向
    int length;                 // 长度
    int speed;                  // 速度（每秒移动格子数）
};

// 定义游戏状态结构体
struct Game {
    struct Snake snake;         // 贪吃蛇
    struct Coordinate apple;    // 苹果坐标
    int score;                  // 得分
    int isOver;                 // 游戏是否结束
};

// 初始化游戏状态
void initGame(struct Game *game) {
    // 初始化贪吃蛇
    struct Node *node = malloc(sizeof(struct Node));
    node->pos.x = WIDTH / 2;
    node->pos.y = HEIGHT / 2;
    node->next = NULL;

    game->snake.head = node;
    game->snake.tail = node;
    game->snake.direction = RIGHT;
    game->snake.length = 1;
    game->snake.speed = 10;

    // 随机生成苹果坐标
    srand((unsigned int)time(NULL));
    game->apple.x = rand() % (WIDTH - 1) + 1;
    game->apple.y = rand() % (HEIGHT - 1) + 1;

    game->score = 0;
    game->isOver = 0;
}

// 销毁游戏状态
void destroyGame(struct Game *game) {
    // 销毁贪吃蛇节点
    struct Node *node = game->snake.head;
    while (node != NULL) {
        struct Node *temp = node;
        node = node->next;
        free(temp);
    }
}

// 绘制游戏界面
void drawGame(struct Game *game) {
    system("cls");      // 清屏

    // 绘制游戏区域
    for (int i = 0; i <= HEIGHT; i++) {
        for (int j = 0; j <= WIDTH; j++) {
            if (i == 0 || i == HEIGHT || j == 0 || j == WIDTH) {
                printf("#");
            } else {
                if (i == game->apple.y && j == game->apple.x) {      // 绘制苹果
                    printf("@");
                } else {
                    int isSnake = 0;
                    struct Node *node = game->snake.head;
                    while (node != NULL) {
                        if (node->pos.x == j && node->pos.y == i) {   // 绘制贪吃蛇
                            printf("*");
                            isSnake = 1;
                            break;
                        }
                        node = node->next;
                    }
                    if (!isSnake) {
                        printf(" ");
                    }
                }
            }
        }
        printf("\n");
    }

    // 显示得分和操作提示
    printf("Score: %d\t", game->score);
    printf("Press arrow keys to move, ESC to exit.\n");
}

// 移动贪吃蛇
void moveSnake(struct Game *game) {
    // 判断是否获得苹果
    if (game->snake.head->pos.x == game->apple.x && game->snake.head->pos.y == game->apple.y) {
        // 生成新的苹果坐标
        srand((unsigned int)time(NULL));
        game->apple.x = rand() % (WIDTH - 1) + 1;
        game->apple.y = rand() % (HEIGHT - 1) + 1;

        // 在蛇头前插入新节点
        struct Node *node = malloc(sizeof(struct Node));
        node->pos.x = game->snake.head->pos.x;
        node->pos.y = game->snake.head->pos.y;
        node->next = game->snake.head;
        game->snake.head = node;
        game->snake.length++;

        // 更新得分
        game->score++;
    } else {
        // 在蛇头前插入新节点
        struct Node *node = malloc(sizeof(struct Node));
        node->pos.x = game->snake.head->pos.x;
        node->pos.y = game->snake.head->pos.y;
        node->next = game->snake.head;
        game->snake.head = node;

        // 删除蛇尾节点
        if (game->snake.length > 1) {
            struct Node *tail = game->snake.tail;
            struct Node *preTail = game->snake.head;
            while (preTail->next != tail) {
                preTail = preTail->next;
            }
            preTail->next = NULL;
            game->snake.tail = preTail;
            free(tail);
        }
    }

    // 更新贪吃蛇移动方向
    if (_kbhit()) {     // 判断是否有键盘输入
        int key = _getch();
        switch (key) {
            case 72:    // 上箭头
                if (game->snake.direction != DOWN) {
                    game->snake.direction = UP;
                }
                break;
            case 80:    // 下箭头
                if (game->snake.direction != UP) {
                    game->snake.direction = DOWN;
                }
                break;
            case 75:    // 左箭头
                if (game->snake.direction != RIGHT) {
                    game->snake.direction = LEFT;
                }
                break;
            case 77:    // 右箭头
                if (game->snake.direction != LEFT) {
                    game->snake.direction = RIGHT;
                }
                break;
            case 27:    // ESC
                game->isOver = 1;
                break;
            default:
                break;
        }
    }

    // 移动贪吃蛇
    struct Coordinate *headPos = &(game->snake.head->pos);
    switch (game->snake.direction) {
        case UP:
            headPos->y--;
            break;
        case DOWN:
            headPos->y++;
            break;
        case LEFT:
            headPos->x--;
            break;
        case RIGHT:
            headPos->x++;
            break;
    }

    // 判断是否撞墙
    if (headPos->x == 0 || headPos->x == WIDTH || headPos->y == 0 || headPos->y == HEIGHT) {
        game->isOver = 1;
    }

    // 判断是否撞自己
    struct Node *node = game->snake.head->next;
    while (node != NULL) {
        if (node->pos.x == headPos->x && node->pos.y == headPos->y) {
            game->isOver = 1;
            break;
        }
        node = node->next;
    }
}

// 游戏主循环
void runGame() {
    struct Game game;
    initGame(&game);

    while (!game.isOver) {
        drawGame(&game);
        moveSnake(&game);
        Sleep(1000 / game.snake.speed);      // 控制贪吃蛇速度
    }

    drawGame(&game);
    printf("Game over! Your score is: %d\n", game.score);

    destroyGame(&game);
}

int main() {
    runGame();
    return 0;
}

