<template>
	<div class="addEdit-block" :style='{"padding":"20px 30px 30px","margin":"0 auto","color":"#555","borderRadius":"0 0 10px 10px","background":"rgba(255,255,255,.69)","width":"86%","fontSize":"16px"}'>
		<el-form
			:style='{"border":"0px solid rgba(254,169,35,.2)","padding":"0px 25%","boxShadow":"0 0px 0px rgba(64, 158, 255, .3)","fontSize":"inherit","borderRadius":"4px","background":"none"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="150px"
		>
			<template >
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="车牌号" prop="chepaihao">
					<el-input v-model="ruleForm.chepaihao" placeholder="车牌号" clearable  :readonly="ro.chepaihao"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="车牌号" prop="chepaihao">
					<el-input v-model="ruleForm.chepaihao" placeholder="车牌号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="电动车型号" prop="qichexinghao">
					<el-input v-model="ruleForm.qichexinghao" placeholder="电动车型号" clearable  :readonly="ro.qichexinghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="电动车型号" prop="qichexinghao">
					<el-input v-model="ruleForm.qichexinghao" placeholder="电动车型号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="select" v-if="type!='info'"  label="电动车分类" prop="qichefenlei">
					<el-select :disabled="ro.qichefenlei" v-model="ruleForm.qichefenlei" placeholder="请选择电动车分类" >
						<el-option
							v-for="(item,index) in qichefenleiOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="电动车分类" prop="qichefenlei">
					<el-input v-model="ruleForm.qichefenlei"
						placeholder="电动车分类" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="品牌" prop="pinpai">
					<el-input v-model="ruleForm.pinpai" placeholder="品牌" clearable  :readonly="ro.pinpai"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="品牌" prop="pinpai">
					<el-input v-model="ruleForm.pinpai" placeholder="品牌" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="颜色" prop="yanse">
					<el-input v-model="ruleForm.yanse" placeholder="颜色" clearable  :readonly="ro.yanse"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="颜色" prop="yanse">
					<el-input v-model="ruleForm.yanse" placeholder="颜色" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="select" v-if="type!='info'"  label="换挡方式" prop="huandangfangshi">
					<el-select :disabled="ro.huandangfangshi" v-model="ruleForm.huandangfangshi" placeholder="请选择换挡方式" >
						<el-option
							v-for="(item,index) in huandangfangshiOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="换挡方式" prop="huandangfangshi">
					<el-input v-model="ruleForm.huandangfangshi"
						placeholder="换挡方式" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="upload" v-if="type!='info' && !ro.fengmian" label="封面" prop="fengmian">
					<file-upload
						tip="点击上传封面"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.fengmian?ruleForm.fengmian:''"
						@change="fengmianUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="upload" v-else-if="ruleForm.fengmian" label="封面" prop="fengmian">
					<img v-if="ruleForm.fengmian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.fengmian.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.fengmian.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="select" v-if="type!='info'"  label="状态" prop="zhuangtai">
					<el-select :disabled="ro.zhuangtai" v-model="ruleForm.zhuangtai" placeholder="请选择状态" >
						<el-option
							v-for="(item,index) in zhuangtaiOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="状态" prop="zhuangtai">
					<el-input v-model="ruleForm.zhuangtai"
						placeholder="状态" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="租金" prop="zujin">
					<el-input-number v-model="ruleForm.zujin" placeholder="租金" :disabled="ro.zujin"></el-input-number>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="租金" prop="zujin">
					<el-input v-model="ruleForm.zujin" placeholder="租金" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="押金" prop="yajin">
					<el-input-number v-model="ruleForm.yajin" placeholder="押金" :disabled="ro.yajin"></el-input-number>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="押金" prop="yajin">
					<el-input v-model="ruleForm.yajin" placeholder="押金" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="车辆排量" prop="cheliangpailiang">
					<el-input v-model="ruleForm.cheliangpailiang" placeholder="车辆排量" clearable  :readonly="ro.cheliangpailiang"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="车辆排量" prop="cheliangpailiang">
					<el-input v-model="ruleForm.cheliangpailiang" placeholder="车辆排量" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="电池规格" prop="youhao">
					<el-input v-model="ruleForm.youhao" placeholder="电池规格" clearable  :readonly="ro.youhao"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="电池规格" prop="youhao">
					<el-input v-model="ruleForm.youhao" placeholder="电池规格" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="载重" prop="zaizhong">
					<el-input v-model.number="ruleForm.zaizhong" placeholder="载重" clearable  :readonly="ro.zaizhong"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="载重" prop="zaizhong">
					<el-input v-model="ruleForm.zaizhong" placeholder="载重" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="date" v-if="type!='info'" label="登记日期" prop="dengjiriqi">
					<el-date-picker
						format="yyyy 年 MM 月 dd 日"
						value-format="yyyy-MM-dd"
						v-model="ruleForm.dengjiriqi" 
						type="date"
						:readonly="ro.dengjiriqi"
						placeholder="登记日期"
					></el-date-picker> 
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-else-if="ruleForm.dengjiriqi" label="登记日期" prop="dengjiriqi">
					<el-input v-model="ruleForm.dengjiriqi" placeholder="登记日期" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="textarea" v-if="type!='info'" label="租赁须知" prop="zulinxuzhi">
					<el-input
					  style="min-width: 200px; max-width: 600px;"
					  type="textarea"
					  :rows="8"
					  placeholder="租赁须知"
					  v-model="ruleForm.zulinxuzhi" >
					</el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else-if="ruleForm.zulinxuzhi" label="租赁须知" prop="zulinxuzhi">
					<span :style='{"fontSize":"14px","lineHeight":"24px","color":"inherit","fontWeight":"500","display":"inline-block"}'>{{ruleForm.zulinxuzhi}}</span>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="textarea" v-if="type!='info'" label="归还标准" prop="guihaibiaozhun">
					<el-input
					  style="min-width: 200px; max-width: 600px;"
					  type="textarea"
					  :rows="8"
					  placeholder="归还标准"
					  v-model="ruleForm.guihaibiaozhun" >
					</el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else-if="ruleForm.guihaibiaozhun" label="归还标准" prop="guihaibiaozhun">
					<span :style='{"fontSize":"14px","lineHeight":"24px","color":"inherit","fontWeight":"500","display":"inline-block"}'>{{ruleForm.guihaibiaozhun}}</span>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="type!='info'"  label="车辆详情" prop="cheliangxiangqing">
					<editor 
						style="min-width: 200px; max-width: 600px;"
						v-model="ruleForm.cheliangxiangqing" 
						class="editor" 
						action="file/upload">
					</editor>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else-if="ruleForm.cheliangxiangqing" label="车辆详情" prop="cheliangxiangqing">
                    <span :style='{"fontSize":"14px","lineHeight":"24px","color":"inherit","fontWeight":"500","display":"inline-block"}' v-html="ruleForm.cheliangxiangqing"></span>
                </el-form-item>
			<el-form-item :style='{"padding":"0","margin":"0","alignItems":"center","color":"#555","textAlign":"center","display":"flex","width":"100%","fontSize":"16px","justifyContent":"center"}' class="btn">
				<el-button class="btn3"  v-if="type!='info'" type="success" @click="onSubmit">
					<span class="icon iconfont icon-tijiao10" :style='{"color":"inherit","margin":"0 2px","fontSize":"16px"}'></span>
					确定
				</el-button>
				<el-button class="btn4" v-if="type!='info'" type="success" @click="back()">
					<span class="icon iconfont icon-quxiao09" :style='{"color":"inherit","margin":"0 2px","fontSize":"16px"}'></span>
					取消
				</el-button>
				<el-button class="btn5" v-if="type=='info'" type="success" @click="back()">
					<span class="icon iconfont icon-fanhui19" :style='{"color":"inherit","margin":"0 2px","fontSize":"16px"}'></span>
					返回
				</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
