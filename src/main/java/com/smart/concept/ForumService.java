package com.smart.concept;
//just language
public class ForumService {
    private TransactionManager transactionManager;
    private PerformanceMonitor pmonitor;
    private TopicDao topicDao;
    private ForumDao forumDao;

    public void removeTopic(int topicId) {
        pmonitor.start();                       //框架代码
        transactionManager.beginTransaction();  //框架代码
        topicDao.removeTopic(topicId);      //实际业务代码
        transactionManager.commit();            //框架代码
        pmonitor.end();                         //框架代码
    }

    public void createForum(Forum forum){
        pmonitor.start();
        transactionManager.beginTransaction();
        forumDao.create(forum);
        transactionManager.commit();
        pmonitor.end();
    }

}
