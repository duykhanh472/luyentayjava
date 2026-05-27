# 03

> Use ArrayList<String> for tasks. Menu: add task, list tasks, remove task, save to file, load from file. Use basic file I/O.

Dự án nhỏ này chỉ đơn giản để lưu toàn bộ các nhiệm vụ cần làm vào trong một tệp văn bản thuần.

## Hình dung về Workflow của ứng dụng

1. Hiện toàn bộ các lựa chọn:
    - addTask()
    - listTasks()
    - removeTask()
    - saveToFile() - Trong mỗi một Session thì đến khi kết thúc quá trình chạy, chương trình sẽ lưu luôn danh sách nhiệm vụ đó vào trong tệp.
    - loadFromFile() - Đọc tệp và biến thành danh sách nhiệm vụ
2. Mỗi một nhiệm vụ là một dòng trong văn bản (Để tối ưu quá trình đọc).
