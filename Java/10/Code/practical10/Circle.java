import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        debugShowCheckedModeBanner: false,
        title: 'Books',
        home: SearchPage()
    );

  }
}

class SearchPage extends StatefulWidget {
  SearchPage({Key? key}) : super(key: key);

  @override
  State<SearchPage> createState() => _SearchPageState();
}

class _SearchPageState extends State<SearchPage> {
  var star1 = false;

  var star2 = false;

  var star3 = false;

  var star4 = false;

  var star5 = false;

  @override
  Widget build(BuildContext context) {
    var width = MediaQuery.of(context).size.width;
    var height = MediaQuery.of(context).size.height;
    return Scaffold(


      backgroundColor: Color(0xffCDE3F1),
      body: Container(
        child: Stack(
          children: [
            Column(
              children: [
                Padding(
                  padding: EdgeInsets.only(
                      top: height * 0, left: width * 0.05),
                  child: SizedBox(
                    height: height * 0.045,
                    child: Row(
                      children: [
                        SizedBox(width: width * 0.02),
                      ],
                    ),
                  ),
                ),
                Padding(
                  padding: EdgeInsets.only(left: width * 0.2,top:
                  height*0.05,right:width*0.2),
                  child: Container(
                    color: Colors.white,
                  ),
                ),
                Padding(
                  padding: EdgeInsets.only(left:
                  width*0.05,right: width*0.05),
                  child: Column(
                    children: [
                      Row(
                        children: [
                          Container(
                            height: height*0.798,
                            width: width*0.9,
                            color: Color(0xffffCDE3F1),
                            child: Column(
                              children: [
                                Row(
                                  children: [
                                    Container(
                                      child: Column(
                                        crossAxisAlignment: CrossAxisAlignment.start,
                                        mainAxisAlignment: MainAxisAlignment.start,
                                        children: [
                                          ClipRRect(
                                            borderRadius: BorderRadius.circular(height*0.02),
                                            child: Image(image: AssetImage("asset/book3.png"),
                                              height: height*0.28, width: width*0.4,),
                                          ),
                                        ],
                                      ),
                                    ),
                                    Expanded(child: Container()),

                                    Container(
                                      child: Column(
                                        mainAxisAlignment: MainAxisAlignment.start,
                                        crossAxisAlignment: CrossAxisAlignment.start,
                                        children: [

                                          Padding(
                                            padding: EdgeInsets.only(top: height*0,right: width*0.05),
                                            child: Text('Things no one else can teach us',style: TextStyle( fontSize: 25),),
                                          ),Padding(
                                            padding: EdgeInsets.only(right: width*0.05),
                                            child:  Text('Humble the poet',style: TextStyle(color: Color(0xff9A9A9A,), fontSize: 15),),
                                          ),
                                        ],
                                      ),
                                    ),
                                  ],
                                ),
                                SizedBox(height: height*0.01,),
                                Row(
                                  children: [
                                    Container(
                                      child: Column(
                                        crossAxisAlignment: CrossAxisAlignment.start,
                                        mainAxisAlignment: MainAxisAlignment.start,
                                        children: [
                                          Padding(
                                            padding: EdgeInsets.only(left: width*0.02),
                                            child: Text('4.2',),
                                          ),Padding(
                                            padding: EdgeInsets.only(left: width*0.02),
                                            child:  Text('Rating',style: TextStyle(color: Color(0xff9A9A9A,), fontSize: 11),),
                                          ),
                                        ],
                                      ),
                                    ),
                                    Expanded(child: Container()),
                                    Container(
                                      child: Column(
                                        mainAxisAlignment: MainAxisAlignment.start,
                                        crossAxisAlignment: CrossAxisAlignment.start,
                                        children: [
                                          Padding(
                                            padding: EdgeInsets.only(top: height*0.01,left: width*0.02),
                                            child: FittedBox(
                                              child: Text('256',
                                                overflow: TextOverflow.ellipsis,
                                              ),
                                            ),
                                          ),
                                          Padding(
                                            padding: EdgeInsets.only(left: width*0.02),
                                            child:  Text('Pages',style: TextStyle(color: Color(0xff9A9A9A,), fontSize: 11),),
                                          ),
                                        ],
                                      ),
                                    ),

                                    Expanded(child: Container()),
                                    Container(
                                      child: Column(
                                        mainAxisAlignment: MainAxisAlignment.start,
                                        crossAxisAlignment: CrossAxisAlignment.start,
                                        children: [
                                          Padding(
                                            padding: EdgeInsets.only(top: height*0.01,left: width*0.02),
                                            child: FittedBox(
                                              child: Text('English',
                                                overflow: TextOverflow.ellipsis,
                                              ),
                                            ),
                                          ),
                                          Padding(
                                            padding: EdgeInsets.only(left: width*0.02),
                                            child:  Text('Language',style: TextStyle(color: Color(0xff9A9A9A,), fontSize: 11),),
                                          ),
                                        ],
                                      ),
                                    ),
                                  ],
                                ),
                                Row(
                                  children: [
                                    Container(
                                      child: Column(
                                        crossAxisAlignment: CrossAxisAlignment.start,
                                        mainAxisAlignment: MainAxisAlignment.start,
                                        children: [
                                          Padding(
                                            padding: EdgeInsets.only(top: height*0.05,left: width*0.02),
                                            child: Text('About The Book',),
                                          ),Padding(
                                            padding: EdgeInsets.only(left: width*0.02),
                                            child:  Expanded(
                                                child: Text('HUMBLE THE POET, AKA KANWER SINGH, is a Canadian-born rapper, spokenword artist, poet, international bestselling author, and former elementary school teacher with a wildly popular blog of over 100, 000 monthly readers. He has over 930, 000 social media followers and his first book, Unlearn, is a Globe & Mail bestseller in Canada. He has performed at concerts and festivals including Lollapalooza and been featured in major media including Buzzfeed and Huffington Post. --This text refers to an alternate kindle_edition edition.',overflow: TextOverflow.clip, style: TextStyle(color: Color(0xff9A9A9A,), fontSize: 15),)),
                                          ),
                                        ],
                                      ),
                                    ),
                                  ],
                                ),
                                //RATING
                                Row(
                                  children: [
                                    Container(
                                      child: Column(
                                        crossAxisAlignment: CrossAxisAlignment.start,
                                        mainAxisAlignment: MainAxisAlignment.start,
                                        children: [
                                          Padding(
                                            padding: EdgeInsets.only(top: height*0.05,left: width*0.02),
                                            child: Text('Rate This Book:'),
                                          ),
                                          Padding(
                                            padding: EdgeInsets.only(top: height*0.02,left: width*0.05),
                                            child: Row(
                                              children: [
                                                InkWell(
                                                    onTap : (){

                                                      setState(() {
                                                        if(star1 == true){
                                                          star2 = false;
                                                          star3 = false;
                                                          star4 = false;
                                                          star5 = false;
                                                        }
                                                        star1 = !star1;
                                                      });
                                                    },
                                                    child: Icon(star1 ? Icons.star : Icons.star_border, size: 32,)),
                                                SizedBox(width: width*0.02,),
                                                InkWell(
                                                    onTap : (){

                                                      setState(() {
                                                        if(star2 == true){
                                                          star3 = false;
                                                          star4 = false;
                                                          star5 = false;
                                                        }
                                                        star1 = !star2;
                                                        star2 = !star2;
                                                      });
                                                    },
                                                    child: Icon(star2 ? Icons.star : Icons.star_border, size: 32,)),
                                                SizedBox(width: width*0.02,),
                                                InkWell(
                                                    onTap : (){

                                                      setState(() {
                                                        if(star3 == true){
                                                          star4 = false;
                                                          star5 = false;

                                                        }
                                                        star1 = !star3;
                                                        star2 = !star3;
                                                        star3 = !star3;
                                                      });
                                                    },
                                                    child: Icon(star3 ? Icons.star : Icons.star_border, size: 32,)),
                                                SizedBox(width: width*0.02,),
                                                InkWell(
                                                    onTap : (){

                                                      setState(() {
                                                        if(star4 == true)
                                                          star5 = false;
                                                        star1 = !star4;
                                                        star2 = !star4;
                                                        star3 = !star4;
                                                        star4 = !star4;
                                                      });
                                                    },
                                                    child: Icon(star4 ? Icons.star : Icons.star_border, size: 32,)),
                                                SizedBox(width: width*0.02,),
                                                InkWell(
                                                    onTap : (){

                                                      setState(() {
                                                        star1 = !star5;
                                                        star2 = !star5;
                                                        star3 = !star5;
                                                        star4 = !star5;
                                                        star5 = !star5;
                                                      });
                                                    },
                                                    child: Icon(star5 ? Icons.star : Icons.star_border, size: 32,)),

                                              ],
                                            ),
                                          )
                                        ],
                                      ),
                                    ),
                                  ],
                                ),
                                Row(
                                  children: [
                                    Container(
                                      child: Row(
                                        crossAxisAlignment: CrossAxisAlignment.start,
                                        mainAxisAlignment: MainAxisAlignment.start,
                                        children: [
                                          Padding(
                                            padding: EdgeInsets.only(top: height*0.06,left: width*0.02),
                                            child: Text('Price',),
                                          ),Padding(
                                            padding: EdgeInsets.only(top:height*0.065,left: width*0.02),
                                            child:  Text('259/-',style: TextStyle(color: Color(0xff9A9A9A,), fontSize: 11),),
                                          ),
                                        ],
                                      ),
                                    ),
                                    Expanded(child: Container()),
                                  ],
                                ),
                                Padding(
                                  padding: EdgeInsets.only(left: width*0.5),
                                  child: Container(
                                    child: Column(
                                      mainAxisAlignment: MainAxisAlignment.start,
                                      crossAxisAlignment: CrossAxisAlignment.start,
                                      children: [
                                        Padding(
                                          padding: EdgeInsets.only(top: height*0.02,left: width*0.05),
                                          child:SizedBox(
                                              height: 45, width: 120,
                                              child: TextButton(
                                                style: TextButton.styleFrom(
                                                  primary: Colors.blue,
                                                  backgroundColor: Colors.white,
                                                ),
                                                onPressed: () { },
                                                child: Text('Buy Now'),
                                              )
                                          ),
                                        ),
                                      ],
                                    ),
                                  ),
                                )

                              ],
                            ),
                          )
                        ],
                      ),
                    ],
                  ),
                ),
              ],
            ),
          ],
        ),
      ),

    );
  }
}


