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
    import qichefenlei from '@/views/modules/qichefenlei/list'
    import qichezulin from '@/views/modules/qichezulin/list'
    import yajintuihai from '@/views/modules/yajintuihai/list'
    import yuqitixing from '@/views/modules/yuqitixing/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import qichexinxi from '@/views/modules/qichexinxi/list'
    import jianchaxinxi from '@/views/modules/jianchaxinxi/list'
    import weizhangdengji from '@/views/modules/weizhangdengji/list'
    import haichejilu from '@/views/modules/haichejilu/list'
    import jianyanyuan from '@/views/modules/jianyanyuan/list'
    import gonggaoxinxi from '@/views/modules/gonggaoxinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
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
    }
      ,{
	path: '/qichefenlei',
        name: '电动车分类',
        component: qichefenlei
      }
      ,{
	path: '/qichezulin',
        name: '电动车租赁',
        component: qichezulin
      }
      ,{
	path: '/yajintuihai',
        name: '押金退还',
        component: yajintuihai
      }
      ,{
	path: '/yuqitixing',
        name: '逾期提醒',
        component: yuqitixing
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: '在线留言',
        component: chat
      }
      ,{
	path: '/qichexinxi',
        name: '电动车信息',
        component: qichexinxi
      }
      ,{
	path: '/jianchaxinxi',
        name: '检查信息',
        component: jianchaxinxi
      }
      ,{
	path: '/weizhangdengji',
        name: '违章登记',
        component: weizhangdengji
      }
      ,{
	path: '/haichejilu',
        name: '还车记录',
        component: haichejilu
      }
      ,{
	path: '/jianyanyuan',
        name: '检验员',
        component: jianyanyuan
      }
      ,{
	path: '/gonggaoxinxi',
        name: '公告信息',
        component: gonggaoxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
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
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
