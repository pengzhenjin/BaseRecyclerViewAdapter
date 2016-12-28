package com.baserecyclerviewadapter.data;

import com.baserecyclerviewadapter.entity.ChatMessage;
import com.baserecyclerviewadapter.entity.MySection;
import com.baserecyclerviewadapter.entity.Status;
import com.baserecyclerviewadapter.entity.Video;
import java.util.ArrayList;
import java.util.List;

/**
 * data
 *
 * @author PengZhenjin
 * @date 2016-12-28
 */
public class DataServer {

    private static final String HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK = "https://avatars1.githubusercontent.com/u/7698209?v=3&s=460";
    private static final String CYM_CHAD                                  = "CymChad";

    private DataServer() {
    }

    public static List<Status> getSampleData(int lenth) {
        List<Status> list = new ArrayList<>();
        for (int i = 0; i < lenth; i++) {
            Status status = new Status();
            status.setUserName("Chad" + i);
            status.setCreatedAt("04/05/" + i);
            status.setRetweet(i % 2 == 0);
            status.setUserAvatar("https://avatars1.githubusercontent.com/u/7698209?v=3&s=460");
            status.setText("BaseRecyclerViewAdpaterHelper https://www.recyclerview.org");
            list.add(status);
        }
        return list;
    }

    public static List<Status> addData(List list, int dataSize) {
        for (int i = 0; i < dataSize; i++) {
            Status status = new Status();
            status.setUserName("Chad" + i);
            status.setCreatedAt("04/05/" + i);
            status.setRetweet(i % 2 == 0);
            status.setUserAvatar("https://avatars1.githubusercontent.com/u/7698209?v=3&s=460");
            status.setText("Powerful and flexible RecyclerAdapter https://github.com/CymChad/BaseRecyclerViewAdapterHelper");
            list.add(status);
        }

        return list;
    }

    public static List<MySection> getSampleData() {
        List<MySection> list = new ArrayList<>();
        list.add(new MySection(true, "Section 1", true));
        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
        list.add(new MySection(true, "Section 2", false));
        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
        list.add(new MySection(true, "Section 3", false));
        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
        list.add(new MySection(true, "Section 4", false));
        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
        list.add(new MySection(true, "Section 5", false));
        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
        list.add(new MySection(new Video(HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK, CYM_CHAD)));
        return list;
    }

    public static List<String> getStrData() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            String str = HTTPS_AVATARS1_GITHUBUSERCONTENT_COM_LINK;
            if (i % 2 == 0) {
                str = CYM_CHAD;
            }
            list.add(str);
        }
        return list;
    }

    public static List<ChatMessage> getMultipleItemData() {
        List<ChatMessage> list = new ArrayList<>();
        list.add(new ChatMessage(ChatMessage.MESSAGE_TYPE_SENT_TXT, "你好"));
        list.add(new ChatMessage(ChatMessage.MESSAGE_TYPE_RECEIVE_TXT, "你好"));
        list.add(new ChatMessage(ChatMessage.MESSAGE_TYPE_SENT_TXT, "在干嘛呢？"));
        list.add(new ChatMessage(ChatMessage.MESSAGE_TYPE_RECEIVE_TXT, "在加班了"));
        list.add(new ChatMessage(ChatMessage.MESSAGE_TYPE_SENT_TXT, "噢噢，这么晚还在加班啊？"));
        list.add(new ChatMessage(ChatMessage.MESSAGE_TYPE_SENT_TXT, "加到几点呢？"));
        list.add(new ChatMessage(ChatMessage.MESSAGE_TYPE_RECEIVE_TXT, "对啊，加到八九点吧，咋了？"));
        list.add(new ChatMessage(ChatMessage.MESSAGE_TYPE_SENT_TXT, "没事啊，约吗？哈哈！"));
        list.add(new ChatMessage(ChatMessage.MESSAGE_TYPE_RECEIVE_TXT, "叔叔，我们不约不约哦，不好一丝勒"));
        list.add(new ChatMessage(ChatMessage.MESSAGE_TYPE_SENT_TXT, "哈哈，这样啊"));
        list.add(new ChatMessage(ChatMessage.MESSAGE_TYPE_RECEIVE_TXT, "额"));
        list.add(new ChatMessage(ChatMessage.MESSAGE_TYPE_RECEIVE_TXT, "拜拜"));
        list.add(new ChatMessage(ChatMessage.MESSAGE_TYPE_SENT_TXT, "拜拜"));
        return list;
    }
}
