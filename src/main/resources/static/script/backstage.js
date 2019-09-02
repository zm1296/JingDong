$(function () {
    // var left_porsition;//显示当前的位置
    //首页 被按下
    $("#home").click(function () {//用来测试
        window.location.reload();

    })
    //商品种类管理--一级商品种类管理
    $("#produce_kind_first_manage").click(function () {
        // var $first_manage=$('<span id="home"<a href="#" >一级商品种类管理</a> &nbsp/ &nbsp</span>');
        // $("#home").after($first_manage);
        display_none_all_table();
        $("#disp_pro_manage1").css("display","inline");
        $("#disp_pro_manage1 tbody tr").remove();
         $.ajax({
             url: "http://127.0.0.1:8080/backstage_getBigClass",
             type: "post",
             dataType: "json",
             success: function (data) {
                 for (var i = 0; i < data.length; i++) {
                     var $one = $("<tr><td>" + data[i].id + "</td><td>" + data[i].name + "</td><td>暂无描述</td><td><a class='revise_bigclass' href='#'>修改</a>|<a class='del_bigclass' href='#'>删除</a></td></tr>");
                     $("#disp_pro_manage1 tbody").append($one);
                 }
                 $(".del_bigclass").click(function () {  //新增加的项目中的 删除 已经好使了
                    $.ajax({
                        url:"http://127.0.0.1:8080/backstage_del_firstBigClass",
                        type:"post",
                        dataType:"json",
                        data:{
                            //大类id是小类的外键。所以如果有被当外键的就不能删除
                            del:$(this).parent().prev().prev().prev().text(),
                        },
                        success: function (data) {
                            if(data==true){
                                alert("删除成功")
                            }else{
                                alert("删除失败，仍有其中小类")
                            }
                        }
                    })
                 });
                 $(".revise_bigclass").click(function () { //新增加的项目中的 修改 不好使***
                     var $rev=$("#disp_pro_add1 tbody tr").clone();
                     $rev.children(":eq(3)").children().click(function () {

                         $(this).parent().prev().prev().prev().children().val("");
                         $(this).parent().prev().prev().children().val("");
                     })
                     $rev.children(":eq(2)").children().click(function () {
                         $.ajax({
                             url:"http://127.0.0.1:8080/backstage_alter_firstBigClass",
                             data:{
                                 id:$(this).parent().prev().prev().children().val(),
                                 name:$(this).parent().prev().children().val(),
                             },
                             success:function (data) {
                                 alert(data);
                                 if(data==1){
                                     alert("数据库中有该数据，已修改完成！")
                                 }else{
                                     alert("数据库中无该数据,无法修改，请到添加页面添加！")
                                 }
                             }
                         })
                     })
                     $("#disp_pro_manage1 tbody").append($rev);
                 })
             }
       })
    });




    //商品种类管理--一级商品种类添加                            成功
    $("#produce_kind_first_add").click(function () {
        // var $first_manage=$('<span id="home"<a href="#" >一级商品种类管理</a> &nbsp/ &nbsp</span>');
        // $("#home").after($first_manage);
        display_none_all_table();
        $("#disp_pro_add1").css("display","inline");
        });
                //一级商品种类添加中 提交数据被按下：
                $("input[name=in1_submit]").click(function () {
                    alert("正在提交");
                    $.ajax({
                        url:"http://127.0.0.1:8080/backstage_add_firstBigClass",
                        type: "post",
                        dataType:"json",
                        data:{
                            id:$("input[name=in1_num]").val(),
                            name:$("input[name=in1_kind]").val(),
                        },
                        success:function (data) {
                            if(data==true){
                                alert("添加成功！")
                            }else{
                                alert("添加失败！")
                            }
                        }
                    })
                })
            //按下 清空重输
          $("input[name=in1_clear]").click(function () {
              $("input[name=in1_num]").val("");
              $("input[name=in1_kind]").val("")
          })

        // window.location.reload();
    //商品种类管理--二级商品种类管理                               未成功
    $("#produce_kind_second_manage").click(function () {
        display_none_all_table();
        $("#disp_pro_manage2").css("display","inline");
        $.ajax({
            url:"http://127.0.0.1:8080/backstage_getSmallClass",
            type:"post",
            dataType:"json",
            success:function (data) {
                var vm=new Vue({
                    el:'#disp_pro_manage2',
                    data:{
                        smallClass:data
                    },
                    methods:{
                        alter :function () {
                            alert("还没做--程序员小哥累了")
                        },
                        del:function (index) {
                            dataType:'jason',
                            $.ajax({
                                url:"http://127.0.0.1:8080/backstage_del_SmallClass",
                                data:{
                                    del:this.smallClass[index].id
                                },
                                success:function (data) {
                                    alert(data);
                                    if(data==false){
                                        alert("删除失败，被设了外键")
                                    }else {
                                        alert("删除成功");
                                        this.smallClass.splice(index,1);
                                    }
                                }
                            })
                        }
                    }
                })
            }
        })
        // window.location.reload();
    });

    //商品种类管理--二级商品种类添加                                --成功
    $("#produce_kind_second_add").click(function () {
        display_none_all_table();
        $("#disp_pro_add2").css("display","inline");
        //一级商品种类添加中 提交数据被按下：
        $("input[name=in2_submit]").click(function () {
            alert("正在提交");
            $.ajax({
                url:"http://127.0.0.1:8080/backstage_add_ProductInfo",
                type: "post",
                dataType:"json",
                data:{
                    id:$("input[name=in2_num]").val(),
                    name:$("input[name=in2_kind]").val(),
                    bigclass_id:$("input[name=in2_bigclass]").val()
                },
                success:function (data) {
                    if(data==true){
                        alert("添加成功！")
                    }else{
                        alert("添加失败！")
                    }
                }
            })
        })
        //按下 清空重输
        $("input[name=in2_clear]").click(function () {
            $("input[name=in2_num]").val("");
            $("input[name=in2_kind]").val("");
            $("input[name=in2_bigclass]").val("");
        })
        // window.location.reload();
    })
    //商品添加
    $("#produce_manage_add").click(function () {
        display_none_all_table();
        $("#disp_produce_add").css("display","inline");
    })         // 添加 提交数据 被按下
                $("input[name=add_pro]").click(function () {
                  $.ajax({
                      url: "http://127.0.0.1:8080/backstage_add_ProductInfo",
                      type: "post",
                      dataType: "json",
                      data: {
                           name: $(this).parent().parent().prev().children(":eq(0)").children().val(),
                          title: $(this).parent().parent().prev().children(":eq(1)").children().val(),
                          min_price: $(this).parent().parent().prev().children(":eq(2)").children().val(),
                          discount: $(this).parent().parent().prev().children(":eq(3)").children().val(),
                          warranty_data: $(this).parent().parent().prev().children(":eq(4)").children().val(),
                          status_id: $(this).parent().parent().prev().children(":eq(5)").children().val(),
                          big: $(this).parent().parent().prev().children(":eq(6)").children().val(),
                          small:$(this).parent().parent().prev().children(":eq(7)").children().val(),
                      },
                      success: function (data) {
                          alert(data);
                      }
                  });
                });
                // 清空  清空重输 被按下
                    $("input[name=clear_pro]").click(function () {
                        alert("清空被按");
                        $(this).parent().parent().prev().children(":eq(0)").children().val("");
                        $(this).parent().parent().prev().children(":eq(1)").children().val("");
                        $(this).parent().parent().prev().children(":eq(2)").children().val("");
                        $(this).parent().parent().prev().children(":eq(3)").children().val("");
                         $(this).parent().parent().prev().children(":eq(4)").children().val("");
                        $(this).parent().parent().prev().children(":eq(5)").children().val("");
                        $(this).parent().parent().prev().children(":eq(6)").children().val("");
                        $(this).parent().parent().prev().children(":eq(7)").children().val("");

                    })
    //商品删除
    $("#produce_manage_del").click(function () {
        display_none_all_table();
        $("#disp_produce_del").css("display","inline");
    })      //提交数据  被按下
            $("input[name=in_del_submit]").click(function () {
                $.ajax({
                    url: "http://127.0.0.1:8080/backstage_del_ProductInfo",
                    type: "post",
                    dataType: "json",
                    data: {
                        del:$("input[name=in_pro_del]").val(),
                    },
                    success: function (data) {
                        alert(data);
                    },
                })
            })
    //商品属性修改
    $("#produce_manage_change").click(function () {
        display_none_all_table();
        $("#disp_produce_alter").css("display","inline");
    })
    $("input[name=alt_product]").click(function () {
    //     alert(  sid_big: $(this).parent().parent().prev().children(":eq(6)").children().val(),
    //         sid_small: $(this).parent().parent().prev().children(":eq(7)").children().val(),
    // )
        $.ajax({
            url: "http://127.0.0.1:8080/backstage_alter_ProductInfo",
            type: "post",
            dataType: "json",
            data: {
                name: $(this).parent().parent().prev().children(":eq(0)").children().val(),
                title: $(this).parent().parent().prev().children(":eq(1)").children().val(),
                min_price: $(this).parent().parent().prev().children(":eq(2)").children().val(),
                discount: $(this).parent().parent().prev().children(":eq(3)").children().val(),
                warranty_data: $(this).parent().parent().prev().children(":eq(4)").children().val(),
                status_id: $(this).parent().parent().prev().children(":eq(5)").children().val(),
                sid_big: $(this).parent().parent().prev().children(":eq(6)").children().val(),
                sid_small: $(this).parent().parent().prev().children(":eq(7)").children().val(),
            },
            success: function (data) {
                alert(data);
            }
        });
    });
    // 清空  清空重输 被按下
    $("input[name=alt_clear]").click(function () {
        alert("清空被按");
        $(this).parent().parent().prev().children(":eq(0)").children().val("");
        $(this).parent().parent().prev().children(":eq(1)").children().val("");
        $(this).parent().parent().prev().children(":eq(2)").children().val("");
        $(this).parent().parent().prev().children(":eq(3)").children().val("");
        $(this).parent().parent().prev().children(":eq(4)").children().val("");
        $(this).parent().parent().prev().children(":eq(5)").children().val("");
        $(this).parent().parent().prev().children(":eq(6)").children().val("");
        $(this).parent().parent().prev().children(":eq(7)").children().val("");

    })
    //商品查询                                                          ***不知道为嘛子对象无法绑定显示。
    $("#produce_manage_select").click(function () {
        display_none_all_table();
        $("#disp_produce_select").css("display", "inline");
        $.ajax({
            url: "http://127.0.0.1:8080/backstage_getAllProductInfo",
            type: "post",
            dataType: "json",
            success: function (data) {
                console.log(data);
                var product_info = new Vue({
                        el:"#disp_produce_select",
                        data:{
                            products:data,
                        },
                    }
                    )
            }
        })
    })
    //订单修改
    $("#order_alter").click(function () {
        display_none_all_table();
        $("#disp_order_alter").css("display","inline");
    })
        $("input[name=change_order]").click(function () {
            alert("修改")
        })
        $("input[name=del_order]").click(function () {
            alert("删除")
        })
        $("input[name=clear_order]").click(function () {
            alert("清空重输")
            $(this).parent().parent().prev().children(":eq(0)").children().val(""),
            $(this).parent().parent().prev().children(":eq(1)").children().val(""),
            $(this).parent().parent().prev().children(":eq(2)").children().val(""),
            $(this).parent().parent().prev().children(":eq(3)").children().val(""),
            $(this).parent().parent().prev().children(":eq(4)").children().val(""),
            $(this).parent().parent().prev().children(":eq(5)").children().val(""),
            $(this).parent().parent().prev().children(":eq(6)").children().val(""),
            $(this).parent().parent().prev().children(":eq(7)").children().val(""),
            $(this).parent().parent().prev().children(":eq(8)").children().val(""),
            $(this).parent().parent().prev().children(":eq(9)").children().val(""),
            $(this).parent().parent().prev().children(":eq(10)").children().val("")
        })
    //订单查询
    $("#order_select").click(function () {
        display_none_all_table();
        $("#disp_order_select").css("display","inline");
        $.ajax({
            url:"http://127.0.0.1:8080/backstage_getAllOrder",
            type:"post",
            dataType:"json",
            success:function (data) {
                var Order_all =new Vue({
                    el:"#disp_order_select",
                    data:{
                        orders:data,
                    }
                })
            }
        })
    })
    //所有用户信息
    $("#user_all").click(function () {
        display_none_all_table();
        $("#disp_user_all").css("display","inline")
        $.ajax({
            url:"http://127.0.0.1:8080/backstage_getAllUser",
            type:"post",
            dataType:"json",
            success:function (data) {
                var User_all =new Vue({
                    el:"#disp_user_all",
                    data:{
                        users:data,
                    }
                })
            }
        })
    })
    //账户信息修改
    $("#user_alter").click(function () {
        display_none_all_table();
        $("#disp_user_alter").css("display","inline");
    })
    //增加账户（测试）
    $("#user_add").click(function () {
        display_none_all_table();
        $("#disp_user_add").css("display","inline");
    })         //按下 清除重输
            $("input[name=add_user_cleaer]").click(function () {
                $(this).parent().parent().prev().children("td").children("input").val("");
            })          //按下 添加数据
/*日期类型未匹配，未解决*/$("input[name=user_add]").click(function () {
                alert("添加");
                $.ajax({
                    url:"http://127.0.0.1:8080/backstage_add_User",
                    type:"post",
                    dataType:"json",
                    data:{
                        id:$(this).parent().parent().prev().children(":eq(0)").children("input").val(),
                        name:$(this).parent().parent().prev().children(":eq(1)").children("input").val(),
                        email:$(this).parent().parent().prev().children(":eq(2)").children("input").val(),
                        phone:$(this).parent().parent().prev().children(":eq(3)").children("input").val(),
                        password:$(this).parent().parent().prev().children(":eq(4)").children("input").val(),
                        idcard:$(this).parent().parent().prev().children(":eq(5)").children("input").val(),
                        birthday:$(this).parent().parent().prev().children(":eq(6)").children("input").val(),
                        sex:$(this).parent().parent().prev().children(":eq(7)").children("input").val(),
                        vip:$(this).parent().parent().prev().children(":eq(8)").children("input").val(),
                        create_date:$(this).parent().parent().prev().children(":eq(9)").children("input").val(),
                        status:$(this).parent().parent().prev().children(":eq(10)").children("input").val(),
                        defaultaddress:$(this).parent().parent().prev().children(":eq(11)").children("input").val(),
                    },
                    success:function (data) {
                        alert(data);
                        if(data==true){
                            alert("插入成功")
                        }else{
                            alert("插入失败")
                        }
                    }
                })
            })


    //注销账户（测试）
    $("#user_del").click(function () {
        display_none_all_table();
        $("#disp_user_del").css("display","inline");
    })
            $("input[name=user_del]").click(function () {
                alert("确定删除？")
               alert( $("input[name=del_user]").val())
                $.ajax({
                    url:"http://127.0.0.1:8080/backstage_del_User",
                    type:"post",
                    dataType:"json",
                    data:{
                        del:$("input[name=del_user]").val()
                    },
                    success:function (data) {
                        alert(data)
                    }
                })
            })
 function display_none_all_table() {
    $("table").css("display","none");
 }
});