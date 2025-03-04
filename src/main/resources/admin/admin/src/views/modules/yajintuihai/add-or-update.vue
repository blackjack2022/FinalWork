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
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'" label="退还编号" prop="tuihaibianhao">
					<el-input v-model="ruleForm.tuihaibianhao" placeholder="退还编号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-else-if="ruleForm.tuihaibianhao" label="退还编号" prop="tuihaibianhao">
					<el-input v-model="ruleForm.tuihaibianhao" placeholder="退还编号" readonly></el-input>
				</el-form-item>
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
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="押金" prop="yajin">
					<el-input-number v-model="ruleForm.yajin" placeholder="押金" :disabled="ro.yajin"></el-input-number>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="押金" prop="yajin">
					<el-input v-model="ruleForm.yajin" placeholder="押金" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="扣除押金" prop="kouchuyajin">
					<el-input-number v-model="ruleForm.kouchuyajin" placeholder="扣除押金" :disabled="ro.kouchuyajin"></el-input-number>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="扣除押金" prop="kouchuyajin">
					<el-input v-model="ruleForm.kouchuyajin" placeholder="扣除押金" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'" label="退还押金" prop="tuihaiyajin">
					<el-input v-model="tuihaiyajin" placeholder="退还押金" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-else-if="ruleForm.tuihaiyajin" label="退还押金" prop="tuihaiyajin">
					<el-input v-model="ruleForm.tuihaiyajin" placeholder="退还押金" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="date" v-if="type!='info'" label="退还日期" prop="tuihairiqi">
					<el-date-picker
						format="yyyy 年 MM 月 dd 日"
						value-format="yyyy-MM-dd"
						v-model="ruleForm.tuihairiqi" 
						type="date"
						:readonly="ro.tuihairiqi"
						placeholder="退还日期"
					></el-date-picker> 
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-else-if="ruleForm.tuihairiqi" label="退还日期" prop="tuihairiqi">
					<el-input v-model="ruleForm.tuihairiqi" placeholder="退还日期" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="账号" prop="zhanghao">
					<el-input v-model="ruleForm.zhanghao" placeholder="账号" clearable  :readonly="ro.zhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="账号" prop="zhanghao">
					<el-input v-model="ruleForm.zhanghao" placeholder="账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="姓名" prop="xingming">
					<el-input v-model="ruleForm.xingming" placeholder="姓名" clearable  :readonly="ro.xingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="姓名" prop="xingming">
					<el-input v-model="ruleForm.xingming" placeholder="姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="手机" prop="shouji">
					<el-input v-model="ruleForm.shouji" placeholder="手机" clearable  :readonly="ro.shouji"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="手机" prop="shouji">
					<el-input v-model="ruleForm.shouji" placeholder="手机" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="身份证" prop="shenfenzheng">
					<el-input v-model="ruleForm.shenfenzheng" placeholder="身份证" clearable  :readonly="ro.shenfenzheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="身份证" prop="shenfenzheng">
					<el-input v-model="ruleForm.shenfenzheng" placeholder="身份证" readonly></el-input>
				</el-form-item>
			</template>
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
	isMobile,
} from "@/utils/validate";
export default {
	data() {
		var validateMobile = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isMobile(value)) {
				callback(new Error("请输入正确的手机号码"));
			} else {
				callback();
			}
		};
		var validateNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isNumber(value)) {
				callback(new Error("请输入数字"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				tuihaibianhao : false,
				chepaihao : false,
				qichexinghao : false,
				fengmian : false,
				yajin : false,
				kouchuyajin : false,
				tuihaiyajin : false,
				tuihairiqi : false,
				zhanghao : false,
				xingming : false,
				shouji : false,
				shenfenzheng : false,
				crossuserid : false,
				crossrefid : false,
				ispay : false,
			},
			
			
			ruleForm: {
				tuihaibianhao: this.getUUID(),
				chepaihao: '',
				qichexinghao: '',
				fengmian: '',
				yajin: '',
				kouchuyajin: '',
				tuihaiyajin: '',
				tuihairiqi: '',
				zhanghao: '',
				xingming: '',
				shouji: '',
				shenfenzheng: '',
				crossuserid: '',
				crossrefid: '',
			},
		

			
			rules: {
				tuihaibianhao: [
				],
				chepaihao: [
				],
				qichexinghao: [
				],
				fengmian: [
				],
				yajin: [
					{ validator: validateNumber, trigger: 'blur' },
				],
				kouchuyajin: [
					{ validator: validateNumber, trigger: 'blur' },
				],
				tuihaiyajin: [
					{ validator: validateNumber, trigger: 'blur' },
				],
				tuihairiqi: [
				],
				zhanghao: [
				],
				xingming: [
				],
				shouji: [
					{ validator: validateMobile, trigger: 'blur' },
				],
				shenfenzheng: [
				],
				crossuserid: [
				],
				crossrefid: [
				],
				ispay: [
				],
			},
		};
	},
	props: ["parent"],
	computed: {
		tuihaiyajin: {
			get: function () {
				return 0+parseFloat(this.ruleForm.yajin==""?0:this.ruleForm.yajin)-parseFloat(this.ruleForm.kouchuyajin==""?0:this.ruleForm.kouchuyajin) || 0
			}
		},



	},
    components: {
    },
	created() {
		this.ruleForm.tuihairiqi = this.getCurDate()
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
						if(o=='tuihaibianhao'){
							this.ruleForm.tuihaibianhao = obj[o];
							this.ro.tuihaibianhao = true;
							continue;
						}
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
						if(o=='fengmian'){
							this.ruleForm.fengmian = obj[o];
							this.ro.fengmian = true;
							continue;
						}
						if(o=='yajin'){
							this.ruleForm.yajin = obj[o];
							this.ro.yajin = true;
							continue;
						}
						if(o=='kouchuyajin'){
							this.ruleForm.kouchuyajin = obj[o];
							this.ro.kouchuyajin = true;
							continue;
						}
						if(o=='tuihaiyajin'){
							this.ruleForm.tuihaiyajin = obj[o];
							this.ro.tuihaiyajin = true;
							continue;
						}
						if(o=='tuihairiqi'){
							this.ruleForm.tuihairiqi = obj[o];
							this.ro.tuihairiqi = true;
							continue;
						}
						if(o=='zhanghao'){
							this.ruleForm.zhanghao = obj[o];
							this.ro.zhanghao = true;
							continue;
						}
						if(o=='xingming'){
							this.ruleForm.xingming = obj[o];
							this.ro.xingming = true;
							continue;
						}
						if(o=='shouji'){
							this.ruleForm.shouji = obj[o];
							this.ro.shouji = true;
							continue;
						}
						if(o=='shenfenzheng'){
							this.ruleForm.shenfenzheng = obj[o];
							this.ro.shenfenzheng = true;
							continue;
						}
						if(o=='crossuserid'){
							this.ruleForm.crossuserid = obj[o];
							this.ro.crossuserid = true;
							continue;
						}
						if(o=='crossrefid'){
							this.ruleForm.crossrefid = obj[o];
							this.ro.crossrefid = true;
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
					if(((json.zhanghao!=''&&json.zhanghao) || json.zhanghao==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.zhanghao = json.zhanghao
						this.ro.zhanghao = true;
					}
					if(((json.xingming!=''&&json.xingming) || json.xingming==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.xingming = json.xingming
						this.ro.xingming = true;
					}
					if(((json.shouji!=''&&json.shouji) || json.shouji==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.shouji = json.shouji
						this.ro.shouji = true;
					}
					if(((json.shenfenzheng!=''&&json.shenfenzheng) || json.shenfenzheng==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.shenfenzheng = json.shenfenzheng
						this.ro.shenfenzheng = true;
					}
				} else {
					this.$message.error(data.msg);
				}
			});
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `yajintuihai/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {
		this.ruleForm.ispay = '未支付'
		if(this.ruleForm.tuihaibianhao) {
			this.ruleForm.tuihaibianhao = String(this.ruleForm.tuihaibianhao)
		}
        this.ruleForm.tuihaiyajin = this.tuihaiyajin
	if(this.ruleForm.fengmian!=null) {
		this.ruleForm.fengmian = this.ruleForm.fengmian.replace(new RegExp(this.$base.url,"g"),"");
	}
      if(parseFloat(this.ruleForm.kouchuyajin)>parseFloat(this.ruleForm.yajin)){
        this.$message.error("扣除押金不能超过押金");
        return
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
					url: "yajintuihai/page", 
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
								url: `yajintuihai/${!this.ruleForm.id ? "save" : "update"}`,
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
											this.parent.yajintuihaiCrossAddOrUpdateFlag = false;
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
				url: `yajintuihai/${!this.ruleForm.id ? "save" : "update"}`,
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
							this.parent.yajintuihaiCrossAddOrUpdateFlag = false;
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
      this.parent.yajintuihaiCrossAddOrUpdateFlag = false;
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
