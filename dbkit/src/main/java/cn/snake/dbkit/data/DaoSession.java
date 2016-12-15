package cn.snake.dbkit.data;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import cn.snake.dbkit.bean.ChatInfoModel;

import cn.snake.dbkit.data.ChatInfoModelDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig chatInfoModelDaoConfig;

    private final ChatInfoModelDao chatInfoModelDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        chatInfoModelDaoConfig = daoConfigMap.get(ChatInfoModelDao.class).clone();
        chatInfoModelDaoConfig.initIdentityScope(type);

        chatInfoModelDao = new ChatInfoModelDao(chatInfoModelDaoConfig, this);

        registerDao(ChatInfoModel.class, chatInfoModelDao);
    }
    
    public void clear() {
        chatInfoModelDaoConfig.clearIdentityScope();
    }

    public ChatInfoModelDao getChatInfoModelDao() {
        return chatInfoModelDao;
    }

}