import { 
	isNumber,
	isIntNumer,
} from "@/utils/validate";
export default {
	data() {
		var validateNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isNumber(value)) {
				callback(new Error("请输入数字"));
			} else {
				callback();
			}
		};
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				chepaihao : false,
				qichexinghao : false,
				qichefenlei : false,
				pinpai : false,
				yanse : false,
				huandangfangshi : false,
				fengmian : false,
				zhuangtai : false,
				zujin : false,
				yajin : false,
				cheliangpailiang : false,
				youhao : false,
				zaizhong : false,
				zulinxuzhi : false,
				guihaibiaozhun : false,
				dengjiriqi : false,
				cheliangxiangqing : false,
				clicktime : false,
				clicknum : false,
				storeupnum : false,
			},
			
			
			ruleForm: {
				chepaihao: '',
				qichexinghao: '',
				qichefenlei: '',
				pinpai: '',
				yanse: '',
				huandangfangshi: '',
				fengmian: '',
				zhuangtai: '',
				zujin: '',
				yajin: '',
				cheliangpailiang: '',
				youhao: '',
				zaizhong: '',
				zulinxuzhi: '',
				guihaibiaozhun: '',
				dengjiriqi: '',
				cheliangxiangqing: '',
				clicktime: '',
			},
		
			qichefenleiOptions: [],
			huandangfangshiOptions: [],
			zhuangtaiOptions: [],

			
			rules: {
				chepaihao: [
					{ required: true, message: '车牌号不能为空', trigger: 'blur' },
				],
				qichexinghao: [
				],
				qichefenlei: [
					{ required: true, message: '电动车分类不能为空', trigger: 'blur' },
				],
				pinpai: [
				],
				yanse: [
				],
				huandangfangshi: [
				],
				fengmian: [
				],
				zhuangtai: [
				],
				zujin: [
					{ validator: validateNumber, trigger: 'blur' },
				],
				yajin: [
					{ validator: validateNumber, trigger: 'blur' },
				],
				cheliangpailiang: [
				],
				youhao: [
				],
				zaizhong: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
				zulinxuzhi: [
				],
				guihaibiaozhun: [
				],
				dengjiriqi: [
				],
				cheliangxiangqing: [
				],
				clicktime: [
				],
				clicknum: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
				storeupnum: [
					{ validator: validateIntNumber, trigger: 'blur' },
				],
			},
		};
	},
	props: ["parent"],
	computed: {



	},
    components: {
    },
	created() {
		this.ruleForm.dengjiriqi = this.getCurDate()
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='chepaihao'){
							this.ruleForm.chepaihao = obj[o];
							this.ro.chepaihao = true;
							continue;
						}
						if(o=='qichexinghao'){
							this.ruleForm.qichexinghao = obj[o];
							this.ro.qichexinghao = true;
							continue;
						}
						if(o=='qichefenlei'){
							this.ruleForm.qichefenlei = obj[o];
							this.ro.qichefenlei = true;
							continue;
						}
						if(o=='pinpai'){
							this.ruleForm.pinpai = obj[o];
							this.ro.pinpai = true;
							continue;
						}
						if(o=='yanse'){
							this.ruleForm.yanse = obj[o];
							this.ro.yanse = true;
							continue;
						}
						if(o=='huandangfangshi'){
							this.ruleForm.huandangfangshi = obj[o];
							this.ro.huandangfangshi = true;
							continue;
						}
						if(o=='fengmian'){
							this.ruleForm.fengmian = obj[o];
							this.ro.fengmian = true;
							continue;
						}
						if(o=='zhuangtai'){
							this.ruleForm.zhuangtai = obj[o];
							this.ro.zhuangtai = true;
							continue;
						}
						if(o=='zujin'){
							this.ruleForm.zujin = obj[o];
							this.ro.zujin = true;
							continue;
						}
						if(o=='yajin'){
							this.ruleForm.yajin = obj[o];
							this.ro.yajin = true;
							continue;
						}
						if(o=='cheliangpailiang'){
							this.ruleForm.cheliangpailiang = obj[o];
							this.ro.cheliangpailiang = true;
							continue;
						}
						if(o=='youhao'){
							this.ruleForm.youhao = obj[o];
							this.ro.youhao = true;
							continue;
						}
						if(o=='zaizhong'){
							this.ruleForm.zaizhong = obj[o];
							this.ro.zaizhong = true;
							continue;
						}
						if(o=='zulinxuzhi'){
							this.ruleForm.zulinxuzhi = obj[o];
							this.ro.zulinxuzhi = true;
							continue;
						}
						if(o=='guihaibiaozhun'){
							this.ruleForm.guihaibiaozhun = obj[o];
							this.ro.guihaibiaozhun = true;
							continue;
						}
						if(o=='dengjiriqi'){
							this.ruleForm.dengjiriqi = obj[o];
							this.ro.dengjiriqi = true;
							continue;
						}
						if(o=='cheliangxiangqing'){
							this.ruleForm.cheliangxiangqing = obj[o];
							this.ro.cheliangxiangqing = true;
							continue;
						}
						if(o=='clicktime'){
							this.ruleForm.clicktime = obj[o];
							this.ro.clicktime = true;
							continue;
						}
						if(o=='clicknum'){
							this.ruleForm.clicknum = obj[o];
							this.ro.clicknum = true;
							continue;
						}
						if(o=='storeupnum'){
							this.ruleForm.storeupnum = obj[o];
							this.ro.storeupnum = true;
							continue;
						}
				}
			}
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					var json = data.data;
				} else {
					this.$message.error(data.msg);
				}
			});
            this.$http({
				url: `option/qichefenlei/qichefenlei`,
				method: "get"
            }).then(({ data }) => {
				if (data && data.code === 0) {
					this.qichefenleiOptions = data.data;
				} else {
					this.$message.error(data.msg);
				}
            });
            this.huandangfangshiOptions = "手动挡,自动挡".split(',')
            this.zhuangtaiOptions = "已租赁,未租赁".split(',')
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `qichexinxi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        this.ruleForm.cheliangxiangqing = this.ruleForm.cheliangxiangqing.replace(reg,'../../../springboot366n071w/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {
	if(this.ruleForm.fengmian!=null) {
		this.ruleForm.fengmian = this.ruleForm.fengmian.replace(new RegExp(this.$base.url,"g"),"");
	}
var objcross = this.$storage.getObj('crossObj');
      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
		this.$refs["ruleForm"].validate(valid => {
			if (valid) {
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid = crossuserid;
					this.ruleForm.crossrefid = crossrefid;
					let params = { 
						page: 1, 
						limit: 10, 
						crossuserid:this.ruleForm.crossuserid,
						crossrefid:this.ruleForm.crossrefid,
					} 
				this.$http({ 
					url: "qichexinxi/page", 
					method: "get", 
					params: params 
				}).then(({ 
					data 
				}) => { 
					if (data && data.code === 0) { 
						if(data.data.total>=crossoptnum) {
							this.$message.error(this.$storage.get('tips'));
							return false;
						} else {
							this.$http({
								url: `qichexinxi/${!this.ruleForm.id ? "save" : "update"}`,
								method: "post",
								data: this.ruleForm
							}).then(({ data }) => {
								if (data && data.code === 0) {
									this.$message({
										message: "操作成功",
										type: "success",
										duration: 1500,
										onClose: () => {
											this.parent.showFlag = true;
											this.parent.addOrUpdateFlag = false;
											this.parent.qichexinxiCrossAddOrUpdateFlag = false;
											this.parent.search();
											this.parent.contentStyleChange();
										}
									});
								} else {
									this.$message.error(data.msg);
								}
							});

						}
					} else { 
				} 
			});
		} else {
			this.$http({
				url: `qichexinxi/${!this.ruleForm.id ? "save" : "update"}`,
				method: "post",
			   data: this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "操作成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.parent.showFlag = true;
							this.parent.addOrUpdateFlag = false;
							this.parent.qichexinxiCrossAddOrUpdateFlag = false;
							this.parent.search();
							this.parent.contentStyleChange();
						}
					});
				} else {
					this.$message.error(data.msg);
			   }
			});
		 }
         }
		});
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.qichexinxiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    fengmianUploadChange(fileUrls) {
	    this.ruleForm.fengmian = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  color: inherit;
	  	  font-weight: 500;
	  	  display: inline-block;
	  	  width: 150px;
	  	  font-size: inherit;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 150px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  padding: 0 12px;
	  	  color: inherit;
	  	  font-size: 14px;
	  	  border-color: #ddd;
	  	  border-radius: 0px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  background: rgba(255, 255, 255,.6);
	  	  width: auto;
	  	  border-width: 0 0 1px;
	  	  border-style: solid;
	  	  min-width: 350px;
	  	  height: 40px;
	  	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  	  padding: 0 12px;
	  	  color: inherit;
	  	  font-size: 14px;
	  	  border-color: #ddd;
	  	  border-radius: 0px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  background: rgba(255, 255, 255,.6);
	  	  width: auto;
	  	  border-width: 0 0 1px;
	  	  border-style: solid;
	  	  min-width: 350px;
	  	  height: 40px;
	  	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border-radius: 0px;
	  	  padding: 0 10px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: rgba(255, 255, 255,.6);
	  	  width: 350px;
	  	  font-size: 14px;
	  	  border-color: #ddd;
	  	  border-width: 0 0 1px;
	  	  border-style: solid;
	  	  height: 40px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border-radius: 0px;
	  	  padding: 0 10px 0 30px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: rgba(255, 255, 255,.6);
	  	  width: 350px;
	  	  font-size: 14px;
	  	  border-color: #ddd;
	  	  border-width: 0 0 1px;
	  	  border-style: solid;
	  	  height: 40px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  cursor: pointer;
	  	  color: inherit;
	  	  object-fit: cover;
	  	  font-size: 24px;
	  	  border-color: #ddd;
	  	  line-height: 90px;
	  	  border-radius: 0px;
	  	  background: rgba(255, 255, 255,.6);
	  	  width: 180px;
	  	  border-width: 0 0 1px;
	  	  border-style: solid;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  cursor: pointer;
	  	  color: inherit;
	  	  object-fit: cover;
	  	  font-size: 24px;
	  	  border-color: #ddd;
	  	  line-height: 90px;
	  	  border-radius: 0px;
	  	  background: rgba(255, 255, 255,.6);
	  	  width: 180px;
	  	  border-width: 0 0 1px;
	  	  border-style: solid;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  cursor: pointer;
	  	  color: inherit;
	  	  object-fit: cover;
	  	  font-size: 24px;
	  	  border-color: #ddd;
	  	  line-height: 90px;
	  	  border-radius: 0px;
	  	  background: rgba(255, 255, 255,.6);
	  	  width: 180px;
	  	  border-width: 0 0 1px;
	  	  border-style: solid;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 1px solid #ddd;
	  	  border-radius: 0px;
	  	  padding: 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: rgba(255, 255, 255,.6);
	  	  width: 500px;
	  	  font-size: 14px;
	  	  height: 140px;
	  	}
	
	.add-update-preview .btn .btn1 {
				cursor: pointer;
				padding: 0 0 6px;
				margin: 0px 10px;
				color: inherit;
				display: inline-block;
				font-size: 16px;
				border-color: #eee;
				line-height: auto;
				border-radius: 0px;
				outline: none;
				background: none;
				width: auto;
				border-width: 0 0 1px;
				border-style: solid;
				height: auto;
			}
	
	.add-update-preview .btn .btn1:hover {
				color: #666;
				background: rgba(255,255,255,1);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn2 {
				border: 0px solid rgba(19,161,230,.2);
				cursor: pointer;
				padding: 0 0 6px;
				margin: 0px 10px;
				color: inherit;
				font-size: 16px;
				border-color: #eee;
				line-height: auto;
				border-radius: 0px;
				outline: none;
				background: none;
				width: auto;
				border-width: 0 0 1px;
				border-style: solid;
				height: auto;
			}
	
	.add-update-preview .btn .btn2:hover {
				color: #666;
				background: #fff;
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn3 {
				cursor: pointer;
				padding: 0 0 6px;
				margin: 0px 10px;
				color: inherit;
				font-size: 16px;
				border-color: #eee;
				line-height: auto;
				border-radius: 0px;
				outline: none;
				background: none;
				width: auto;
				border-width: 0 0 1px;
				border-style: solid;
				height: auto;
			}
	
	.add-update-preview .btn .btn3:hover {
				color: #666;
				background: #fff;
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn4 {
				cursor: pointer;
				padding: 0 0 6px;
				margin: 0px 10px;
				color: inherit;
				font-size: 16px;
				border-color: #eee;
				line-height: auto;
				border-radius: 0px;
				outline: none;
				background: none;
				width: auto;
				border-width: 0 0 1px;
				border-style: solid;
				height: auto;
			}
	
	.add-update-preview .btn .btn4:hover {
				color: #666;
				background: #fff;
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn5 {
				cursor: pointer;
				padding: 0 0 6px;
				margin: 0 10px;
				color: inherit;
				font-size: 16px;
				border-color: #eee;
				line-height: auto;
				border-radius: 0px;
				outline: none;
				background: none;
				width: auto;
				border-width: 0 0 1px;
				border-style: solid;
				height: auto;
			}
	
	.add-update-preview .btn .btn5:hover {
				color: #666;
				background: #fff;
				opacity: 0.8;
			}
</style>
