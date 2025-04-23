import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import forum from '@/views/modules/forum/list'
    import gaodianzhuanlan from '@/views/modules/gaodianzhuanlan/list'
    import gaodianzhuanlanLiuyan from '@/views/modules/gaodianzhuanlanLiuyan/list'
    import meirituijain from '@/views/modules/meirituijain/list'
    import mianshicaipu from '@/views/modules/mianshicaipu/list'
    import mianshicaipuLiuyan from '@/views/modules/mianshicaipuLiuyan/list'
    import mianshiwenhua from '@/views/modules/mianshiwenhua/list'
    import mianshiwenhuaLiuyan from '@/views/modules/mianshiwenhuaLiuyan/list'
    import news from '@/views/modules/news/list'
    import shequxinxi from '@/views/modules/shequxinxi/list'
    import shequxinxiLiuyan from '@/views/modules/shequxinxiLiuyan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
    import dictionaryGaodianzhuanlan from '@/views/modules/dictionaryGaodianzhuanlan/list'
    import dictionaryMeirituijain from '@/views/modules/dictionaryMeirituijain/list'
    import dictionaryMianshicaipu from '@/views/modules/dictionaryMianshicaipu/list'
    import dictionaryMianshiwenhua from '@/views/modules/dictionaryMianshiwenhua/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShequxinxi from '@/views/modules/dictionaryShequxinxi/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryGaodianzhuanlan',
        name: '糕点专栏类型',
        component: dictionaryGaodianzhuanlan
    }
    ,{
        path: '/dictionaryMeirituijain',
        name: '每日推荐类型',
        component: dictionaryMeirituijain
    }
    ,{
        path: '/dictionaryMianshicaipu',
        name: '面食菜谱类型',
        component: dictionaryMianshicaipu
    }
    ,{
        path: '/dictionaryMianshiwenhua',
        name: '面食文化类型',
        component: dictionaryMianshiwenhua
    }
    ,{
        path: '/dictionaryNews',
        name: '新闻类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShequxinxi',
        name: '社区文章类型',
        component: dictionaryShequxinxi
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/forum',
        name: '论坛信息',
        component: forum
      }
    ,{
        path: '/gaodianzhuanlan',
        name: '糕点专栏',
        component: gaodianzhuanlan
      }
    ,{
        path: '/gaodianzhuanlanLiuyan',
        name: '糕点专栏留言',
        component: gaodianzhuanlanLiuyan
      }
    ,{
        path: '/meirituijain',
        name: '每日推荐',
        component: meirituijain
      }
    ,{
        path: '/mianshicaipu',
        name: '面食菜谱',
        component: mianshicaipu
      }
    ,{
        path: '/mianshicaipuLiuyan',
        name: '面食菜谱留言',
        component: mianshicaipuLiuyan
      }
    ,{
        path: '/mianshiwenhua',
        name: '面食文化',
        component: mianshiwenhua
      }
    ,{
        path: '/mianshiwenhuaLiuyan',
        name: '面食文化留言',
        component: mianshiwenhuaLiuyan
      }
    ,{
        path: '/news',
        name: '新闻动态',
        component: news
      }
    ,{
        path: '/shequxinxi',
        name: '社区信息',
        component: shequxinxi
      }
    ,{
        path: '/shequxinxiLiuyan',
        name: '文章留言',
        component: shequxinxiLiuyan
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
