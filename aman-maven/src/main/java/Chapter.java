public class Chapter {
    private int chapterNo;
    private String chapterName;
    private int pageNo;

    public Chapter(int chapterNo, String chapterName,int pageNo ) {
        this.chapterNo = chapterNo;
        this.pageNo = pageNo;
        this.chapterName = chapterName;
    }

    public int getChapterNo() {
        return chapterNo;
    }

    public int getPageNo() {
        return pageNo;
    }

    public String getChapterName() {
        return chapterName;
    }
}
