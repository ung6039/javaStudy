/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-05-22 02:35:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/react/0.14.0/react.js\"></script> \r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/react/0.14.0/react-dom.js\"></script> \r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/babel-core/5.8.23/browser.min.js\"></script> \r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://unpkg.com/axios/dist/axios.min.js\"></script> \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"container\" id=\"root\"></div>\r\n");
      out.write("   <script type=\"text/babel\">\r\n");
      out.write("    /*\r\n");
      out.write("         <App name=\"홍길동\"> => new App(\"홍길동\"); => 변경할 수 없다\r\n");
      out.write("         props\r\n");
      out.write("         state : 변경이 가능 \r\n");
      out.write("\r\n");
      out.write("         => <App/>\r\n");
      out.write("            1) constructor() : 초기화 (변수 설정)\r\n");
      out.write("            2) render() : 데이터를 받아서 화면 출력 (HTML)\r\n");
      out.write("            3) componentDidMount() : 완료 => 브라우저에 출력 \r\n");
      out.write("              =====================\r\n");
      out.write("                           완료가 된 다음 => 화면을 변경 ===> render()\r\n");
      out.write("                           ==========\r\n");
      out.write("                                                      리렌더링 => setState()\r\n");
      out.write("\r\n");
      out.write("              function H(){\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              var H=function(){}\r\n");
      out.write("              var H=()=>{}\r\n");
      out.write("    */\r\n");
      out.write("    const H=()=>{\r\n");
      out.write("       const color=['red','green','blue','yellow','pink'];\r\n");
      out.write("       let rand=parseInt(Math.random()*5)\r\n");
      out.write("       let s={\"color\":color[rand]}\r\n");
      out.write("       return (\r\n");
      out.write("          <h1 className=\"text-center\" style={s}>뮤직 Top 200</h1>\r\n");
      out.write("       )\r\n");
      out.write("    }\r\n");
      out.write("    /*const H2=React.memo(()=>{\r\n");
      out.write("       const color=['red','green','blue','yellow','pink'];\r\n");
      out.write("       let rand=parseInt(Math.random()*5)\r\n");
      out.write("       let s={\"color\":color[rand]}\r\n");
      out.write("       return (\r\n");
      out.write("          <h1 className=\"text-center\" style={s}>뮤직 Top 200</h1>\r\n");
      out.write("       )\r\n");
      out.write("    });*/\r\n");
      out.write("    class App extends React.Component{\r\n");
      out.write("        // 생성자 \r\n");
      out.write("        constructor(props){\r\n");
      out.write("           super(props);// 속성값 받기 \r\n");
      out.write("           // 서버에서 들어오는 데이터를 받아서 저장 \r\n");
      out.write("           this.state={\r\n");
      out.write("                music:[],\r\n");
      out.write("                ss:''\r\n");
      out.write("           }\r\n");
      out.write("           // react에서 이벤트 등록 \r\n");
      out.write("           this.handleUserInput=this.handleUserInput.bind(this);\r\n");
      out.write("        }\r\n");
      out.write("        handleUserInput(ss)\r\n");
      out.write("        {\r\n");
      out.write("           this.setState({ss:ss});\r\n");
      out.write("        }\r\n");
      out.write("        componentDidMount()\r\n");
      out.write("        {\r\n");
      out.write("           // 서버연결 \r\n");
      out.write("           axios.get('http://localhost:808/web/main/music.do').then((result)=>{\r\n");
      out.write("                console.log(result.data);\r\n");
      out.write("                // this.state.music=result.data;\r\n");
      out.write("                // setState(){render()}\r\n");
      out.write("                this.setState({music:result.data})\r\n");
      out.write("           })\r\n");
      out.write("        }\r\n");
      out.write("        // 화면 출력 (HTML)\r\n");
      out.write("        render(){\r\n");
      out.write("           return (\r\n");
      out.write("               <div className=\"row\">\r\n");
      out.write("                 <H/>\r\n");
      out.write("                 <SearchBar ss={this.state.ss} onUserInput={this.handleUserInput}/>\r\n");
      out.write("                 <div style={{\"height\":\"30px\"}}></div>\r\n");
      out.write("                 <MusicTable moive={this.state.music} ss={this.state.ss}/>\r\n");
      out.write("                 \r\n");
      out.write("               </div>\r\n");
      out.write("           )\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("    }\r\n");
      out.write("    class MusicTable extends React.Component{\r\n");
      out.write("       render(){\r\n");
      out.write("          let rows=[];\r\n");
      out.write("          // [{title: ,mno:..},{},{},{}...}] => var m={a: , b:} m.a m.b var m=[] => m[0]..\r\n");
      out.write("          this.props.moive.forEach((m,key)=>{\r\n");
      out.write("             if(m.title.indexOf(this.props.ss)===-1)\r\n");
      out.write("             {\r\n");
      out.write("                 return;\r\n");
      out.write("             }\r\n");
      out.write("             rows.push(<MusicRow music={m}/>)\r\n");
      out.write("          })\r\n");
      out.write("          return (\r\n");
      out.write("              <table className=\"table\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                  <tr className=\"danger\">\r\n");
      out.write("                   <th className=\"text-center\">순위</th>\r\n");
      out.write("                   <th className=\"text-center\">등폭</th>\r\n");
      out.write("                   <th className=\"text-center\"></th>\r\n");
      out.write("                   <th className=\"text-center\">노래명</th>\r\n");
      out.write("                   <th className=\"text-center\">가수명</th>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                  {rows}\r\n");
      out.write("                </tbody>\r\n");
      out.write("              </table>\r\n");
      out.write("          )\r\n");
      out.write("       }\r\n");
      out.write("    }\r\n");
      out.write("    class MusicRow extends React.Component{\r\n");
      out.write("          render()\r\n");
      out.write("          {\r\n");
      out.write("              return (\r\n");
      out.write("                 <tr>\r\n");
      out.write("                   <td className=\"text-center\">{this.props.music.mno}</td>\r\n");
      out.write("                   <td className=\"text-center\">\r\n");
      out.write("                      {/* 다중 조건문 */}\r\n");
      out.write("                      {\r\n");
      out.write("                          this.props.music.state===\"상승\" &&\r\n");
      out.write("                          <span style={{\"color\":\"red\"}}>▲{this.props.music.idcrement}</span>\r\n");
      out.write("                      }\r\n");
      out.write("                      {\r\n");
      out.write("                          this.props.music.state===\"하강\" &&\r\n");
      out.write("                          <span style={{\"color\":\"blue\"}}>▼{this.props.music.idcrement}</span>\r\n");
      out.write("                      }\r\n");
      out.write("                      {\r\n");
      out.write("                          this.props.music.state===\"유지\" &&\r\n");
      out.write("                          <span style={{\"color\":\"gray\"}}>-</span>\r\n");
      out.write("                      }\r\n");
      out.write("                   </td>\r\n");
      out.write("                   <td className=\"text-center\">\r\n");
      out.write("                      <img src={this.props.music.poster} width=\"30\" height=\"30\"/>\r\n");
      out.write("                   </td>\r\n");
      out.write("                   <td><a href={\"detail.do?mno=\"+this.props.music.mno}>{this.props.music.title}</a></td>\r\n");
      out.write("                   <td>{this.props.music.singer}</td>\r\n");
      out.write("                 </tr>\r\n");
      out.write("              )\r\n");
      out.write("          }\r\n");
      out.write("    }\r\n");
      out.write("    class SearchBar extends React.Component{\r\n");
      out.write("         constructor(props)\r\n");
      out.write("         {\r\n");
      out.write("              super(props);\r\n");
      out.write("              this.onChange=this.onChange.bind(this);\r\n");
      out.write("         }\r\n");
      out.write("         onChange(e)\r\n");
      out.write("         {\r\n");
      out.write("             this.props.onUserInput(e.target.value);\r\n");
      out.write("         }\r\n");
      out.write("         render(){\r\n");
      out.write("            return(\r\n");
      out.write("\t\t<input type=\"text\" size=\"30\" className=\"input-sm\" placeholder=\"검색\"\r\n");
      out.write("                 value={this.props.ss} OnChange={this.OnChange}\r\n");
      out.write("              />\r\n");
      out.write("            )\r\n");
      out.write("         }\r\n");
      out.write("    }\r\n");
      out.write("    ReactDOM.render(<App/>,document.getElementById('root'));\r\n");
      out.write("    // String data=new App().render() ==> $('root').html(data)\r\n");
      out.write("   </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
