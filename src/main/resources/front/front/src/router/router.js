import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import jianyanyuanList from '../pages/jianyanyuan/list'
import jianyanyuanDetail from '../pages/jianyanyuan/detail'
import jianyanyuanAdd from '../pages/jianyanyuan/add'
import qichefenleiList from '../pages/qichefenlei/list'
import qichefenleiDetail from '../pages/qichefenlei/detail'
import qichefenleiAdd from '../pages/qichefenlei/add'
import qichexinxiList from '../pages/qichexinxi/list'
import qichexinxiDetail from '../pages/qichexinxi/detail'
import qichexinxiAdd from '../pages/qichexinxi/add'
import qichezulinList from '../pages/qichezulin/list'
import qichezulinDetail from '../pages/qichezulin/detail'
import qichezulinAdd from '../pages/qichezulin/add'
import haichejiluList from '../pages/haichejilu/list'
import haichejiluDetail from '../pages/haichejilu/detail'
import haichejiluAdd from '../pages/haichejilu/add'
import jianchaxinxiList from '../pages/jianchaxinxi/list'
import jianchaxinxiDetail from '../pages/jianchaxinxi/detail'
import jianchaxinxiAdd from '../pages/jianchaxinxi/add'
import yajintuihaiList from '../pages/yajintuihai/list'
import yajintuihaiDetail from '../pages/yajintuihai/detail'
import yajintuihaiAdd from '../pages/yajintuihai/add'
import yuqitixingList from '../pages/yuqitixing/list'
import yuqitixingDetail from '../pages/yuqitixing/detail'
import yuqitixingAdd from '../pages/yuqitixing/add'
import weizhangdengjiList from '../pages/weizhangdengji/list'
import weizhangdengjiDetail from '../pages/weizhangdengji/detail'
import weizhangdengjiAdd from '../pages/weizhangdengji/add'
import gonggaoxinxiList from '../pages/gonggaoxinxi/list'
import gonggaoxinxiDetail from '../pages/gonggaoxinxi/detail'
import gonggaoxinxiAdd from '../pages/gonggaoxinxi/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'jianyanyuan',
					component: jianyanyuanList
				},
				{
					path: 'jianyanyuanDetail',
					component: jianyanyuanDetail
				},
				{
					path: 'jianyanyuanAdd',
					component: jianyanyuanAdd
				},
				{
					path: 'qichefenlei',
					component: qichefenleiList
				},
				{
					path: 'qichefenleiDetail',
					component: qichefenleiDetail
				},
				{
					path: 'qichefenleiAdd',
					component: qichefenleiAdd
				},
				{
					path: 'qichexinxi',
					component: qichexinxiList
				},
				{
					path: 'qichexinxiDetail',
					component: qichexinxiDetail
				},
				{
					path: 'qichexinxiAdd',
					component: qichexinxiAdd
				},
				{
					path: 'qichezulin',
					component: qichezulinList
				},
				{
					path: 'qichezulinDetail',
					component: qichezulinDetail
				},
				{
					path: 'qichezulinAdd',
					component: qichezulinAdd
				},
				{
					path: 'haichejilu',
					component: haichejiluList
				},
				{
					path: 'haichejiluDetail',
					component: haichejiluDetail
				},
				{
					path: 'haichejiluAdd',
					component: haichejiluAdd
				},
				{
					path: 'jianchaxinxi',
					component: jianchaxinxiList
				},
				{
					path: 'jianchaxinxiDetail',
					component: jianchaxinxiDetail
				},
				{
					path: 'jianchaxinxiAdd',
					component: jianchaxinxiAdd
				},
				{
					path: 'yajintuihai',
					component: yajintuihaiList
				},
				{
					path: 'yajintuihaiDetail',
					component: yajintuihaiDetail
				},
				{
					path: 'yajintuihaiAdd',
					component: yajintuihaiAdd
				},
				{
					path: 'yuqitixing',
					component: yuqitixingList
				},
				{
					path: 'yuqitixingDetail',
					component: yuqitixingDetail
				},
				{
					path: 'yuqitixingAdd',
					component: yuqitixingAdd
				},
				{
					path: 'weizhangdengji',
					component: weizhangdengjiList
				},
				{
					path: 'weizhangdengjiDetail',
					component: weizhangdengjiDetail
				},
				{
					path: 'weizhangdengjiAdd',
					component: weizhangdengjiAdd
				},
				{
					path: 'gonggaoxinxi',
					component: gonggaoxinxiList
				},
				{
					path: 'gonggaoxinxiDetail',
					component: gonggaoxinxiDetail
				},
				{
					path: 'gonggaoxinxiAdd',
					component: gonggaoxinxiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
