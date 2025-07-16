public class A03_BlockSearchDemo {
    public static void main(String[] args) {
        //分块查找：（适用于有序但不多的情况）
        //核心思想：块内有序，块间有序
        //实现步骤：1.先创建一个数组blockArr存放每一块对象的信息
        //2.先查找blockArr确定要查找到数据属于哪一块
        //3.再单独遍历这一块的数据

        int [] arr ={16,5,9,12,21,18,
                32,23,37,26,45,34,
                50,48,61,52,73,66};

        //1.分为总数的开根号个块
        //要分为几块： 18 开根号 4.24块左右
        //具体分几块根据实际情况判断
        //分块原则：前一个块的最大值要小于后一个块的最小值


        //
        Block b1 = new Block(21,0,5);
        Block b2 = new Block(45,6,11);






    }

    static class Block {
        private int max;//最大值
        private int startIndex;//起始索引
        private int endIndex;//结束索引


        public Block() {
        }

        public Block(int max, int startIndex, int endIndex) {
            this.max = max;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        /**
         * 获取
         * @return max
         */
        public int getMax() {
            return max;
        }

        /**
         * 设置
         * @param max
         */
        public void setMax(int max) {
            this.max = max;
        }

        /**
         * 获取
         * @return startIndex
         */
        public int getStartIndex() {
            return startIndex;
        }

        /**
         * 设置
         * @param startIndex
         */
        public void setStartIndex(int startIndex) {
            this.startIndex = startIndex;
        }

        /**
         * 获取
         * @return endIndex
         */
        public int getEndIndex() {
            return endIndex;
        }

        /**
         * 设置
         * @param endIndex
         */
        public void setEndIndex(int endIndex) {
            this.endIndex = endIndex;
        }

        public String toString() {
            return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
        }
    }

}
