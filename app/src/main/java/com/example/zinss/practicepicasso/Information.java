package com.example.zinss.practicepicasso;

/**
 * Created by zinss on 6/02/2017.
 */

public class Information {
    private String[] imageURLs = {"http://img.eeyy.com/uploadfile/2016/0909/20160909065718166.jpg"
                                    ,"http://img.eeyy.com/uploadfile/2016/0909/20160909065401241.jpg"
                                    ,"http://img1.gamersky.com/image2016/09/20160909_gxh_289_20/image019_S.jpg"};
    private String[] titles = {"食发鬼"
                                ,"清姬","二口女"};
    private String[] descriptions = {"食发鬼用引以为傲的长发编成鞭子，鞭打1名敌人，造成攻击100%的伤害。",
            "清姬鞭打1名敌人，造成攻击86%伤害，并使目标每回合受到清姬攻击14%的伤害（不可叠加），持续3回合",
            "二口女打招呼时，头上的妖灵乘机攻击敌人，造成攻击100%的伤害。"};

    public String[] getImageURLs() {//问题   需不需要position？
        return imageURLs;
    }

    public String[] getTitles() {
        return titles;
    }

    public String[] getDescriptions() {
        return descriptions;
    }
}
