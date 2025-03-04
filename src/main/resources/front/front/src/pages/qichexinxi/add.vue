<template>
<div :style='{"width":"100%","padding":"30px 7% 40px","margin":"0px auto","position":"relative","background":"#edeff1"}'>
    <el-form
	  :style='{"border":"0px solid #28890b30","width":"100%","padding":"30px","position":"relative","background":"none"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="150px"
    >
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="车牌号" prop="chepaihao">
            <el-input v-model="ruleForm.chepaihao" 
                placeholder="车牌号" clearable :disabled=" false  ||ro.chepaihao"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="电动车型号" prop="qichexinghao">
            <el-input v-model="ruleForm.qichexinghao" 
                placeholder="电动车型号" clearable :disabled=" false  ||ro.qichexinghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}'  label="电动车分类" prop="qichefenlei">
            <el-select v-model="ruleForm.qichefenlei" placeholder="请选择电动车分类" :disabled=" false  ||ro.qichefenlei" >
              <el-option
                  v-for="(item,index) in qichefenleiOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="品牌" prop="pinpai">
            <el-input v-model="ruleForm.pinpai" 
                placeholder="品牌" clearable :disabled=" false  ||ro.pinpai"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="颜色" prop="yanse">
            <el-input v-model="ruleForm.yanse" 
                placeholder="颜色" clearable :disabled=" false  ||ro.yanse"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}'  label="换挡方式" prop="huandangfangshi">
            <el-select v-model="ruleForm.huandangfangshi" placeholder="请选择换挡方式" :disabled=" false  ||ro.huandangfangshi" >
              <el-option
                  v-for="(item,index) in huandangfangshiOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="封面" v-if="type!='cross' || (type=='cross' && !ro.fengmian)" prop="fengmian">
            <file-upload
            tip="点击上传封面"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.fengmian?ruleForm.fengmian:''"
            @change="fengmianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' class="upload" v-else label="封面" prop="fengmian">
                <img v-if="ruleForm.fengmian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.fengmian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.fengmian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}'  label="状态" prop="zhuangtai">
            <el-select v-model="ruleForm.zhuangtai" placeholder="请选择状态" :disabled=" false  ||ro.zhuangtai" >
              <el-option
                  v-for="(item,index) in zhuangtaiOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="租金" prop="zujin">
			<el-input-number v-model="ruleForm.zujin" placeholder="租金" :disabled=" false ||ro.zujin"></el-input-number>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="押金" prop="yajin">
			<el-input-number v-model="ruleForm.yajin" placeholder="押金" :disabled=" false ||ro.yajin"></el-input-number>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="车辆排量" prop="cheliangpailiang">
            <el-input v-model="ruleForm.cheliangpailiang" 
                placeholder="车辆排量" clearable :disabled=" false  ||ro.cheliangpailiang"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="电池规格" prop="youhao">
            <el-input v-model="ruleForm.youhao" 
                placeholder="电池规格" clearable :disabled=" false  ||ro.youhao"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="载重" prop="zaizhong">
            <el-input v-model.number="ruleForm.zaizhong" 
                placeholder="载重" clearable :disabled=" false  ||ro.zaizhong"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="登记日期" prop="dengjiriqi">
              <el-date-picker
				  :disabled=" false  ||ro.dengjiriqi"
                  format="yyyy 年 MM 月 dd 日"
                  value-format="yyyy-MM-dd"
                  v-model="ruleForm.dengjiriqi" 
                  type="date"
                  placeholder="登记日期">
              </el-date-picker> 
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="租赁须知" prop="zulinxuzhi">
            <el-input
              type="textarea"
              :rows="8"
              placeholder="租赁须知"
              v-model="ruleForm.zulinxuzhi">
            </el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="归还标准" prop="guihaibiaozhun">
            <el-input
              type="textarea"
              :rows="8"
              placeholder="归还标准"
              v-model="ruleForm.guihaibiaozhun">
            </el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="车辆详情" prop="cheliangxiangqing">
            <editor 
                :style='{"minHeight":"250px","padding":"0","margin":"0","borderColor":"#1abc9e30","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0px","width":"100%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.cheliangxiangqing" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"10px 0 0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"20px","background":"#3795c4","width":"128px","lineHeight":"44px","fontSize":"16px","height":"44px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid #3795c4","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#3795c4","borderRadius":"30px","background":"none","width":"128px","lineHeight":"44px","fontSize":"16px","height":"44px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
	  let self = this
      return {
        id: '',
        baseUrl: '',
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
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
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
          clicknum: '',
          storeupnum: '',
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
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          yajin: [
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          cheliangpailiang: [
          ],
          youhao: [
          ],
          zaizhong: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
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
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          storeupnum: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
        },
		centerType: false,
      };
    },
    computed: {



    },
    components: {
    },
    created() {
		if(this.$route.query.centerType){
			this.centerType = true
		}
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
      this.ruleForm.dengjiriqi = this.getCurDate()
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
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
              this.ruleForm.fengmian = obj[o].split(",")[0];
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
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
          }
        });
        this.$http.get('option/qichefenlei/qichefenlei', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.qichefenleiOptions = res.data.data;
          }
        });
        this.huandangfangshiOptions = "手动挡,自动挡".split(',')
        this.zhuangtaiOptions = "已租赁,未租赁".split(',')

		if (localStorage.getItem('raffleType') && localStorage.getItem('raffleType') != null) {
			localStorage.removeItem('raffleType')
			setTimeout(() => {
				this.onSubmit()
			}, 300)
		}
      },

    // 多级联动参数
      // 多级联动参数
      info() {
        this.$http.get(`qichexinxi/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {
			//更新跨表属性
			var crossuserid;
			var crossrefid;
			var crossoptnum;
			this.$refs["ruleForm"].validate(valid => {
				if(valid) {
					if(this.type=='cross'){
						var statusColumnName = localStorage.getItem('statusColumnName');
						var statusColumnValue = localStorage.getItem('statusColumnValue');
						if(statusColumnName && statusColumnName!='') {
							var obj = JSON.parse(localStorage.getItem('crossObj'));
							if(!statusColumnName.startsWith("[")) {
								for (var o in obj){
									if(o==statusColumnName){
										obj[o] = statusColumnValue;
									}
								}
								var table = localStorage.getItem('crossTable');
								this.$http.post(table+'/update', obj).then(res => {});
							} else {
								crossuserid=Number(localStorage.getItem('frontUserid'));
								crossrefid=obj['id'];
								crossoptnum=localStorage.getItem('statusColumnName');
								crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
							}
						}
					}
					if(crossrefid && crossuserid) {
						this.ruleForm.crossuserid=crossuserid;
						this.ruleForm.crossrefid=crossrefid;
						var params = {
							page: 1,
							limit: 10,
							crossuserid:crossuserid,
							crossrefid:crossrefid,
						}
						this.$http.get('qichexinxi/list', {
							params: params
						}).then(res => {
							if(res.data.data.total>=crossoptnum) {
								this.$message({
									message: localStorage.getItem('tips'),
									type: 'error',
									duration: 1500,
								});
								return false;
							} else {
								// 跨表计算


								this.$http.post(`qichexinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
									if (res.data.code == 0) {
										this.$message({
											message: '操作成功',
											type: 'success',
											duration: 1500,
											onClose: () => {
												this.$router.go(-1);
											}
										});
									} else {
										this.$message({
											message: res.data.msg,
											type: 'error',
											duration: 1500
										});
									}
								});
							}
						});
					} else {


						this.$http.post(`qichexinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
							if (res.data.code == 0) {
								this.$message({
									message: '操作成功',
									type: 'success',
									duration: 1500,
									onClose: () => {
										this.$router.go(-1);
									}
								});
							} else {
								this.$message({
									message: res.data.msg,
									type: 'error',
									duration: 1500
								});
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
			this.$router.go(-1);
		},
      fengmianUploadChange(fileUrls) {
          this.ruleForm.fengmian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 150px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 150px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  padding: 0 12px;
	  color: #666;
	  font-size: 14px;
	  border-color: #ddd;
	  border-radius: 4px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  background: #fff;
	  width: auto;
	  border-width: 0px;
	  border-style: solid;
	  min-width: 500px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  padding: 0 12px;
	  color: #666;
	  font-size: 14px;
	  border-color: #ddd;
	  border-radius: 4px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  background: #fff;
	  width: auto;
	  border-width: 0px;
	  border-style: solid;
	  min-width: 500px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border-radius: 4px;
	  padding: 0 10px;
	  color: #666;
	  background: #fff;
	  width: auto;
	  font-size: 14px;
	  border-color: #28890b30;
	  border-width: 0px;
	  border-style: solid;
	  min-width: 500px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border-radius: 4px;
	  padding: 0 10px 0 30px;
	  color: #666;
	  background: #fff;
	  width: auto;
	  font-size: 14px;
	  border-color: #28890b30;
	  border-width: 0px;
	  border-style: solid;
	  min-width: 500px;
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
	  color: #333;
	  font-weight: 600;
	  font-size: 24px;
	  border-color: #28890b30;
	  line-height: 80px;
	  border-radius: 4px;
	  background: #fff;
	  width: 80px;
	  border-width: 0px;
	  border-style: solid;
	  text-align: center;
	  height: 80px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  cursor: pointer;
	  color: #333;
	  font-weight: 600;
	  font-size: 24px;
	  border-color: #28890b30;
	  line-height: 80px;
	  border-radius: 4px;
	  background: #fff;
	  width: 80px;
	  border-width: 0px;
	  border-style: solid;
	  text-align: center;
	  height: 80px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  cursor: pointer;
	  color: #333;
	  font-weight: 600;
	  font-size: 24px;
	  border-color: #28890b30;
	  line-height: 80px;
	  border-radius: 4px;
	  background: #fff;
	  width: 80px;
	  border-width: 0px;
	  border-style: solid;
	  text-align: center;
	  height: 80px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 0px solid #eee;
	  border-radius: 0px;
	  padding: 12px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #666;
	  background: #fff;
	  width: auto;
	  font-size: 14px;
	  min-width: 800px;
	  height: 120px;
	}
</style>
