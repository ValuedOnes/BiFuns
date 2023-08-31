# Git团队协同实战演练

本仓库提供了一个极简的Java项目，用于练习Git团队协同的工作流。

这个仓库中，`master`分支上的`com.test`包中有接口类`BinaryFunction`。
请针对该接口提供如下实现：

| 类名            | 分支名       |   功能描述    |
|---------------|-----------|:---------:|
| `AddFunction` | `dev-add` |  实现求两数之和  |
| `SubFunction` | `dev-sub` |  实现求两数之差  |
| `MulFunction` | `dev-mul` |  实现求两数之积  |
| `DivFunction` | `dev-div` |  实现求两数之商  |
| `ModFunction` | `dev-mod` | 实现求两数取模运算 |

## 演示示例

类`AddFunction`已完成开发，在`dev-add`分支中，可供参考。

## 操作步骤

1. 使用Git克隆该仓库
2. 新建对应功能的开发分支，如`dev-add`
3. 在合适的位置编写对应功能的实现代码
4. 将该分支推送到远程
5. 创建**Pull Request**
