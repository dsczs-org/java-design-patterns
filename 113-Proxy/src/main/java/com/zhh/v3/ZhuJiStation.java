package com.zhh.v3;

/**
 * @author zhh
 * @description 诸暨火车站(目标对象)
 * @date 2020-02-26 22:10
 */
public class ZhuJiStation implements Station {

    /**
     * 姓名
     */
    private String username;

    /**
     * 始发站
     */
    private String start;

    /**
     * 终点站
     */
    private String end;

    public ZhuJiStation(String username, String start, String end) {
        this.username = username;
        this.start = start;
        this.end = end;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public void buy() {
        System.out.println(String.format("%s购买了从%s至%s的火车票", username, start, end));
    }
}
