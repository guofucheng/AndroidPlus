package com.fc.androidplus.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * All rights Reserved
 *
 * @version V1.0
 * @Package com.fc.androidplus.bean
 * @Description: ${TODO}
 * @author: GFC
 * @date: 2018/3/21 0021  11:43
 * @Copyright: 2018  Inc. All rights reserved.
 */
public class ParaphraseResultBean {

    /**
     * auth_sents_part : {"more":"auth_sents","sent":[{"foreign":"This purchase will <b>account<\/b> for 39.5% of the outstanding shares of the brokerage following the issuance. ","score":0.9831430912017822,"source":"FORBES: <i>JP Morgan Sweetens Deal That Is Still Sour For Bear Investors<\/i>","speech":"This+purchase+will+account+for+39.5%25+of+the+outstanding+shares+of+the+brokerage+following+the+issuance.+","speech-size":"30kb","url":"http://www.forbes.com/2008/03/24/bear-stearns-jpmorgan-markets-equity-cx_po_0324markets06.html"},{"foreign":"Spouse heirs, of course, can still claim the <b>account<\/b> as their own and name new heirs. ","score":0.9831407070159912,"source":"FORBES: <i>IRA Tips and Traps<\/i>","speech":"Spouse+heirs%2C+of+course%2C+can+still+claim+the+account+as+their+own+and+name+new+heirs.+","speech-size":"25kb","url":"http://www.forbes.com/forbes/2001/0611/216.html"},{"foreign":"Best for having your frequent flier <b>account<\/b> balances within easy reach for spontaneous upgrades. ","score":0.9831383228302002,"source":"BBC: <i>Five best air travel apps<\/i>","speech":"Best+for+having+your+frequent+flier+account+balances+within+easy+reach+for+spontaneous+upgrades.+","speech-size":"28kb","url":"http://www.bbc.com/travel/story/20120619-five-best-air-travel-apps"}],"sentence-count":6}
     * blng_sents_part : {"more":"blng_sents","sentence-count":6,"sentence-pair":[{"aligned-words":{"src":{"chars":[{"@e":"4","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"12","@id":"1","@s":"5","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]},"q":[{"@e":"12","@s":"5"}]},{"@e":"32","@id":"2","@s":"13","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"2"}]}}]},"tran":{"chars":[{"@e":"2","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"5","@id":"1","@s":"3","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]}},{"@e":"9","@id":"2","@s":"5","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"2"}]}}]}},"sentence":"His account contradicted itself.","sentence-eng":"His <b>account<\/b> contradicted itself.","sentence-speech":"His+account+contradicted+itself.&le=eng","sentence-translation":"他的解释自相矛盾。","source":"《21世纪大英汉词典》","speech-size":"9kb","url":"http://《21世纪大英汉词典》/"},{"aligned-words":{"src":{"chars":[{"@e":"6","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"14","@id":"1","@s":"7","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]}},{"@e":"23","@id":"2","@s":"15","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"5"}]}},{"@e":"28","@id":"3","@s":"24","aligns":{"sc":[{"@id":"3"}],"tc":[{"@id":"2"}]}},{"@e":"32","@id":"4","@s":"29","aligns":{"sc":[{"@id":"4"}],"tc":[{"@id":"3"}]}},{"@e":"40","@id":"5","@s":"33","aligns":{"sc":[{"@id":"5"}],"tc":[{"@id":"4"}]},"q":[{"@e":"40","@s":"33"}]}]},"tran":{"chars":[{"@e":"3","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"5","@id":"1","@s":"3","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]}},{"@e":"6","@id":"2","@s":"5","aligns":{"sc":[{"@id":"3"}],"tc":[{"@id":"2"}]}},{"@e":"8","@id":"3","@s":"6","aligns":{"sc":[{"@id":"4"}],"tc":[{"@id":"3"}]}},{"@e":"11","@id":"4","@s":"9","aligns":{"sc":[{"@id":"5"}],"tc":[{"@id":"4"}]}},{"@e":"13","@id":"5","@s":"11","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"5"}]}}]}},"sentence":"These figures disagree with our account.","sentence-eng":"These figures disagree with our <b>account<\/b>.","sentence-speech":"These+figures+disagree+with+our+account.&le=eng","sentence-translation":"这些数字与我们的账单不符。","source":"《21世纪大英汉词典》","speech-size":"11kb","url":"http://《21世纪大英汉词典》/"},{"aligned-words":{"src":{"chars":[{"@e":"4","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"},{"@id":"3"}]}},{"@e":"9","@id":"1","@s":"5","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"2"}]}},{"@e":"17","@id":"2","@s":"10","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"8"}]},"q":[{"@e":"17","@s":"10"}]},{"@e":"20","@id":"3","@s":"18","aligns":{"sc":[{"@id":"3"}],"tc":[{"@id":"6"}]}},{"@e":"27","@id":"4","@s":"21","aligns":{"sc":[{"@id":"4"}],"tc":[{"@id":"7"}]}},{"@e":"46","@id":"6","@s":"42","aligns":{"sc":[{"@id":"6"}],"tc":[{"@id":"5"}]}}]},"tran":{"chars":[{"@e":"2","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"},{"@id":"3"}]}},{"@e":"4","@id":"2","@s":"2","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"2"}]}},{"@e":"6","@id":"3","@s":"5","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"},{"@id":"3"}]}},{"@e":"11","@id":"5","@s":"7","aligns":{"sc":[{"@id":"6"}],"tc":[{"@id":"5"}]}},{"@e":"12","@id":"6","@s":"11","aligns":{"sc":[{"@id":"3"}],"tc":[{"@id":"6"}]}},{"@e":"14","@id":"7","@s":"12","aligns":{"sc":[{"@id":"4"}],"tc":[{"@id":"7"}]}},{"@e":"16","@id":"8","@s":"14","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"8"}]}}]}},"sentence":"You must account to father what you have done.","sentence-eng":"You must <b>account<\/b> to father what you have done.","sentence-speech":"You+must+account+to+father+what+you+have+done.&le=eng","sentence-translation":"你必须把你的所作所为对父亲解释清楚。","source":"《21世纪大英汉词典》","speech-size":"13kb","url":"http://《21世纪大英汉词典》/"}]}
     * collins : {"collins_entries":[{"basic_entries":{"basic_entry":[{"cet":"CET4 TEM4","headword":"account","wordforms":{"wordform":[{"word":"accounting"},{"word":"accounted"},{"word":"accounts"}]}}]},"entries":{"entry":[{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"有些银行使开一个账户困难重重。","eng_sent":"Some banks make it difficult to open an account."}]},"pos_entry":{"pos":"N-COUNT","pos_tips":"可数名词"},"tran":"If you have an <b>account<\/b> with a bank or a similar organization, you have an arrangement to leave your money there and take some out when you need it. 账户"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"所有的三家网络代理公司都夸口说他们已赢得了大客户。","eng_sent":"All three Internet agencies boast they've won major accounts."}]},"pos_entry":{"pos":"N-COUNT","pos_tips":"可数名词"},"prof":"商业","tran":"In business, a regular customer of a company can be referred to as an <b>account<\/b>, especially when the customer is another company. 客户"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"他保存了详细的账目。","eng_sent":"He kept detailed accounts."}]},"pos_entry":{"pos":"N-COUNT","pos_tips":"可数名词"},"prof":"商业","tran":"<b>Accounts<\/b> are detailed records of all the money that a person or business receives and spends. 账目"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"他对那个决定命运的夜晚所发生的事情做了一个详细的报道。","eng_sent":"He gave a detailed account of what happened on the fateful night."}]},"pos_entry":{"pos":"N-COUNT","pos_tips":"可数名词"},"tran":"An <b>account<\/b> is a written or spoken report of something that has happened. 报道"}]},{"tran_entry":[{"seeAlsos":{"seeAlso":[{"seeword":"accounting"},{"seeword":"bank account"},{"seeword":"checking account"},{"seeword":"deposit account"}],"seealso":"see also"}}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"据说，他是一名优秀的教师。","eng_sent":"He is, by all accounts, a superb teacher."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you say that something is true <b>by all accounts<\/b> or <b>from all accounts<\/b>, you believe it is true because other people say so. 据说"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"这些无名的组织在国内或国际政治中都是无足轻重的。","eng_sent":"These obscure groups were of little account in either national or international politics."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"registr":"正式","tran":"If you say that something is <b>of no account<\/b> or <b>of little account<\/b>, you mean that it is very unimportant and is not worth considering. 无足轻重的"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"在对他的债务做最后的评估期间，他被命令先付这家公司50万美元。","eng_sent":"He was ordered to pay the company $500,000 on account pending a final assessment of his liability."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you buy or pay for something <b>on account<\/b>, you pay nothing or only part of the cost at first, and pay the rest later. 以赊账方式"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"那位总统由于嗓子疼拒绝亲自发表演讲。","eng_sent":"The president declined to deliver the speech himself, on account of a sore throat."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"You use <b>on account of<\/b> to introduce the reason or explanation for something. 由于"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"莫丽告诉了我她做过的事情，我真为她感到害怕。","eng_sent":"Mollie told me what she'd done and I was really scared on her account."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"Your feelings <b>on<\/b> someone's <b>account<\/b> are the feelings you have about what they have experienced or might experience, especially when you imagine yourself to be in their situation. 为 (某人的) 缘故 (而感到\u2026)"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"不要因为我而离开。","eng_sent":"Don't leave on my account."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"registr":"口语","tran":"If you tell someone not to do something <b>on<\/b> your <b>account<\/b>, you mean that they should do it only if they want to, and not because they think it will please you. (不) 为 (某人的) 缘故 (而做某事)"}]},{"tran_entry":[{"box_extra":"强调","exam_sents":{"sent":[{"chn_sent":"这种混合物绝对不应当接近沸点。","eng_sent":"On no account should the mixture come near boiling."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you say that something should <b>on no account<\/b> be done, you are emphasizing that it should not be done under any circumstances. 绝对不"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"我告诉他，如果他退出那么他要自负其则。","eng_sent":"I told him if he withdrew it was on his own account."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you do something <b>on<\/b> your <b>own account<\/b>, you do it because you want to and without being asked, and you take responsibility for your own action. 随 (某人) 自己"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"该被告请求将21项相似的犯罪罪行考虑在内。","eng_sent":"The defendant asked for 21 similar offences to be taken into account."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you <b>take<\/b> something <b>into account<\/b>, or <b>take account of<\/b> something, you consider it when you are thinking about a situation or deciding what to do. 考虑到"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"反复提供虚假情报的人应为其行为而受到追究。","eng_sent":"Individuals who repeatedly provide false information should be called to account for their actions."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If someone <b>is called, held,<\/b> or <b>brought to account<\/b> for something they have done wrong, they are made to explain why they did it, and are often criticized or punished for it. 追究"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"我们曾经为缺乏准备所阻，但我肯定我们会表现很好的。","eng_sent":"We have been hindered by our lack of preparation, but I'm sure we will give a good account of ourselves."}]},"loc":"英国英语","pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you say that someone <b>gave a good account of<\/b> themselves in a particular situation, you mean that they performed well, although they may not have been completely successful. 表现很好"}]}]},"headword":"account","phonetic":"əˈkaʊnt","star":"5"}]}
     * ec : {"exam_type":["CET6","考研","CET4","IELTS","高中","商务英语","TOEFL"],"source":{"name":"有道词典","url":"http://dict.youdao.com"},"word":[{"return-phrase":{"l":{"i":"account"}},"trs":[{"tr":[{"l":{"i":["n. 账户；解释；账目，账单；理由；描述"]}}]},{"tr":[{"l":{"i":["vi. 解释；导致；报账"]}}]},{"tr":[{"l":{"i":["vt. 认为；把\u2026视为"]}}]}],"ukphone":"ə'kaʊnt","ukspeech":"account&type=1","usphone":"ə'kaʊnt","usspeech":"account&type=2"}]}
     * ec21 : {"source":{"name":"21世纪大英汉词典"},"word":[{"phone":"ə'kaunt","phrs":[{"i":[{"des":{"l":{"i":"＝by all accounts"}},"phr":{"l":{"i":"according to all accounts"}}},{"des":{"l":{"i":"[俚语]＝on account of"}},"phr":{"l":{"i":"account of"}}},{"des":{"l":{"i":"=on all accounts"}},"phr":{"l":{"i":"at all accounts"}}},{"des":{"l":{"i":"与某人结清账目，算账"}},"phr":{"l":{"i":"balance accounts with someone"}}},{"phr":{"l":{"i":"bring to account"}},"tr":[{"l":{"i":"要求\u2026就自己的行为作出解释(或说明、澄清)"}},{"l":{"i":"质问，责问，责骂，斥责，谴责(= call to account)"}}]},{"des":{"l":{"i":"根据各种流传的说法，据各方面所说，据大家所说，人人都这样说；根据报界的报道；一致看法，一致认为"}},"phr":{"l":{"i":"by (或from)all accounts"}}},{"des":{"l":{"i":"据某人自己说"}},"phr":{"l":{"i":"by one's own account"}}},{"phr":{"l":{"i":"call to account"}},"tr":[{"l":{"i":"要求\u2026就自己的行为作出解释(或说明、澄清)，让作解释(为什么做错事)"}},{"l":{"i":"质问，责问；斥责，谴责；要求\u2026承担责任；惩罚"}}]},{"phr":{"l":{"i":"cast accounts"}},"tr":[{"l":{"i":"算账"}},{"l":{"i":"计算，运算"}}]},{"phr":{"l":{"i":"cast up one's accounts"}},"tr":[{"l":{"i":"[俚语]"}},{"l":{"i":"呕吐"}},{"l":{"i":"提供证词告发同犯"}}]},{"des":{"l":{"i":"把\u2026记入某人账内"}},"phr":{"l":{"i":"charge(或put down)something to somebody's account"}}},{"des":{"l":{"i":"与\u2026结清账目，与\u2026结束账户"}},"phr":{"l":{"i":"close an account(或one's accounts)"}}},{"des":{"l":{"i":"[口语]窜改(或伪造)账目，造假账"}},"phr":{"l":{"i":"cook(或doctor) the accounts"}}},{"des":{"l":{"i":"从\u2026中得益，从中得到好处"}},"phr":{"l":{"i":"find one's account in"}}},{"des":{"l":{"i":"未从中得到好处"}},"phr":{"l":{"i":"find no account in"}}},{"des":{"l":{"i":"【商业】作为\u2026的代销(或账户代理)；算在\u2026的账上，归在\u2026名下"}},"phr":{"l":{"i":"for account of"}}},{"des":{"l":{"i":"＝on one's own account"}},"phr":{"l":{"i":"for one's own account"}}},{"des":{"l":{"i":"＝on somebody's account"}},"phr":{"l":{"i":"for somebody's account"}}},{"des":{"l":{"i":"(证券交易所的交易)有待定期结清"}},"phr":{"l":{"i":"for the account"}}},{"des":{"l":{"i":"作为\u2026风险与共的账户代理[常作证券经纪人、股票掮客用语]"}},"phr":{"l":{"i":"for the account and risk of"}}},{"phr":{"l":{"i":"give a bad account of oneself"}},"tr":[{"l":{"i":"干得很糟糕，显得差劲"}},{"l":{"i":"(在体育比赛中)表现拙劣(或不佳)"}}]},{"phr":{"l":{"i":"give a good account of oneself"}},"tr":[{"l":{"i":"充分证明自己有理"}},{"l":{"i":"表现良好；给人好印象(或好感)；干得出色"}},{"l":{"i":"(在体育比赛中)表现出色，大显身手"}}]},{"des":{"l":{"i":"报告；叙述；说明，解释(理由)"}},"phr":{"l":{"i":"give (或render) an account of"}}},{"phr":{"l":{"i":"give an account of oneself"}},"tr":[{"l":{"i":"使(自己)做出某种表现"}},{"l":{"i":"充分证明自己有理[亦作 give a good account of oneself]"}}]},{"phr":{"l":{"i":"give a poor account of oneself"}},"tr":[{"l":{"i":"干得差劲，表现不好"}},{"l":{"i":"(在体育比赛中)表现拙劣(或不佳)"}}]},{"des":{"l":{"i":"[委婉语]死去"}},"phr":{"l":{"i":"go(或gone,be called,sent) to one's (或last或long) account"}}},{"des":{"l":{"i":"[美国口语]死"}},"phr":{"l":{"i":"hand in one's accounts"}}},{"des":{"l":{"i":"[口语]要跟\u2026算账；与\u2026有不愉快的事要解决，与\u2026有争执要解决"}},"phr":{"l":{"i":"have an account to settle with"}}},{"des":{"l":{"i":"使承担责任"}},"phr":{"l":{"i":"hold to account"}}},{"des":{"l":{"i":"与\u2026有账务来往"}},"phr":{"l":{"i":"in account with"}}},{"des":{"l":{"i":"计较"}},"phr":{"l":{"i":"keep account of"}}},{"des":{"l":{"i":"记账"}},"phr":{"l":{"i":"keep accounts"}}},{"des":{"l":{"i":"记载，记录，把\u2026记下来"}},"phr":{"l":{"i":"keep an account of"}}},{"des":{"l":{"i":"把\u2026计算在内；指望，期望，期待；考虑到"}},"phr":{"l":{"i":"lay one's account with(或on, for)"}}},{"des":{"l":{"i":"对\u2026不予考虑，没考虑到，置之度外，不要计较"}},"phr":{"l":{"i":"leave out of account"}}},{"des":{"l":{"i":"重视"}},"phr":{"l":{"i":"make account of"}}},{"des":{"l":{"i":"对\u2026十分(或不大，完全不)重视"}},"phr":{"l":{"i":"make much(或little, no) account of"}}},{"phr":{"l":{"i":"no account"}},"tr":[{"l":{"i":"[美国英语]"}},{"l":{"i":"无关紧要的；没有价值的；不可取的，不可靠的"}},{"l":{"i":"没有社会地位的人，普通人"}}]},{"des":{"l":{"i":"认为没多少价值，不甚重视"}},"phr":{"l":{"i":"not hold of much account"}}},{"des":{"l":{"i":"决不可以，切莫，绝不要，无论如何不要(＝on no account)"}},"phr":{"l":{"i":"not on any account"}}},{"des":{"l":{"i":"有\u2026重要性"}},"phr":{"l":{"i":"of \u2026 account"}}},{"des":{"l":{"i":"不大重要"}},"phr":{"l":{"i":"of little account"}}},{"des":{"l":{"i":"很重要的；很有价值的；很有意义的；很有威望的"}},"phr":{"l":{"i":"of much(或 great) account"}}},{"des":{"l":{"i":"没有价值的；无意义的；无足轻重的，不重要的"}},"phr":{"l":{"i":"of no account"}}},{"des":{"l":{"i":"不大重要的；没有多大价值的"}},"phr":{"l":{"i":"of small account"}}},{"phr":{"l":{"i":"on account"}},"tr":[{"l":{"i":"作为部分账款；预付[亦作to account]"}},{"l":{"i":"以分期付款方式，以赊账方式，赊账"}},{"l":{"i":"[俚语]＝on account of"}}]},{"des":{"l":{"i":"为了\u2026的缘故；因为，由于[亦作 on account， account of]"}},"phr":{"l":{"i":"on account of"}}},{"des":{"l":{"i":"无论如何"}},"phr":{"l":{"i":"on all accounts(或on every account)"}}},{"des":{"l":{"i":"[一般用于否定句]无论如何，不管怎样，不管怎么说"}},"phr":{"l":{"i":"on any account"}}},{"des":{"l":{"i":"＝on all accounts"}},"phr":{"l":{"i":"on every account"}}},{"des":{"l":{"i":"为了我(或你等)的缘故"}},"phr":{"l":{"i":"on my (或 your, etc.) account"}}},{"des":{"l":{"i":"绝对不，决不可以，绝不要，无论如何不要，切莫"}},"phr":{"l":{"i":"on no account"}}},{"phr":{"l":{"i":"on one's own account"}},"tr":[{"l":{"i":"为自身利益"}},{"l":{"i":"独立地；靠自己的力量"}},{"l":{"i":"在自己承担风险的情况下，自担风险地"}}]},{"des":{"l":{"i":"为了某人的利益；为某人的缘故"}},"phr":{"l":{"i":"on(或for)somebody's account"}}},{"des":{"l":{"i":"由于这个(或那个)缘故"}},"phr":{"l":{"i":"on this (或that) account"}}},{"des":{"l":{"i":"在\u2026开一个账户"}},"phr":{"l":{"i":"open an account with"}}},{"des":{"l":{"i":"让记在自己的账上(暂欠不付)"}},"phr":{"l":{"i":"put something down(或add)to one's account"}}},{"des":{"l":{"i":"＝turn to (good) account"}},"phr":{"l":{"i":"put to(good) account"}}},{"des":{"l":{"i":"开送账单；报账"}},"phr":{"l":{"i":"render(或send in) an account"}}},{"phr":{"l":{"i":"run up an account"}},"tr":[{"l":{"i":"赊欠，挂账"}},{"l":{"i":"负债"}},{"l":{"i":"登账"}}]},{"phr":{"l":{"i":"settle(或balance, square) accounts with somebody"}},"tr":[{"l":{"i":"与某人结清账目"}},{"l":{"i":"[比喻]跟某人算账，向某人作清算；解决与某人的争执"}}]},{"des":{"l":{"i":"[谚语]勤结账，交情长。"}},"phr":{"l":{"i":"Short accounts make long friends."}}},{"des":{"l":{"i":"＝settle accounts with somebody"}},"phr":{"l":{"i":"square accounts with somebody"}}},{"phr":{"l":{"i":"take account of"}},"tr":[{"l":{"i":"注意到，留心"}},{"l":{"i":"考虑到；体谅；估及，顾及；重视；为\u2026留有余地"}}]},{"des":{"l":{"i":"把\u2026列表；把\u2026登账"}},"phr":{"l":{"i":"take an account of"}}},{"des":{"l":{"i":"把\u2026考虑进去，考虑到；体谅；估及，顾及；重视"}},"phr":{"l":{"i":"take into account"}}},{"des":{"l":{"i":"对\u2026不予注意(或重视、考虑)"}},"phr":{"l":{"i":"take no account of"}}},{"des":{"l":{"i":"【宗教】最后审判日"}},"phr":{"l":{"i":"the great account"}}},{"des":{"l":{"i":"作为部分账款；预付"}},"phr":{"l":{"i":"to account"}}},{"des":{"l":{"i":"加以利用；从中获利，从中得益"}},"phr":{"l":{"i":"turn(或put)to (good) account"}}}]}],"return-phrase":{"l":{"i":["account"]}},"trs":[{"pos":"vt.","tr":[{"exam":[{"i":{"f":{"l":{"i":"He was accounted a merciful man."}},"n":{"l":{"i":"他被人看做是一位仁者。"}}}},{"i":{"f":{"l":{"i":"I account myself well paid."}},"n":{"l":{"i":"我认为自己得到优厚报酬。(或：我认为给我的报酬相当好。)"}}}}],"l":{"i":["以为，认为，把\u2026看做，把\u2026视作："]}},{"exam":[{"i":{"f":{"l":{"i":"This report will be accounted by the committee."}},"n":{"l":{"i":"委员会将研究这份报告。"}}}}],"l":{"i":["钻研；分析；探究；考虑："]}},{"exam":[{"i":{"f":{"l":{"i":"She has many virtues accounted to her."}},"n":{"l":{"i":"许多美德集于她一身。"}}}}],"l":{"i":["[罕用语]把\u2026归因于，把\u2026归咎于(to)；把\u2026转嫁于(to):"]}}]},{"pos":"vi.","tr":[{"exam":[{"i":{"f":{"l":{"i":"He could not account for the missing funds."}},"n":{"l":{"i":"他无法说清那些钱怎么不见了。"}}}}],"l":{"i":["(向某人)说明钱的用途，(向某人)提供(钱的)开支情况，报账(for):"]}},{"exam":[{"i":{"f":{"l":{"i":"How do you account for the accident?"}},"n":{"l":{"i":"你怎么解释那场事故?"}}}}],"l":{"i":["说明原因(或理由)，提出理由；是\u2026的原因；做出说明(或解释)，解释(for):"]}},{"exam":[{"i":{"f":{"l":{"i":"His reckless driving accounted for the accident."}},"n":{"l":{"i":"他开车鲁莽，引起了这场事故。"}}}}],"l":{"i":["为\u2026负责；导致，引起(与for连用)："]}},{"exam":[{"i":{"f":{"l":{"i":"He will account for his crime."}},"n":{"l":{"i":"他会赎罪的。"}}}}],"l":{"i":["报偿；赎罪；受罚(for):"]}},{"exam":[{"i":{"f":{"l":{"i":"It accounts for 25 per cent of all traffic accidents."}},"n":{"l":{"i":"它占所有交通事故的25%。"}}}}],"l":{"i":["(在数量、比例方面)占；共计达："]}},{"exam":[{"i":{"f":{"l":{"i":"Our battery accounted for three enemy planes."}},"n":{"l":{"i":"我们炮兵连击落了三架敌机。"}}}}],"l":{"i":["[口语]捕获；杀死，打死，射死，干掉，消灭；击落；俘获(与for连用)："]}},{"l":{"i":["【体育】(在比赛中)击败；击出场(for)"]}}]},{"pos":"n.","tr":[{"l":{"i":["(关于特定事务或事件的口头或笔头的)描述，描写；叙述，记述；报道；记事；故事"]}},{"l":{"i":["报告；(尤指对上级的关于自己行为的)陈述，交代"]}},{"l":{"i":["(对某一事件的起因、理由等所作的)解释，说明；考虑，深思熟虑[主要用于on account of， take into account 等短语中]"]}},{"l":{"i":["原因；理由；根据；基础"]}},{"l":{"i":["价值；重要性"]}},{"l":{"i":["估价，估计；判断"]}},{"l":{"i":["利益，好处；利润"]}},{"l":{"i":["[常用复数]传闻，道听途说[主要用于短语 by (或 from)all accounts 中]"]}},{"l":{"i":["[常用复数](有关资产、负债、收入、支出、资本净值的)账，账目；账单，收付清单"]}},{"l":{"i":["银行往来账(＝bank account)"]}},{"l":{"i":["有关某人(或财产、商业等)财务事项的账目"]}},{"l":{"i":["赊购制，允许储户超支(或客户赊购)的业务关系(＝charge account)"]}},{"l":{"i":["(客户购货的)赊购账；允许超支(或赊购)的款数"]}},{"l":{"i":["(顾客定期赊购的)商号，商行，商店，赊欠户"]}},{"l":{"i":["给予储户(或客户)的超支(或赊购等)的权利"]}},{"l":{"i":["[常用复数]待结账目"]}},{"l":{"i":["(会计年度等的)交易结清单；(伦敦股票交易所两周一次的)定期结清"]}},{"l":{"i":["指定期间的收支平衡"]}},{"l":{"i":["账户；交易(或主顾)关系；客户，委托人"]}},{"l":{"i":["算账"]}},{"l":{"i":["委托的广告业务，顾客给予广告商的广告业务；为对产品进行广告宣传而委托给广告代理商的公司(或个人)，客户"]}},{"l":{"i":["(乐曲的)演奏法，演奏(方式)；(体现对作品特定理解的)表演(方式)"]}},{"l":{"i":["[比喻]欠账"]}},{"l":{"i":["[古语]计算；运算"]}}]}]}]}
     * ee : {"source":{"name":"WordNet","url":"http://wordnet.princeton.edu"},"word":{"phone":"","return-phrase":{"l":{"i":"account"}},"speech":"account","trs":[{"pos":"n.","tr":[{"exam":{"i":{"f":{"l":[{"i":"he asked to see the executive who handled his account"}]}}},"l":{"i":"a formal contractual relationship established to provide for regular banking or brokerage or business services"},"similar-words":[{"similar":"business relationship"}]},{"exam":{"i":{"f":{"l":[{"i":"by all accounts they were a happy couple"}]}}},"l":{"i":"the act of informing by verbal report"},"similar-words":[{"similar":"report"}]},{"exam":{"i":{"f":{"l":[{"i":"he gave an inaccurate account of the plot to kill the president"}]}}},"l":{"i":"a record or narrative description of past events"},"similar-words":[{"similar":"history"},{"similar":"chronicle"},{"similar":"story"}]},{"exam":{"i":{"f":{"l":[{"i":"the account of his speech that was given on the evening news made the governor furious"}]}}},"l":{"i":"a short account of the news"},"similar-words":[{"similar":"report"},{"similar":"news report"},{"similar":"story"},{"similar":"write up"}]},{"exam":{"i":{"f":{"l":[{"i":"they send me an accounting every month"}]}}},"l":{"i":"a statement of recent transactions and the resulting balance"},"similar-words":[{"similar":"accounting"},{"similar":"account statement"}]},{"exam":{"i":{"f":{"l":[{"i":"I expected a brief account"}]}}},"l":{"i":"a statement that makes something comprehensible by describing the relevant structure or operation or circumstances etc."},"similar-words":[{"similar":"explanation"}]},{"exam":{"i":{"f":{"l":[{"i":"send me an account of what I owe"}]}}},"l":{"i":"an itemized statement of money owed for goods shipped or services rendered"},"similar-words":[{"similar":"bill"},{"similar":"invoice"}]},{"exam":{"i":{"f":{"l":[{"i":"don't do it on my account"},{"i":"the paper was rejected on account of its length"}]}}},"l":{"i":"grounds"},"similar-words":[{"similar":"score"}]},{"exam":{"i":{"f":{"l":[{"i":"a person of considerable account"},{"i":"he predicted that although it is of small account now it will rapidly increase in importance"}]}}},"l":{"i":"importance or value"}},{"exam":{"i":{"f":{"l":[{"i":"she turned her writing skills to good account"}]}}},"l":{"i":"the quality of taking advantage"}}]},{"pos":"v.","tr":[{"exam":{"i":{"f":{"l":[{"i":"Passing grades account for half of the grades given in this exam"}]}}},"l":{"i":"be the sole or primary factor in the existence, acquisition, supply, or disposal of something"}},{"l":{"i":"keep an account of"},"similar-words":[{"similar":"calculate"}]},{"l":{"i":"to give an account or representation of in words"},"similar-words":[{"similar":"report"},{"similar":"describe"}]},{"exam":{"i":{"f":{"l":[{"i":"I can't account for the missing money"}]}}},"l":{"i":"furnish a justifying analysis or explanation"},"similar-words":[{"similar":"answer for"}]}]}]}}
     * etym : {"etyms":{"en":[{"desc":"(n.)","source":"etymonline","url":"http://www.etymonline.com","value":"c. 1300, \"counting,\" especially \"reckoning of money received and paid, detailed statement of funds owed or spent or property held,\" from Old French acont \"(financial) account, reckoning, terminal payment,\" from a \"to\" (see ad-) + cont \"counting, reckoning of money to be paid,\" from Late Latin computus \"a calculation,\" from Latin computare \"calculate\" (see compute).\n\nFrom the first often in plural form; sometimes in late Middle English accompt (see account (v.)). Meaning \"course of business dealings requiring records\" is from 1640s; hence \"arrangement to keep money in a business, bank, etc.\" (1833), also \"customer or client having an account\" (1937). Money of account (1690s), that used in reckoning but not circulating as coin or paper, preserves the \"counting\" sense of the word.\n\nFrom the notion of \"rendering an account\" comes the sense \"statement answering for conduct\" (mid-14c.) and the general sense \"narration, recital of facts,\" attested by 1610s. Phrase by all accounts is attested from 1798. From the notion of \"statement of reasons\" comes on no account \"under no circumstances\" (1704). Also from c. 1300 in reference to answering for one's conduct, especially at the Last Judgment. Meaning \"estimation, consideration,\" especially in the eyes of others, is from late 14c. \n\nOn account in the financial sense \"as an item to be accounted for at the final settlement\" is from 1610s, hence on account of in the general sense \"for the sake of, in regard to, in consideration of\" (1640s, originally upon account of). Also on (my, your, etc.) account \"on (one's) behalf.\" To give accounts \"prepare or present a statement of funds and property\" is from mid-15c; the older term was cast accounts (mid-14c.); to take account of originally was to make an inventory; take into account \"take account of\" is from 1680s.\n\nThe spellings accompt, accomptable, etc. are artificial forms used, not prevailingly, in the sixteenth and seventeenth centuries. They are now obsolete, or nearly so, though accompt and accomptant may still be used in the formal or legal style. The pronunciation has always conformed to the regular spelling, account, accountable, etc. [Century Dictionary]\n","word":"account"},{"desc":"(v.)","source":"etymonline","url":"http://www.etymonline.com","value":"c. 1300, \"to count, enumerate,\" from Old French aconter \"to enumerate; reckon up, render account\" (Modern French conter), from a \"to\" (see ad-) + conter \"to count, tell\" (see count (v.)).\n\nMeaning \"to reckon for money given or received, render a reckoning,\" is from late 14c. Sense of \"to explain, justify\" (c. 1300) is from notion of \"present a detailed explanation of money, etc. held in trust.\" Transferred sense of \"to value, to estimate\" (to account as belonging to a certain class of quality) is from late 14c. Intransitive sense of \"to render an account of particulars\" is from late 14c.; hence transitive sense \"give an explanation\" (1670s, usually with to before a person and for before a thing).\n\nIn later Old French partly re-Latinized as acompter (Modern French accompter), hence late Middle English accompten. Related: Accounted; accounting.","word":"account"},{"desc":"","source":"youdict","url":"http://www.youdict.com/etym/","value":"account: [14] Account is of Old French origin. It was formed from compter, conter \u2018count\u2019 (which derived from Latin computāre) and the prefix a-. Its original meaning in English, too, was \u2018count\u2019 or \u2018count up\u2019; this had disappeared by the end of the 18th century, but its specialized reference to the keeping of financial records is of equal antiquity. Account for, meaning \u2018explain\u2019, arose in the mid 18th century.=> count","word":"account"},{"desc":"(v.)","source":"youdict","url":"http://www.youdict.com/etym/","value":"c. 1300, \"to count, enumerate,\" from Old French aconter \"to count, render account\" (Modern French conter), from a \"to\" (see ad-) + conter \"to count, tell\" (see count (v.)). Meaning \"to reckon for money given or received, render a reckoning,\" is from late 14c.; sense of \"to explain\" (c. 1710) is from notion of \"answer for money held in trust.\" Transferred sense of \"value\" is from late 14c. Related: Accounted; accounting.","word":"account"}],"zh":[{"desc":"帐目","source":"童理民","url":"","value":"来自法语，来自于拉丁语compute,来自于词根put,思考，计算。","word":"account"},{"desc":"账目，账户；说明，叙述","source":"童理民","url":"","value":"词根词缀：ac-加强意义 + -count-计算,讲故事 →账目/说明","word":"account"}]},"word":"account"}
     * exam_dict : {"exam_type":["CET6","考研","CET4","IELTS","高中","商务英语","TOEFL"],"exams":[{"books":[{"book_name":"新东方·六级词汇词根+联想记忆法","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"[ə'kaunt]","phrases":[{"content":[{"phrase":"<b>account<\/b> for 解释， 说明； 占有； on <b>account<\/b> of 由于， 为了\u2026； on no <b>account<\/b> 决不可以， 无论如何也不"}],"name":"常考词组"}],"regular":false,"related":[],"remember":[{"content":" ac(表加强) ＋ count(数) → 账目需要一数再数， 保证正确 → 账目","name":"联想记忆"}],"sentences":[{"content":[{"eng":"Foreign sales <b>accounted<\/b> for 65 percent of Coke\u2019s beverage business. (2008. 6) 可口可乐公司在海外的销售量占饮料业务总量的65%。"}],"name":"例句"}],"star":false,"translation":[{"examples":[],"occured":false,"tran":"n. 记述； 解释； 账目 vi. 说明\u2026的原因； (在数量、 比例方面)占\u2026"}],"word":"account"}}],"category":"CET6"},{"books":[{"book_name":"新东方·考研英语词汇词根+联想记忆法","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"[ə'kaunt]","phrases":[{"content":[{"phrase":"on <b>account<\/b> 赊账; on one\u2019s own <b>account<\/b> 依靠自己I have had everything ready for starting business on my own <b>account<\/b>. 我已为自己独立经营作好了一切准备。"}],"name":"常考词组"},{"content":[{"phrase":"give sb. an <b>account<\/b> of 说明， 解释(理由)； on <b>account<\/b> of 因为， 由于 Harry got angry on <b>account<\/b> of my self-indulgence. 哈里被我的任性和放纵惹怒了。// take...into <b>account<\/b> 考虑 You should take Bob\u2019s inexperience into <b>account<\/b> and forgive him. 考虑到鲍勃没有经验， 你应该原谅他。// on any <b>account<\/b> 无论如何 Emily won\u2019t marry the rich old man on any <b>account<\/b>. 埃米莉无论如何也不会嫁给那个有钱的老头。"}],"name":"常考词组"},{"content":[{"phrase":"<b>account<\/b> for 说明(原因等) Nick <b>accounted<\/b> for his not having come as usual to see his grandpa. 尼克说明了为什么没有像往常一样来看爷爷。"}],"name":"常考词组"}],"regular":false,"related":[{"content":[{"text":"accountability(n. 可说明性； 有责任)"}],"name":"派生词"}],"remember":[{"content":" ac(表加强)+count(计算)→算账→账目","name":"联想记忆"}],"sentences":[],"star":true,"translation":[{"examples":[],"occured":false,"tran":"n. ① 账目； 账户 keep <b>accounts<\/b> 记账 // I have made several withdrawals from my bank <b>account<\/b>. 我从银行账户上提了几次款。"},{"examples":[],"occured":false,"tran":"n. ② 叙述， 说明 a first-hand <b>account<\/b> 第一手报道"},{"examples":[],"occured":false,"tran":"vi. ① 说明， 解释 How do you <b>account<\/b> for losing five games in a row? 你怎么解释一连输了五场比赛呢？"},{"examples":[],"occured":false,"tran":"vi. ② (for) (在数量、 比例方面)占 Multinational cor-porations <b>accounted<\/b> for less than 20% of international trade in 1982. 1982年跨国公司在国际贸易中所占的比重低于20％。"},{"examples":[],"occured":false,"tran":"vi. ③ (for)导致， 引起 The drought <b>accounted<\/b> for the poor harvest. 干旱导致歉收。"}],"word":"account"}}],"category":"考研"},{"books":[{"book_name":"新东方·四级词汇词根+联想记忆法","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[{"content":[{"analysis":"选A。句意： 我想先考虑他与社区其他农民和商人交往的信誉， 之后再决定是否同意为他提供贷款。account for： 解释； make up for： 补偿； make out： 开出， 写出。","problem":"I\u2019d ______ his reputation with other farmers and business people in the community, and then make a decision about whether or not to approve a loan. (2000.1)\r\nA) take into account   B) account for\r\nC) make up for             D) make out"}],"name":"真题解析"}],"phonetic":"[ə'kaunt]","phrases":[{"content":[{"phrase":"<b>account<\/b> for 解释， 说明； 占有； on <b>account<\/b> of 由于， 为了\u2026； on no <b>account<\/b> 决不可以， 无论如何也不； take <b>account<\/b> of 考虑到， 顾及， 体谅； take into <b>account<\/b> 考虑到； 注意， 重视； of no <b>account<\/b> 不重要的"}],"name":"常考词组"}],"regular":false,"related":[],"remember":[{"content":" ac(表加强) ＋ count(数) → 账目需要一数再数， 保证正确 → 账目","name":"联想记忆"}],"sentences":[],"star":false,"translation":[{"examples":[],"occured":false,"tran":"n. 记述； 解释； 账目 vi. 说明原因； (在数量、 比例方面)占"}],"word":"account"}}],"category":"CET4"},{"books":[{"book_name":"雅思核心词汇4K","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"英 [əˈkaʊnt] 美 [əˈkaʊnt]","phrases":[],"regular":false,"related":[],"remember":[],"sentences":[{"content":[{"chn":"(译文：这或许算得上是首份英文国际科学期刊。该期刊鼓励新的科学写作风格：简洁、重点地描述某一特定实验。)","eng":"Perhaps the first international English-language scientific journal, it encouraged a new genre of scientific writing, that of short, focused <b>accounts<\/b> of particular experiments.","source":"(例句出处)出自《剑桥雅思真题集5》 page49  第九段"}],"name":"真题例句"}],"star":false,"translation":[{"examples":[],"occured":false,"tran":"n.账，账目； 存款； 记述，报告； 理由"},{"examples":[],"occured":false,"tran":"vi.解释； 导致； 报账"},{"examples":[],"occured":false,"tran":"vt.认为； 把\u2026视作"}],"word":"account"}},{"book_name":"新东方·雅思词汇词根+联想记忆法","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"[ə'kaunt]","phrases":[{"content":[{"phrase":"take... into <b>account<\/b> 考虑\u2026； <b>account<\/b> for解释， 说明(原因等)； (数量等)占； on <b>account<\/b> of 因为， 由于； give sb. an <b>account<\/b> of 给某人说明或解释(理由)； not on any <b>account<\/b> 绝对不"}],"name":"词组搭配"}],"regular":true,"related":[],"remember":[{"content":" ac(表加强) + count(数) → 账目需要一数再数 → 账","name":"联想记忆"}],"sentences":[{"content":[{"eng":"Coal is expected to <b>account<\/b> for almost 27 percent of the world's energy needs. 预计对煤炭的需求将几乎占世界能源需求的27%。"}],"name":"例句"}],"star":false,"translation":[{"examples":[],"occured":false,"tran":"v. 说明， 解释； (在数量、 比例方面)占； 导致n. 账， 账户； 叙述， 说明"}],"word":"account"}}],"category":"IELTS"},{"books":[{"book_name":"新东方·高中英语词汇词根＋联想记忆法","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"/ ə'kaunt /","phrases":[{"content":[{"phrase":"<b>account<\/b> for(在数量、 比例方面)占： Travel and tourism <b>account<\/b> for 11.4 percent of employment in the United States. 旅游业的就业机会占美国全部就业机会的11.4%。"}],"name":"常考词组"}],"regular":false,"related":[],"remember":[{"content":" ac+count(计算)→账目","name":"词根记忆"}],"sentences":[],"star":false,"translation":[{"examples":[],"occured":false,"tran":"n. 账目； 描述 v. 总计有； 认为"}],"word":"account"}}],"category":"高中"},{"books":[{"book_name":"新东方·BEC词汇词根+联想记忆法","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"[ə'kaunt]","phrases":[{"content":[{"phrase":"a first-hand <b>account<\/b> 第一手报道； keep <b>accounts<\/b> 记账"}],"name":"商务短语"},{"content":[{"phrase":"<b>account<\/b> for 是\u2026的原因； (在数量、 比例等方面)占； take into <b>account<\/b> 考虑； of no <b>account<\/b> 不重要的； on no <b>account<\/b> 决不"}],"name":"词组搭配"}],"regular":false,"related":[{"content":[{"text":"accountable(a. 应负责的)； accountancy(n. 会计工作， 会计职位)； accounting(n. 会计学)"}],"name":"派生词"}],"remember":[{"content":" ac(表加强) + count(数) → 账目需要一数再数 → 账， 账户","name":"联想记忆"}],"sentences":[],"star":false,"translation":[{"examples":[],"occured":false,"tran":"n. 记述， 报告； 账， 账户； 解释 vi. 说明\u2026的原因； (在数量、 比例方面)占"}],"word":"account"}}],"category":"商务英语"},{"books":[{"book_name":"新东方·TOEFL词汇词根+联想记忆法","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"[ə'kaunt]","phrases":[{"content":[{"phrase":"take...into <b>account<\/b> 考虑， 重视； <b>account<\/b> for说明； 占"}],"name":"词组搭配"}],"regular":false,"related":[{"content":[{"text":"accounting(n. 会计学)； accountant(n. 会计师)； accountable(a. 应作解释的； 应负责的)"}],"name":"派生词"}],"remember":[{"content":" ac(表加强) + count(数) → 账目需要一数再数 → 账目","name":"词根记忆"}],"sentences":[{"content":[{"eng":"The three main television networks in the United States <b>account<\/b> for more advertising dollars than any other medium. 美国三大电视网络占有的广告费比其他任何媒体都要多。"}],"name":"例句"}],"star":false,"translation":[{"examples":[],"occured":false,"tran":"v. 说明， 解释； (在数量上)占 n. 解释， 描述， 叙述(interpretation)； 账目； 账户(record)"}],"word":"account"}}],"category":"TOEFL"}]}
     * input : account
     * lang : eng
     * le : en
     * longman : {"isGood":"true","wordList":[{"Entry":{"Head":[{"FREQ":["S1","W1"],"GRAM":["C"],"HOMNUM":["1"],"HWD":["account"],"HYPHENATION":["ac\u2027count"],"POS":["n"],"PronCodes":[{"PRON":["əˈkaʊnt"],"PRONKK":["əˋka u nt"]}],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}],"Sense":[{"DEF":["a written or spoken description that says what happens in an event or process"],"EXAMPLE":["Chomsky\u2019s account of how children learn their first language"],"EXAMPLETRAN":["乔姆斯基关于儿童如何学习第一语言的描述"],"GramExa":[{"EXAMPLE":["He was too shocked to <i>give an account<\/i> of what had happened."],"EXAMPLETRAN":["他因受惊过度而无法描述所发生的事情。"],"PROPFORMPREP":["of"]},{"COLLOTRAN":["一五一十的叙述"],"EXAMPLE":["a blow-by-blow account of how England lost to Portugal"],"EXAMPLETRAN":["英格兰队如何负于葡萄牙队的详细报道"],"GLOSS":["a description of all the details of an event in the order that they happened"],"PROPFORM":["blow-by-blow account"]},{"COLLOTRAN":["目击者的/第一手的描述"],"EXAMPLE":["Eye-witness accounts told of the unprovoked shooting of civilians.","This gives a first-hand account of the war."],"EXAMPLETRAN":["目击者讲到平民无故被枪击。","这是关于这场战争的第一手报道。"],"GLOSS":["a description of events by someone who saw them"],"PROPFORM":["eye-witness/first-hand account"]}],"SIGNPOST":["description"],"SIGNTRAN":["描述"],"TRAN":["叙述，描写，报道"]},{"Crossref":[{"Crossrefto":[{"REFHWD":["bank account"]},{"REFHWD":["checking account"]},{"REFHWD":["current account"]},{"REFHWD":["deposit account"]},{"REFHWD":["profit and loss account"]},{"REFHWD":["savings account"]}]}],"DEF":["an arrangement in which a bank keeps your money safe so that you can pay more in or take money out"],"EXAMPLE":["My salary is paid into my bank account.","I\u2019ve <i>opened an account<\/i> with Barclay\u2019s Bank.","My husband and I have a <i>joint account<\/i> (= <em> one that is shared between two people <\/em> ) ."],"EXAMPLETRAN":["我的工资直接存入我的银行账户。","我在巴克莱银行开了一个账户。","我和丈夫有个联名账户。"],"SIGNPOST":["at a bank"],"SIGNTRAN":["在银行"],"TRAN":["账户"],"Variant":[{"ABBR":["a/c","acct."],"LINKWORD":["written abbreviation <i>书面缩写为<\/i>","or"]}]},{"DEF":["to consider or include particular facts or details when making a decision or judgment about something"],"EXAMPLE":["These figures do not take account of changes in the rate of inflation."],"EXAMPLETRAN":["这些数字没有把通货膨胀率的变化考虑进去。"],"LEXUNIT":["take account of sth"],"TRAN":["考虑到某事，把某事考虑进去"],"Variant":[{"LEXVAR":["take sth into account"],"LINKWORD":["also <i>又作<\/i>"]}]},{"DEF":["because of something else, especially a problem or difficulty"],"EXAMPLE":["She was told to wear flat shoes, on account of her back problem."],"EXAMPLETRAN":["因为背部有问题，她被建议穿平底鞋。"],"LEXUNIT":["on account of sth"],"TRAN":["因为某事，由于某事"]},{"LEXUNIT":["accounts"],"Subsense":[{"DEF":["an exact record of the money that a company has received and the money it has spent"],"EXAMPLE":["The accounts for last year showed a profit of $2 million."],"EXAMPLETRAN":["去年的账目显示利润为200万美元。"],"GRAM":["plural"],"GRAMTRAN":["复数"],"TRAN":["账目"]},{"DEF":["a department in a company that is responsible for keeping records of the amount of money spent and received"],"EXAMPLE":["Eileen works in accounts."],"EXAMPLETRAN":["艾琳在财务部工作。"],"GRAM":["U"],"TRAN":["〔公司的〕财务部"]}]},{"DEF":["if you buy goods on account, you take them away with you and pay for them later"],"LEXUNIT":["on account"],"TRAN":["赊账"]},{"DEF":["an arrangement that you have with a shop or company, which allows you to buy goods or use a service now and pay for them later"],"EXAMPLE":["Can you charge this to my account please?","an unlimited-use Internet account"],"EXAMPLETRAN":["你能把这记在我的（赊欠）账上吗？","一个能无限使用的因特网后付费账户"],"SIGNPOST":["with a shop/company"],"SIGNTRAN":["商店/公司"],"SYN":["credit account"],"TRAN":["〔可先使用后付款的〕赊欠账户"]},{"DEF":["a statement that shows how much money you owe for things you have bought from a shop"],"GramExa":[{"COLLOTRAN":["付账/结账"],"EXAMPLE":["James left the restaurant, settling his account by credit card."],"EXAMPLETRAN":["詹姆斯用信用卡结完账离开餐厅。"],"GLOSS":["pay what you owe"],"PROPFORM":["pay/settle your account"]}],"SIGNPOST":["bill"],"SIGNTRAN":["账单"],"SYN":["bill"],"TRAN":["账单"]},{"DEF":["an arrangement to sell goods and services to another company over a period of time"],"EXAMPLE":["Our sales manager has secured several big accounts recently."],"EXAMPLETRAN":["我们的销售部经理最近拉到了好几笔大生意。"],"SIGNPOST":["arrangement to sell goods"],"SIGNTRAN":["售货安排"],"TRAN":["〔一段时间内的〕交易安排"]},{"DEF":["according to what a lot of people say"],"EXAMPLE":["It has, from all accounts, been a successful marriage."],"EXAMPLETRAN":["谁都说这是一桩美满的婚姻。"],"LEXUNIT":["by/from all accounts"],"TRAN":["根据各方面所说"]},{"DEF":["if you do something on someone\u2019s account, you do it because you think they want you to"],"EXAMPLE":["Please don\u2019t change your plans on my account."],"EXAMPLETRAN":["请不要为了我而改变你的计划。"],"LEXUNIT":["on sb\u2019s account"],"TRAN":["为了某人的缘故"]},{"DEF":["by yourself or for yourself"],"EXAMPLE":["Carrie decided to do a little research on her own account."],"EXAMPLETRAN":["卡丽决定自己做点研究。"],"LEXUNIT":["on your own account"],"TRAN":["靠自己；为自己"]},{"DEF":["used when saying that someone must not, for any reason, do something"],"EXAMPLE":["On no account must you disturb me."],"EXAMPLETRAN":["你千万不要打扰我。"],"LEXUNIT":["on no account/not on any account"],"TRAN":["决不，绝对不"]},{"DEF":["according to what you have said, especially when you have admitted doing something wrong"],"EXAMPLE":["Bentley was, by his own account, over-sensitive to criticism."],"EXAMPLETRAN":["据本特利自己说，他对批评过于敏感。"],"LEXUNIT":["by sb\u2019s own account"],"TRAN":["据某人自己所说"]},{"DEF":["concerning a particular situation"],"EXAMPLE":["There needn\u2019t be any more worries on that account."],"EXAMPLETRAN":["没有必要再为那事担心了。"],"LEXUNIT":["on that account/on this account"],"TRAN":["由于那个/这个缘故"]},{"DEF":["to do something or perform very well or very badly"],"EXAMPLE":["Kevin gave a good account of himself in today\u2019s game."],"EXAMPLETRAN":["凯文在今天的比赛中表现出色。"],"LEXUNIT":["give a good/poor account of yourself"],"TRAN":["表现好/表现差"]},{"DEF":["to force someone who is responsible for a mistake or a crime to explain publicly why they did it and punish them for it if necessary"],"EXAMPLE":["The people responsible for the accident have never been brought to account."],"EXAMPLETRAN":["这起事故的责任人一直没有被追究责任。"],"LABELTRAN":["【正式】"],"LEXUNIT":["bring/call sb to account"],"REGISTERLAB":["formal"],"TRAN":["追究某人的责任"]},{"DEF":["to use something for a good purpose"],"EXAMPLE":["Perhaps she could put some of her talents to good account by helping us."],"EXAMPLETRAN":["通过帮助我们，也许她可以把自己的某些才能充分发挥出来。"],"LABELTRAN":["【正式】"],"LEXUNIT":["put/turn sth to good account"],"REGISTERLAB":["formal"],"TRAN":["善用某物，充分利用某物"]},{"DEF":["not important"],"EXAMPLE":["As she grew up, her father was of no account to her."],"EXAMPLETRAN":["她渐渐长大，父亲对她也不重要了。"],"LABELTRAN":["【正式】"],"LEXUNIT":["of no/little account"],"REGISTERLAB":["formal"],"TRAN":["不重要，没关系"]}]}},{"Entry":{"Head":[{"FREQ":["S3","W2"],"HOMNUM":["2"],"HWD":["account"],"HYPHENATION":["account"],"POS":["v"],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}],"PhrVbEntry":[{"Head":[{"PHRVBHWD":["account for <i>sth<\/i>"],"POS":["phr v"]}],"Sense":[{"DEF":["to form a particular amount or part of something"],"EXAMPLE":["Afro-Americans account for 12% of the US population."],"EXAMPLETRAN":["非裔美国人占美国人口的12%。"],"TRAN":["占〔一定数量或比例〕"]},{"DEF":["to be the reason why something happens"],"EXAMPLE":["Recent pressure at work may account for his behavior."],"EXAMPLETRAN":["他的行为也许是最近的工作压力导致的。"],"SYN":["explain"],"TRAN":["是\u2026的原因"]},{"DEF":["to give a satisfactory explanation of why something has happened or why you did something"],"EXAMPLE":["Can you account for your movements on that night?"],"EXAMPLETRAN":["你能说明一下你那天晚上的行踪吗？"],"SYN":["explain"],"TRAN":["解释，说明"]},{"DEF":["to say where all the members of a group of people or things are, especially because you are worried that some of them may be lost"],"EXAMPLE":["Three days after the earthquake, more than 150 people had still to be accounted for."],"EXAMPLETRAN":["地震发生3天后，仍有150多人下落不明。"],"TRAN":["说明\u2026在何处"]}]}]}}]}
     * media_sents_part : {"more":"media_sents","query":"account","sent":[{"@mediatype":"audio","eng":"\" ...on <b>account<\/b> of the number of pine trees that grow in the gorge of the mountain in which it is situated.","snippets":{"snippet":[{"duration":"11300","name":"special.2010.04.26","source":"VOA","streamUrl":"https://dict.youdao.com/pureaudio?docid=-139385106736947527","swf":"","win8":"https://dict.youdao.com/pureaudio?docid=-139385106736947527&dist=win8"}]},"speech-size":"33kb"},{"@mediatype":"video","chn":"我们还应该注意第一个创世故事中的描述，说他们在上帝面前有不平等的关系。<br>","eng":"It should further be noted that in the first creation <b>account<\/b>, in any kind of unequal relationship before God.<br>","snippets":{"snippet":[{"imageUrl":"http://dict.youdao.com/pureimage?docid=6315912264594031708","name":"耶鲁公开课","source":"旧约导论课程节选","sourceUrl":"http://v.163.com/special/sp/introductiontotheoldtestament.html","streamUrl":"movie=http://dict.youdao.com/purevideo?docid=6315912264594031708&auto=true","swf":"http://shared.ydstatic.com/dict/4.0/simplayer.swf"}]}},{"@mediatype":"video","chn":"通常经过文学分析，会发现,最终版本都经过艺术加工。<br>","eng":"Literary analysis that is sensitive to the larger contours of the <b>account<\/b> will reveal the artistic hand of the final editor.<br>","snippets":{"snippet":[{"imageUrl":"http://dict.youdao.com/pureimage?docid=1354883003772870612","name":"耶鲁公开课","source":"旧约导论课程节选","sourceUrl":"http://v.163.com/special/sp/introductiontotheoldtestament.html","streamUrl":"movie=http://dict.youdao.com/purevideo?docid=1354883003772870612&auto=true","swf":"http://shared.ydstatic.com/dict/4.0/simplayer.swf"}]}},{"@mediatype":"audio","eng":"But users are charged if they try to spend more than the amount available in their <b>account<\/b>.","snippets":{"snippet":[{"duration":"9500","name":"special.2009.05.21","source":"VOA","streamUrl":"https://dict.youdao.com/pureaudio?docid=3489381727482543878","swf":"","win8":"https://dict.youdao.com/pureaudio?docid=3489381727482543878&dist=win8"}]},"speech-size":"28kb"},{"@mediatype":"audio","eng":"He also wanted her to repay the two thousand dollars that was put into her bank <b>account<\/b>.","snippets":{"snippet":[{"duration":"8200","name":"special.2010.04.24","source":"VOA","streamUrl":"https://dict.youdao.com/pureaudio?docid=8361486732036605144","swf":"","win8":"https://dict.youdao.com/pureaudio?docid=8361486732036605144&dist=win8"}]},"speech-size":"27kb"}],"sentence-count":6}
     * meta : {"dicts":["ugc","media_sents_part","simple","etym","blng_sents_part","wikipedia_digest","syno","web_trans","longman","meta","ec","ec21","phrs","exam_dict","ee","oxford","auth_sents_part","special","rel_word","webster","collins","splongman"],"guessLanguage":"eng","input":"account","lang":"eng","le":"en"}
     * oxford : {"encryptedData":"TNvL5RvzrtPgEpLHE_NgThWwwkxquWqw-vfSABjPoFNyL3_S4K0m21IsczBUYE3Ukt-FiVGKQypHwLkUAzoIWeFEkTDRjFdRKhzCVwelaWii-o2uk65pOT2eRfQ8Mr4zxzolxNcOIQC-VhzC4ykUDj6eGS1x3OfN3mN1DzTXg_52iWoZsRBhstm09kSW_pb4jsc-UzVgASFgWRuitbZKn252KYFWOLLWuV8l3xnVCJTqzxRUZlPE_hvw2_L0jcUktmuPwU4t7bYvqzjPuXVJ5qu9T2W-rTHC8fhM_00CpkBp7TiKH5apQUOQ04YS-S3iRqYRi-L225937pf7Jeau4fWXK1JWv7A-cKg_IEc8hVe27csfOyg2Hl2fFhitvoqjwtIPfdCQvFpBtockRLRgMERRp24D5acCbhXukCT97k7jxTO07ALjbUC55WZCQUDa38r9B2YyFcOx1-LNY0_rDgr8ry3WpFcT9q_CuIhwSjYi7Vurc8ynCEukQQYRwyP4G6jpqfRG9fLN57axlunamEbtNNsMkqjxYNddBSaCKkV89-cfGtfexjVPbkGLMIu4aXVlFN-Sn9UIo-AoL6g-QRyUNxjJblDa2wpRiZv4wp5iKvdPFEGWTWsRQOCH4OE2fjtv3wq811vZr_ntww807A-oK-FJL7J5ZnKb1w0sbG6hRTJkscLjtmfZGPEc6BCooQEQD0SBJYqDAYSFCwTJMi5ZfipTonPKjsTUqrEbLwRtOIwtYa9TqWnThVVdBmvDF18Z1Az4X-bcaKvgQ7gQz6iRHtNt_Ksq9r4v5QXXV-V444A9sILLEeuEgxIy_dN6OSEfqv8DivJePN2CgUVZ9s6S6ZBh5jfzkrZzq433UMCWwV1xrtwzFm8qVESWiIC4e_F123dtyumliUGTuCVaRNWyU-ZeRE17KYqx4qo6t_aJ3YvOis5SDxK_J-otr0sbx6m3OtiShmc_MXS2n3xelggw02tfW6uQvcybGCnc9Zt9B3zd0o9qCyh5wvgcHv4RBLKrpJl9LvFARN8Gg4B_NAcYmX2wXQFGObKvNXatTzWHDBtu0t9DIunQO9Z0KNGKpMCsZASz0W1D6UlPC16IyNWqT4fW9azZKCX-DX4a0aNyNpPrQipmyYrYiISoGZ9Cs9JgQzyio5ej-D_1UvRMnzq9RsCMRFknfURnruwD_CYunhzb-jxwY1SzfhgSU9zeq-vzR2ye7dUAAqrPLN1gKb57OyoqbvpClmXerwE3OtFxu97BTeR_Jb_U-_V-FcTIjxA-lm2btGEDjuAHbGUsdEsUzCvI04u3hqR9-vnPfDqUk7tzKiiRBHUojMLWr6g8l51Eot2cOJra-XODabkvMyhtZ1H7TzFOq8s8TBw6do5lRtca4SIdigVbv96J9ZoVDTrC304XXV_-WVA4J02ZEsihYoQL_Y4z_CMPKbbqIdaWuXDoxeU_Y3UQ3QBiA0Qtvj6HNFMkhLlXplB4PnT9Z-rjd6XR6GON0bCf1LgsvwfoAUt_hvUd6ezb2MSjetyQprTfXARXmRltn7n3SF1L-2EgocfGW_a5ugZj3-aNnKQkOpeH3k6VkCcohcwVqiUpXApepoA9s2BsRB5W-dTnDTCPaqnwS8WrXLo4Urpx0WVODEbKBODlRUxuJUPm1SPGfFmIyvZCC4K_Jb9haELxilYedZGk3M__cfBt_BjCHuKr1hLyvWDFZjgg1ZZ4Y1VVaOqWSZFu1kXjwUtWLsBxqCEn_BSgbQKyohBaaeLONO9i0n4snFIZV45-a8Jps64ob5fJG-HL9iAhdx6_yhSw80UPmVSzRaDOfFAaUAnxNsr9pFfhDONnpWePnlwU25N9duz20V6dJaurtVVsTkmYj3w2C9Bl01toVzOCTe29fO0sRjLVdFQ1SWDQkfQJxgrb56IpigAy0acuApddkyNRs7xl8JpEJzu7NvAyucScIGMwkJRw7Fxo1wsjPVZNIGPV1HQFxHpcYRp6E4ZzC2_wvknJl2reQ7oVoPGFH4S8ccIxzCH-2cwcSDm0ud-Nsc3hdGM9280UaTIS_j707_Nj3xMSt0aIFG2QoJ7hnRI9YwkFvRzeoKQ-UcL4TAch0wzjRPABeREcG7mo8RTiWB1U-0IupmXUVHTsV2xHxOZRJfVMzrehmAwyH5HLCbKywsGTgVXDaMVlaxWAdJsDqe8Xw81If09_j3cPCi1CX8RjLbXBZ8UXgutQZDZTAbYtjTFvEdmHaavcgE3qMoJtAX_v1l3F7kVSkpDmykU7yH5wgs6K1D-__QIdECQSJg8Dvw1heJnUvwWQmyiG55c78TQtUkAe6eHVZ7gMO4NoeW9RQpFFSf-TGL-t9jcsdGvgn-qerunDJhhYFlsFvLh9rnN4BFqUcJkChkxiX7gBxy4w1eiD7PucTHA5LD0hgiFcBsBuJCRm_j7HFuPdAQLCzHcn3v9xKCsbao7T1BDpFvwyIgEXmFfXjHsq3I5Avj0CZFxFRb2YfMnevkz5NaxtLbMfv-8GDLUF3dOf-oazEHGGCvrQW2CFupM-soLEbaEszOnJHfD580K3kvsYrRh9ythQvqt_gWPZnfPlp5Kd71Am1qUEWw3QMAS_p567dTAbr8e0o_vZFlxi12f1x6pDcWqgxFyM5xwLblu6i6EHZaZdAf_-0W_IWjYlkthiSQ2be43B4zWPe1gPlL8zvlztRPZE_U7AddDVITb3MOmrU_nk7CgO8G9gsBMzi8mAdqGkOZ3A-0SNi2abnFHhjpcZHuxRCVXsyXrkQa7xSv9fku0rXoAEhT7S1QVCwwW-mhAPjVoECLFdob8vECpbEoSaoIDnqhNJnfLDHEILEvrTrtim6yjI1hnnLM86ou6-P1waNA0QIGxCwMe4ANP11_QFg18LDLZRV5rkso43xa7Q3hsQBa2CSHS7emGMKvdeGXxa4rC_okhAOKCpP7hadLwaE3bNRWusKstkowC-eQXo5wcBXS3YvLVOsfkYv5-jJyU1AXceg9Fi8PuuVxhslLv759jesL82kuhptzZk2NlJOqe-AwWbdLlK4aAutzeXPD5-nvH5oxal8RxlTz6yU2KfJ10dgvnjRrhjzVGrQ0kTzVZaPnQFajKY8oQoSD_RoiPua2a3zgPN-P2cfIp6dDNtcweN5QT4HZ6VSnCS5EaRHUklf_RAHBajRvhctIb4r5_M_VubFwtg4usJMlUkgodyMVN2e7dXYO9WeB42sKgAA_GVJWsNuag9fawc3fZzIdWr7YipQ9ZZpvb_RObV7oKPapJtwv073qVM4bSOXZ7K8Q2gbLhY_CF_C7jhrWf-fFa7MOSI3k1C6cRe_30M4kW6XU9k95GbW-Ap42rMJ2u6YGdMLE4zZBbw-HjnjwUgAHaSSm6-XLzGkZf_lVQIHnCt-MUKagcw0eWysifNr1Alagkr5pA9VY6P8YZxFpmKFx7lxy_-bsCbjRJCIKiW8KsG_t3MSjuBb4VLEE49kiNrJBQ-s6m9ddueObRVKnz_zhfMBfZ4si6tHJpBHf29m8ppuq0EoBMFR4iPJ5-Y8jOqBLrtsTv3hBCT_wZKctcjzhZ3OIGYwf_tufP1tC9_EG1v__x-sA5-fyZzkac7WWUF8qvFGdcCesk_ZNOdzsRVMRBd_8zD2IPyqayb2q91JzLJcYw2L33ilNvQDZkPVhNjCVAf0O5sb8hSl5d9-X745doVX1TJci8XfiZpwuiOkZDiU3azW5ndaS4XgyR_BkRFzaVj4GbXWXa9NWVrsYLmVYSt7k_pYH-cSepMQU_Ca1E9MuXLiyuV88J1Z53v5j6wdSmbfPa83QWJcXbJpX2upL9lyqVnjwht5YqAVZ8Ap8pbiPi8gvnEPhGC-pcKnIpeQ-BObltn2mT0sLKOPGnSb4WBQE36Gd3flPPv3EhkvieNsQuysxevvCGQabbFFMQp00oSIfUccRawL4Rzw4v9URM5hywWgsMevkwYiqcrJxRZuts_L-ABL_a2fxE3OgJWQomD9l-8in9iQATR8_s9xczoVgVov7WUZtaDcuhARHLogSLojh7CryD932bHI0R8smeMFXGkpb4_azrQ2qv-btI1OBWR09_uqdr-GIENyI506fVZeozwZMdloPVd6ffeaauHCHlZPZzoEnV4aF7NsiTsN3CR_AE17whNn6y1GqfvO8CMJDME1Ly-WKBuQ0lda1A_efhS0nqebincT-qHs5WMz9Flk1UM-CAlRxxmejNgLET51kZeZy8e9n4jofbEL_tThwmEP_QSyEKr1BlaC6a3Ia4VaaQ0VV6NvuSQ8hSqN5HXi1--W6M0csR4ufsBIx5aOXh6_omtLO0-uBkkbpndLDz5XqHr1N3KsG3ZhA-tltXhIWu2v-l7tj0GF_kgvAYdPULNgPUbQcvAXt5MG86rhMKIxNsrV15KeCfqiTfsciK4n64h7ttYwreseIe5Oj1jSZELYGHo-WeLL06Etv3J83Q87IdXNML0T33amTmb6RRSrobjzh0BdE07d9o8yPoOD5Yz2x31S2iU0ogUkjOqluyyo3lWMy-cyxkLl689MylgaTPUfMNRctCcEByGbHbRCdRNG-KYAaEej82UnQp-A6G5zVwdb0tRV60uqOwn6U7C-j3Lus7g9UVuhV1RQCKMg70Y9Oob9JtcLXxBwuqnFj4eBew2Pyt0KK1esMqBSKl0xhvGs_RKFiKV2vmiz1NIpOVhj6bCgdNfgp7yG97fAIlLRNdSQCy827k1tqdspgEPFGk83Y6qakkvUG70QOmnrQ-CR5AGX3_WsrVbSrQ_g99bd9suofb4ebv5hRgsC5lSCXiliuc9syMWLEo7lY0qfAIz0WspQ_tLU-k9U11HGKRoDFdmFmvyQ3l3CroWap1lzhmRGHmXlUkIUzZH5jfEBcrlxnC39KySfxupz5AORA5WCCaZOp5_cR5rlmRt2sg6PjG0Bj-r8fWCJH8jOhpuplvWQ5CQCtjg6zkOzJqOK3dF0EYfHLclu1wmHBDJLGd2fnUK5NP-ssBguxdANFi0f9KcNxTe2827t_xqNdpN1FGugPMGlbL4xKvfEiDmPi-1Euz7_1j9bqftXZbg4ZgyNW8rZoCvgGNsfmzuR4nrmbRYA7n5LhRh2Eczr25TFWrNShXUBjWJItPKg4vgr-42gFweyGyjzTbmL5X026ZrIsGUzMFmL4pvLlM2crHv_WFwtpXwZXTgqVcjvaj57Ucq_PafUDbYCitouh_wVWXynhFqIvNxlQpkkS8syl6geYybivBQBqPnaWoej36SAA-lRuydDqMIMMpMFyt-0T4s66C5_7ttbRVagBlGnFnYsmjn26OOSgp8VIYIBIIJPnXFMjnYhVlE-YlQUz8-KApmCfo6rX_SJNldBztocBS3w1jZxRCR1_ZcITA7RPbap-xUsNy-uVfUwnXrHj-9mv6gYBojrEELC0OdHvk-a2PJYPsJ9AvGx8D0JY-RsfM-LJw5QhKCLmShUBt6qwUQzGNEQpzSoOtw73CEYj3DKIUwdb6vrdFomD7_HDD1pPp3kOM1RjlCPyvxuNROLjFNyiQPPPoVYUwX_llz_H_gx8Bf8vUTOFxb47b3ZWA_lAIj30A_TrO8fful870VTtog0qKdL_7eE3iAn52bbljN7vbGlSp3t5JoiHoh6zJXMrIRuEUe6tz-_fKeRQL9TzR_pJr50WI4C2HQplVw1LFlLLIID39pxyaZ7XrzkHpeeoHfhCtnYbvImEchi1Wx8s59ZGjGPDUkUvzgfUMGXGQnCvRSlB9_A4o0mMCyhRb0Yhg0L_tzXg9z8zB5QcRakGaxwXvrXZbutRRASu2itwWCJHi4ryIMqOdus2yNMYZ-8tJB2kgD38brgvBrMbGlpRyLJOKjOqXqMJZB23g9Mh_Kp6zU-djS6UhisAi6YpynY6k6reUa0HV9Q5XaNk5dGk6PU9LfPO9jIBUnBsRY3UGQtTpdtY3S9ZHMlWkA2WEU3-H4Kgi5QTaYYIYJBRhqKHIXI1YdBFO4TuL_FFZvKv8jt4so_MQTUIu7xuyjnkHON8lYV-BGHSXO4Xd4C9wz09gAaTDq_OYC5RW3XmNiVkZ4i85rRLozzReIo1wRMn1Lk2VbUDWVnf32zZDugy761jltqp_3H2Ahl92MqnpfAh4zH2mCnqwOw5RluIR4FCb3Cxn9y05wQmIALM_n2aFI1eoQPi8hLFqa3EiR0SFa6WLm-Go2VQL3wkAmARiND7bPzs3NFTFPvV0W2d8uRoqt-xTA8bnMt60fBByVuMmxqQ9-Ephl3VhKqJdbtxHdk7HUqgdgLGpQxZhFzcfmf8LRDdgnxJMu14FRnD0vJ0JKg7kkxjMbylKWcbS0v3pngoiBdT-ZnDNCeZcNbJp-7VFUmaPwR8TQJT1qpcfdYLAQA_5WjiU3GYdBfJo4USvtLpF9fPcD3VeelZbKxb0nZL-KFNvoi-Og91_nllM3fmkOuydIMGIMsY8kskUJMpBhrun_tU6UbFhX7z43ZI6alDAHR-9kAqYJNmbpSzSEy4G2-wt1Lr6ak_6X3sNdSJciW3KeKnX1nnerkYOz9jmGpDd0Fc0cbtrqtogtPpxNvWqIWEqUBVPX_IzG7BrxfoYvCtYGzyBRM4OYCjY9VnGzGZfAaRJZbi-rxrZ7uJxu5bZJcegwNN4GqsydUEgAwPdTsbd3OEYbTB5SDFsIsWUxviHHuavHYhjZQSxK2vSIn8Se5Syce2G45jXljk87pR9x0bdYm89mt6uiFw3kcebfFvScaelvpxCffcR4AhIGLRPTGtxfGMU7s5V0M4M0F0c4VgsUVby6SdN-hBTxxQjmxY21x8ev6J2Pi4jpPwE-vboQe0PkNSNCg8kl0-6SgwbWgUlgUtYEyx8_jvTaNuV3rXBiZ3ioF-Fw2vidXyXOX-12ffqjTgNh2uisFJRxD6gi_BKxDMdaDlKTY_xLLGlxCEhyBQWsMPOHX2srqg9A8c0WOsd_dKM6LICgb2UPQK_yscbuCK9iWOUqLH0IXw-M5G6ZhQWmZptuY-uUQT-rSvAb-XH7FXq5pTrKFe9DaoW-JKSg2oT2R7rDFYpd2BapcfiD3CwKwaQF-ZP4YUIZcY-u8g76YX9j5VIrXus_z9-3J8cjeU3SDU309um-MEAwXd70QeORqIhqwLR0N7JFQki2lxCKYofYUquvkgw0FHdA-2N4njjIKommLeDkcsYk7UJb0--VkAndyQPwh_ouQFBDd3d0HEeyuVyby2EMFvXlIwTOh7AyxU-_D_1TDL_AKw0YZTR1yjpNNwF2vlj8mTKBj10wljUsG98BlWRz-b4Eorosorvsum_Wd7mh7McvPxZubkRDgBmjx0IlQTTobwKvsyikvq-8BtLYsqoJ88YpYFpY1mWINIkMrkYI3h8nsrQ-90p1U9cD-Zs8I5q0Rmk9euS9-_QS8pue1BfnB7puF3VYf_7jdbiuGbIRv1O3h_aSIwsHq3qN3xVZo_G6IjHrtalC228Su3dIabla1guZNnCycBPLcztbzRyxkADu2ZnRfSUXlDsZPiS-2afWIUzTBawlT9bbUNU4zzQ6MVtyzW16v35uappxr2Z5YsglXGNk2GkQEIjH-WqlqRY0oofVNjMGojv0xf1X_QSftIlqUS8JiVf2yZphrZtZ9y-T_b1-R_T2esqL_RJQtfuxrNR_biuyQnjt9tluzbmY2qlsjnoPYIKEMbwlF63lC1UipLW0Jdrpa1BcZiYAsmhrxRhfRzj7aiBX4knfpfdENsibJBmFtAamlWmYeakF6lknn4oZMRBi6uMhkrs5leXKLFYozn0OCAiM3kQhwkAngH0fqf4R7snW_h8VSDwdD-xxBYq0cEkgAJpnYGtF9TkVyb2Z-VsfQETqRo9uiXTLYmMlXJ_Xmy8R5lTfGIqg91-M3u6lrVsmhL7xaIBKzWBwkhrPOG8331Sy95ml_05KvBF0KhH1ogSQDzztzqyWkwedh2a_XuccfjjsKHJhR533SgYTaDRtpbmdiD0S-gSB4tgBvoelBfcZgzUzwrBTFZXudYFstREjFMwsCTVym74MvNZ6fEG-QnjVPe_2tkaNJzYSUXL7qf7q9JLVFX1bA5qUNrUCLnMkcG2FB--SugZZbZSrdFEGdL58h2LxTNj5h3I_NlNZ3fOlglbUy_f8No7aro-rQbXzXzJiJ6v9hFB3jBn9EI5yVkYoKl8XgQJ9oELpzcSJCNAYOjOhm9wV3-kL3HQrozDCYAiJ6PkvhnTcPnNh0-i9zBgjzm5ASmwzGaAFjsf7rBuQrPllztIg6xXMH7-8yDA7P3M8Uyzv3dN0KUrrq9cnS4mMxGOAsEzimdidZC5zWVlIAqQ8Ku-QyTmylHJuRvzzg83IG2R8cM7tmmqMJi59_4Nb1z_Cm_y2eZm04Ma20krsoMa4KRSulRrGiUm2cdXTg06RSTUQv3dpiBvr-OJD-uF3Kb24SODGd6ojOC-fZt264aojEyDfCFuRWRCXsYDIYSxsOZSuWmpcjkyrTWkdQ8WnmuHQgf0qKK763pAV4Xlse7K7EyG9o-b2k5jeYraGPeEwpQJCzfZxIxcpFyXJymuMwgHznRbia9uHOqh0WCbpOb6MPkSvL3Qo6Lpcvz0ibyb4Vn5_ddYEEucGKRwOAZcqFd4yPC1l3pC29K_PxeG-fU3rO9jeza3JP5teC5i_Q1D9PdaY4ji8AvGdZaqsgfWxKXN0JXS-9sFOW6OeQZ7hmgHtVP5FuLsl31p1WJzo2_YqP4tg6hurjP3XkRhkpq3SNHZt7XfUK4jJTQVZxnonXgfBmsNBLsTozs47sZSqpioPcNxWRbZYm5BwgGv0a4ANMh8w5Wc1FmADwL3O1KCeIYfrej9r_b14HL5M9A3GR5ZQsEMFht5GS1Uye3huVV0wTy5VdfvyZ5wLG8N0xT5bnMOMt_K_ioKXKp1X0mXjasQG4HUudLz6DPJCdP1ZzlJMRRocHyyv_PletB5NAQdi7Ra1BxdN9IUNZp0gW0YMG5zY3j3ziwkyw0CvodQDA2yX6LDkx_8WocGWxro2hR5RdWrJDfsWtAyGn4fU1pNa3pUMYXrqmdFCHM3zLSxCn3ScUnaJTkwTFPkMRE_vtqwbcXMa_0MDgvCGGePDSiCCASm1mSYt8vz5KQ-D2vNURBip2LktfeOnwgfYmGeEi5zxbxa90WfoiqGDsrnBb8XIwyzyRHMB"}
     * phrs : {"phrs":[{"phr":{"headword":{"l":{"i":"account of"}},"source":"","trs":[{"tr":{"l":{"i":"在某人帐上重视，\t记帐"}}}]}},{"phr":{"headword":{"l":{"i":"account for"}},"source":"","trs":[{"tr":{"l":{"i":"对\u2026负有责任；对\u2026做出解释；说明\u2026\u2026的原因"}}}]}},{"phr":{"headword":{"l":{"i":"your account"}},"source":"","trs":[{"tr":{"l":{"i":"您的帐号"}}}]}},{"phr":{"headword":{"l":{"i":"take into account"}},"source":"","trs":[{"tr":{"l":{"i":"考虑；重视；体谅"}}}]}},{"phr":{"headword":{"l":{"i":"on account"}},"source":"","trs":[{"tr":{"l":{"i":"记帐，赊帐；分期付款"}}}]}},{"phr":{"headword":{"l":{"i":"on account of"}},"source":"","trs":[{"tr":{"l":{"i":"由于；因为；为了\u2026的缘故"}}}]}},{"phr":{"headword":{"l":{"i":"bank account"}},"source":"","trs":[{"tr":{"l":{"i":"银行存款；银行往来帐户"}}}]}},{"phr":{"headword":{"l":{"i":"be taken into account"}},"source":"","trs":[{"tr":{"l":{"i":"[俚]被考虑"}}}]}},{"phr":{"headword":{"l":{"i":"current account"}},"source":"","trs":[{"tr":{"l":{"i":"经常帐；活期存款帐户"}}}]}},{"phr":{"headword":{"l":{"i":"account number"}},"source":"","trs":[{"tr":{"l":{"i":"帐号"}}}]}},{"phr":{"headword":{"l":{"i":"of account"}},"source":"","trs":[{"tr":{"l":{"i":"重要的；有价值的"}}}]}},{"phr":{"headword":{"l":{"i":"savings account"}},"source":"","trs":[{"tr":{"l":{"i":"储蓄帐户"}}}]}},{"phr":{"headword":{"l":{"i":"no account"}},"source":"","trs":[{"tr":{"l":{"i":"没用的；无交易；未交帐户；无会计科目"}}}]}},{"phr":{"headword":{"l":{"i":"account management"}},"source":"","trs":[{"tr":{"l":{"i":"账户管理"}}}]}},{"phr":{"headword":{"l":{"i":"capital account"}},"source":"","trs":[{"tr":{"l":{"i":"资本性帐户；固定资产帐户"}}}]}},{"phr":{"headword":{"l":{"i":"open an account"}},"source":"","trs":[{"tr":{"l":{"i":"开立帐户"}}}]}},{"phr":{"headword":{"l":{"i":"take account of"}},"source":"","trs":[{"tr":{"l":{"i":"考虑到；顾及；体谅"}}}]}},{"phr":{"headword":{"l":{"i":"deposit account"}},"source":"","trs":[{"tr":{"l":{"i":"存款帐户；储蓄存款"}}}]}},{"phr":{"headword":{"l":{"i":"new account"}},"source":"","trs":[{"tr":{"l":{"i":"新帐户；新开帐户"}}}]}},{"phr":{"headword":{"l":{"i":"checking account"}},"source":"","trs":[{"tr":{"l":{"i":"活期存款；支票户头；活期存款户头"}}}]}}],"word":"account"}
     * rel_word : {"rels":[{"rel":{"pos":"adj.","words":[{"tran":" 有责任的；有解释义务的；可解释的","word":"accountable"}]}},{"rel":{"pos":"n.","words":[{"tran":" 会计，会计学；帐单","word":"accounting"}]}},{"rel":{"pos":"v.","words":[{"tran":" 解释（account的ing形式）；叙述","word":"accounting"}]}}],"stem":"account","word":"account"}
     * simple : {"query":"account","word":[{"return-phrase":"account","ukphone":"ə'kaʊnt","ukspeech":"account&type=1","usphone":"ə'kaʊnt","usspeech":"account&type=2"}]}
     * special : {"co-add":"http://www.inoteexpress.com","entries":[{"entry":{"major":"经济学","num":4,"trs":[{"tr":{"chnSent":"2006年,美国经常<b>账户<\/b>的逆差占GDP的6.2%,这是史无前例的。","cite":"688","docTitle":"论美国经常账户逆差的成因及不可持续性 （研究生论文）","engSent":"In 2006, the US current <b>account<\/b> deficit amounts to unprecedented 6.2% of its GDP.","nat":"账户","url":"http://www.591-lw.com/article.php?r_id=148017"}},{"tr":{"chnSent":"近几年来,随着江汉油田快速发展,经济规模不断扩大,<b>应收账款<\/b>逐年增多。","cite":"169","docTitle":"浅议应收账款管理 ","engSent":"in recent years,Jianghan Oilfield has made a rapid headway and constantly expanded its economic scale. Its <b>account<\/b> receivable,however,is growing year after year.","nat":"应收账款","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CJFQ&dbname=CJFDLAST2010&filename=jszd201001025"}},{"tr":{"chnSent":"而目前这些巨大的森林环境服务效益在国民<b>经济核算<\/b>中未予考虑,需要采取适当的措施将这些外部效益内部化。","cite":"19","docTitle":"北京山区森林资源价值评价 ","engSent":"However, the benefit of these environmental services is not considered in the system of national economic <b>account<\/b>. The appropriated measures should be taken to internalize these external benefits.","nat":"经济核算","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CDFD&dbname=CDFD2005&filename=2005085003.nh"}},{"tr":{"cite":"0","nat":"帐户"}}]}},{"entry":{"major":"计算机科学技术","num":6,"trs":[{"tr":{"chnSent":"构建了基于远程访问拨号接入用户服务（RADIUS）的认证、授权和<b>计费<\/b>系统。","cite":"157","docTitle":"期刊学术社区","engSent":"A remote access dial in user service(RADIUS) authentication,authorization and <b>account<\/b> system is constructed.","nat":"计费","url":"http://www.magsci.org/SearchArticle?flag=showaticle&id=6975451"}},{"tr":{"chnSent":"宽带接入过程中容易出现<b>账号<\/b>密码被盗用的现象，因而需要使用接入认证技术。","cite":"39","docTitle":"宽带接入中的认证技术分析\u2014《电脑知识与技术》\u20142007年第18期\u2014龙源期刊网","engSent":"s：It is apt to present the phenomenon that the <b>account<\/b> number password is usurped in the course of broadband access, therefore need to use and inserting authentication technology.","nat":"账号","url":"http://cn.qikan.com/Article/zsjs/zsjs200718/zsjs20071833.html"}},{"tr":{"cite":"0","nat":"帐户"}},{"tr":{"cite":"0","nat":"科目"}},{"tr":{"cite":"0","nat":"会计"}},{"tr":{"cite":"0","nat":"帐款"}}]}},{"entry":{"major":"体育","num":1,"trs":[{"tr":{"cite":"0","nat":"(在比赛中)击败；击出场(for)"}}]}},{"entry":{"major":"数学","num":1,"trs":[{"tr":{"cite":"6","docTitle":"\u201c5+3\u201d工程项目管理模式 ","nat":"计算","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CMFD&dbname=CMFD2009&filename=2008186124.nh"}}]}},{"entry":{"major":"交通运输工程","num":1,"trs":[{"tr":{"cite":"0","nat":"帐目"}}]}}],"summary":{"sources":{"source":{"site":"NoteExpress","url":"http://www.inoteexpress.com"}},"text":"以上统计来源于2,447,534篇论文数据，部分数据来源于"},"total":"2,447,543"}
     * splongman : {"isGood":"true","wordList":[{"Entry":{"Head":[{"FREQ":["S1","W1"],"GRAM":["C"],"HOMNUM":["1"],"HWD":["account"],"HYPHENATION":["ac\u2027count"],"POS":["n"],"PronCodes":[{"PRON":["əˈkaʊnt"],"PRONKK":["əˋka u nt"]}],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}],"Sense":[{"DEF":["a written or spoken description that says what happens in an event or process"],"EXAMPLE":["Chomsky\u2019s account of how children learn their first language"],"EXAMPLETRAN":["乔姆斯基关于儿童如何学习第一语言的描述"],"SIGNPOST":["description"],"SIGNTRAN":["描述"],"TRAN":["叙述，描写，报道"]},{"DEF":["an arrangement in which a bank keeps your money safe so that you can pay more in or take money out"],"EXAMPLE":["My salary is paid into my bank account.","I\u2019ve <i>opened an account<\/i> with Barclay\u2019s Bank.","My husband and I have a <i>joint account<\/i> (= <em> one that is shared between two people <\/em> ) ."],"EXAMPLETRAN":["我的工资直接存入我的银行账户。","我在巴克莱银行开了一个账户。","我和丈夫有个联名账户。"],"SIGNPOST":["at a bank"],"SIGNTRAN":["在银行"],"TRAN":["账户"],"Variant":[{"ABBR":["a/c","acct."],"LINKWORD":["written abbreviation <i>书面缩写为<\/i>","or"]}]},{"DEF":["to consider or include particular facts or details when making a decision or judgment about something"],"EXAMPLE":["These figures do not take account of changes in the rate of inflation."],"EXAMPLETRAN":["这些数字没有把通货膨胀率的变化考虑进去。"],"LEXUNIT":["take account of sth"],"TRAN":["考虑到某事，把某事考虑进去"],"Variant":[{"LEXVAR":["take sth into account"],"LINKWORD":["also <i>又作<\/i>"]}]}]}},{"Entry":{"Head":[{"FREQ":["S3","W2"],"HOMNUM":["2"],"HWD":["account"],"HYPHENATION":["account"],"POS":["v"],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}]}}]}
     * syno : {"synos":[{"syno":{"pos":"n.","tran":"[会计]帐户；解释；帐目，帐单；理由","ws":[{"w":"interpretation"},{"w":"explanation"},{"w":"construction"},{"w":"sake"},{"w":"reason"}]}},{"syno":{"pos":"vi.","tran":"解释；导致；报帐","ws":[{"w":"result in"},{"w":"to interpret"}]}},{"syno":{"pos":"vt.","tran":"认为；把\u2026视为","ws":[{"w":"count"},{"w":"find"},{"w":"guess"},{"w":"feel"},{"w":"rate"}]}}],"word":"account"}
     * ugc : {"data":{"content":"在广告行业中，account也是一种职能分工，意为客户部，负责与客户对接的工种","num":10,"userName":"爱丽狮"},"success":true}
     * web_trans : {"web-translation":[{"@same":"true","key":"Account","key-speech":"Account","trans":[{"summary":{"line":["...现金日记帐总分记帐分类帐明细分类帐试算表帐户调整工作底稿资产负债表利润表现金流量表会计报表报表附注(分录。1、<b>账户<\/b>(<b>account<\/b>)和会计科目（<b>account<\/b> title）（2）<b>账户<\/b>基本结构第二章会计循环（一）：分录、记账与调整二、<b>账户<\/b>和复式记账."]},"support":900,"url":"","value":"账户"},{"summary":{"line":["然则我进 <b>账目<\/b> ( Accounts )里看，这一注的结算(Clearing)是赢，用关心和珍惜来代替「谢谢与「对不起，多珍惜别人对我们的好。"]},"support":792,"url":"","value":"账目"},{"cls":{"cl":["会计"]},"summary":{"line":["各种各样的 ... accordingly ad.因此,所以;照着 <b>account<\/b> n.记述;解释;<b>帐目 <\/b>accountant n. 会计,会计师 ..."]},"support":675,"url":"","value":"帐目"},{"cls":{"cl":["会计"]},"summary":{"line":["凤凰城安逸谷 ... 帐户 Ledger <b>会计科目 <\/b><b>Account<\/b> 会计分录 Journal entry ..."]},"support":500,"url":"","value":"会计科目"}]},{"key":"account for","key-speech":"account+for","trans":[{"value":"说明"},{"value":"解释"},{"value":"占"},{"value":"报账"}]},{"key":"account sales","key-speech":"account+sales","trans":[{"value":"销货帐"},{"cls":{"cl":["会计"]},"value":"承销清单"},{"value":"销货"},{"cls":{"cl":["贸易"]},"value":"售货清单"}]},{"key":"account title","key-speech":"account+title","trans":[{"cls":{"cl":["会计"]},"value":"会计科目"},{"cls":{"cl":["会计"]},"value":"帐户名称"},{"value":"账户名称"},{"value":"收户名称"}]},{"key":"margin account","key-speech":"margin+account","trans":[{"cls":{"cl":["金融"]},"value":"保证金帐户"},{"value":"保证金账户"},{"value":"孖展户口"},{"value":"融资帐户"}]},{"key":"current account","key-speech":"current+account","trans":[{"value":"经常项目"},{"value":"现金帐户"},{"value":"经常收支"},{"value":"经常帐"}]},{"key":"account policies","key-speech":"account+policies","trans":[{"value":"记帐策略"},{"value":"记帐计谋"},{"value":"账户策略"}]},{"key":"general account","key-speech":"general+account","trans":[{"cls":{"cl":["会计"]},"value":"总帐"},{"value":"一般帐目"},{"value":"总分类账户"},{"value":"一般会计"}]},{"key":"personal account","key-speech":"personal+account","trans":[{"value":"个人账户"},{"value":"人名帐户"},{"value":"人账户"},{"value":"个人帐户"}]},{"key":"account book","key-speech":"account+book","trans":[{"cls":{"cl":["会计"]},"value":"帐簿"},{"value":"账本"},{"value":"帐本"},{"value":"帐册"}]}]}
     * webster : {"encryptedData":"VcKA3WTZEeIeiUjhssApF-Rw8is5r7T_8GW9fsFlNzo8-bWtmAC_OKhiQed5gVHcngAldduVR-6c4THgZnh5rVwJtM4RHPewiAuvihBSWptG_-Kl-41k6vkiEnukWIq3Le90K4Kq3h_E8p34siY5ZyZvANBIp8myJtmPga7ZOTVR_JnvbNlNmbmFPVvHd2Px_hUE52T0zfAsGXmBRn6ru73Jd6pfzShEPRYsVdGhtxwPlo2aBIc0kG2pS-n0w99Ttyx-yayHjEWJJShrhmAOALiRrVSWCYIwndGwzU3WJy1vSIfsIBHmg5Ey27LolGRFJ4GFtvUZRQFEE0LLs1n0ke_dIYBBAof99RwcTf5anbouhYSOUZoA3x-gFim0JfHjTV7JbtzPYECFAe0ccDBluJdRAKiHM8io65LHCZZrvggycn-re_MWp93bIfMPPZrraYQbnCCMaZQKrqA34u-D2Hh8HwUYsRtTPwooAvOSvYY_Ek3jx19pOAH3Yk8yRRHZjX0D8R5ArPh-TZ1qDeh4aHxqIeAlzslfDMcmIsuw5UqfZya6HzNLT_R5KuwgixCHmucfZ70qd564SmRHtuL3_qiZXCmLSw6rJpBcud_bV2elsO4e8gyjAxH9rL5Y-IL_e_meMvz0SVuZ3hdeM71UgQyNJuvNZ9PuprT0OLeAjbpqMjPhS6se-kJ0hQmjydXErnFBxzX-SqKkKrRSkIivBjX4_au8CjUeY2fib45yGsGhzjcr9R-IvIzXUAY02xrxNbIxbqx8Zkfljz4zu6CHU1Wb7hE9x9rXmNZ0o_llwh2HgA5tC8GqYBym-oB6OKKfT3hPdZ4Uvlnx02R2hD-ALeoPBgxjSK4SQFWUk-2FvgHQ7-1BG7QvUl2x9JIgjsPQXnaq0j7pqIFsJYRGgFcxYEFehUEQri_Cq3zMXAT5nK8UGo3sHq_zWCTlRhtkYaxzCXMeTs4zSYz3HFCNDtNBWUbca0aEwwOQMFpG2dT6tDYOsH4uFbi1feP9jBG8xrccGZ6pGfjgXcFm_pPow4RouYlb64GxxDeu4dzDyNrl4nTXQHd63OQ4VkizzX_iOKwis7DeeBHvXAVJpZSgEJcR2TZaEteA6tE4LJQva-3Rhc3EnT9mMYuVFEvV0anPVeltArxwUDxz0ktBEmpMG_-XU8VoubM4T4xpLGUDJe97JioDzgryvaT9TF7bmLBHCELmTC--JhVTsKhtiSQNpKOtEFEjKSBTZwju2Fk5xiZ9OL6y2bHO2n9BgKxIR-jauJHv7wqJoVOuY5-nOUk2nOvnBjDUqwds4EoBsj5ZRZsPZ8YZcfSbQ_szS6F7ApP5T2nY-vwDClr3LrZbTHJgRca_Kz1iFGHXwJ1hU0ERvZftx206eYkJowvjOmt8ckjuN8HgXEheD3kcuvWb3Aa0tAxPkfu0HAPAOcQDSq6ZQ4oYKFxXbBncKwoKd84lHEtkstLBT5OAfEsWVZCvNzen_BOi7CbDQV3yEojlL8ySwRPjjovyR23paciFvPMFcQsdkWjM0sSBMRthmR_6ozIyKNe8oBYA2YMUHjJdAhakrrWPa1EP7nl1F92ulvLZhe-n7SJpDewginOPu0zuwLqkG2H4b6UGKCfAGIM2lotZ--_cgHL_QCvJg3IuyKfrcwhAplhSvRXvWUhATI4VOiidkPEQdtZ_zlL4LE13skmhx4oO3x8uWC7Xj1eo-h4PJ1AsEtM1-lTq7uU2zWnNmrHjACl3jdoj5-UZcqekBMc3SFjFze2ov3g2oyloJKgBOh-Oeig3Z5ADIVrYOU2LJhvxdR4eo26YfbjsKrEJo7mdXtuSn5u323VSupB-r2tzdFdPVOJHcrtreHArd66054kwn5fLNhk05fSJEXKVB9gsM6iNxg320Cc2A7OV3MtU84fTQI_yH0X3DuSvzcmm_FdXZ3XFyYt0Tomnns3CI_JW3Tk5819u9dcKa81iHo4Alj0c-3nsp7XK14rL0tGBYukBW-muGgIw0QucChhhMjtcorECyTPYKiFkNi0cXtbtXtjqPknFm0PjKDm5G_BNOFBzW0e4muXDstJPTBj85J7wuQyj3o8JshV_1l32vsEeEZ_mESkKuVLZqPhF0H-ljtEKNdbg1NRW0O7tHenUv3zaiILIGt8jgnFJUsHYB1LomqTlb64Ai8ZQIoZP3RMb04D3L4rprTcAanqYi6S7kVn1-kgmPJ2EWuWzVDABBwBkt2nk6JqAAK0uI56ncI8bHblF5u_ZkPigPYVhiTuMpPLaZOYeRQPjREDDkNHUzoemfbeqc-uSJMN-lvC6MAcRkhgbtCRJqNlKqZKE6XJhXtnvKlutjCxK4Wf5zMMdEzh8gEVjZiK_k47ExQSlrh9EF8WcGtYtI-1mZqiHC_gQZkTEzqFK39C5vmuj4B6WvfKXOIsUIVlt1CBlb10SM7pVUHF4wfXJ0IPgT-XiYXZNUAT3akSP7MW5-0x2BTl-YNm9wbihFv4TbuavT7bODrb_5G5J3uR8alYoAel8h9PeYLam8jGA3uTef5MCzpnPKmb21Cm0JHIw5aJkw0SraDEzqhFPkp2HtOpOjSYf9xviE7iRUoEKjs6eHJwPA6HFIWvgmTjxBQG1bZ6uKT0ej6V0l2ZxxSiO4Hw9ZkzcmcpZzTuDGbBRQNyxIL1gF3LvGfr7M8MwZQeqbhXZ8qc-YGxivs0C15auvup2B4eBNVZUrj9YqHX9iNJ08HjuniDnGpCaRK_3hwzffzo5Wv9xkGJs-gjtY_mEIz2GqzqkR7BX7AW9U3KCtWwJzNjJJ00df0D6QOuhjqtBH49Vz5zIP1066RtsUNOVYnnlThoLIV_ChyIy-qIUR5Mh8Y18I05YRegchSIivJQXpmcgjoRK1pS8n8hjz85Hn8Z5GalSrZ9GU5bvjNFAgfz1xAy9W9wbfOPYPiT6GEoz2iKvEWk27XwCzNEiftZ7fytKzofIfmL4CpvKETomls0rYpcLOoY8R3dKXfEag-YjZgCrKfXisBzhObrbBglAE8Ud6vCHdmiqjS4gbtCMfa4B5UfDJo5mRiaja0uPpmUVUPxQyB_3Z195wdGaSxhnQ3zfxbJVb_ER7KcwmLf1hE_GyuZ1cN5sfsgkMUc1ZwjklUSsO1HPpExhedUZ6dEUwcZBKPGqSLID8_DiXLqREUPkLO-eLWOtttGx27cQNzC5B4vk37i-EY-pA8hxv5a72bhN4g4j87GNFCPNY74OpRl2MLO2cAj8MSrfwB6cKffwlX5U4t_Ys-OfQTVv9SsaDgu61pNBA-wwLl2P1fxzGcnl4u6nQgZ6cszpsky24K82xUKRJ0PaWjt-OxtyhbNadDr5NeKcy1yF-K4-TTI8Q5L96_yFtbvljCZSPfqJABpli2xNWRbiEywhJgbfoduMoc5rM8igHJm48YqQCJqGPagjj6L6sdpoJxcH2MQfkMLzYYv0fEpmoIuyQnochf7sLUeg5GlZQVmuqZZykZOnKn1NcTO4C0grsdPgPgnVsHj_Sr1rvTJ_LmLJD_9fBitwe6CE3UVJJS1M0_PMUcjyzmOz-IclayomOifxNAH9X4Ry4ChwoYBHu0sgBXeH0g6v7fZn2MYSRIrAwv_ijN68RNz3bOJLvR3QjHl3FKEwuN8wwFxQAu2IHAOPhFEMy9Ah1BG1FbkyVrJGAPnXnZTfWVYaTFechX1Q15z1KvLPbv1u_439dGFq6ez1M_Zt3FiIIo4X_nxmGnvfUXKUmRcyCW8q6JrI5NAJNknJOeUER38P_X1EsyEgUmMEoxKSmZYQlKkdbzwLatEHtD9VfUzb3SOR4TBMO1k0PXFg4BeRD71YCVy4UbNMTTXJmbrxJVPPZRbW7msgqWCfyru8CMCYKWhg8oRDzgGtAh13HFu08H_-HKi4mbCeykBVQlS3pKL7P5cAbtGTf4WSvoXWYMSeUuDWyiOO5UVJIvW4cU_My3w__aPH3A2r_q1GfFvk7_izbHZMxomDliq-wMXulbfKAHMVibJs1ZNvQx52gq_AKi5adn0vbLlTDswsgLEnhgH2xJdMBgDEporqskhTaw_9ANsxX0CpP9GojYS9H2zyD0IWI2cE_o61pE0pXmQJA8wHxXbabA0_hfoYETOZVXQaN6NFylYRYhfuCMwhOkyb7j7qxjA0EeiDuccfxlDB_YxkTNEcrRs9Wb7JcEeUcVpSZUDo1TcRGV6jngXGnbvxWbg4A9suNAJn_eaUABqXhiLe1rl8HhFUvTHUJ5qYKie4PqP4nRO_rCAaFfEWxf7CpL03gVeeBuIQJNRP8Nbin2TcqZdccmImwRVlJjz3A8N4qLqKW2YUHlCsmmAJ3iBOEM0AiOGRxRl4jCGCU6d4oGN2x31RxYTWc55iyVHpNyLIC53JMnaVMK-Zt-pl4IhS-mudmkgaeqM8D9G5g4FTpeyRl7I7nD2p-XoMa7czoUtfUx3yJOMuJnZNw80xq4Gp0KcuzgqKARB1lqG3Sday-7pSuLeX3jcBjCBQstHGRVUwFyOAOIW-WHd2W-qSeCS5rGOr2dF6ssr8cmT-bjY0MBOkCUpd6390Dou6ZAr4-0NaBFgsw3EvMfqmPSqRlB7Pj5uLFP-toRtMjRO55qNd7TNhOWKlAOWDDFejrCP5-7-XvE2Fqne6yv155KPBfdjXmrFsxU2MHKkL8AbHr4QB2Lxfwn0KYLaxOkIVZn8ua0xFQUPuKQZ1DkuYv6ChncnNg4QJzR2jck5ESYlO9KUGB4EBCFVAfSB22jJbhXkx96xw1vTk-QU3uYvgihXDc6NM8ovv0GetMbBc3_yYOHO-Z13whmWTt4oN__dtr9jDOpHfiCsgz8IbXgC1Kb87-fA0RSlORLbrQXTBW1uOXYOKL9fA7hd6JtrTRwTvAwts4aO-cA7XYhVI28USTihBh5FLtqhuUvm4ogMV4lWECqIP6SBbJx9avOZGntGQHFXS4Ueg7PBjPsZaNRb5wAN_y4kpLjAL4T6fSn7glinTH3z-9YGgwCYiyRiOqPCdIdkwPZZRxmeSfWWSA3LoN5UesS852j58mQDBhMDJ3YVM-pqN-JLpB6WNlkMSvd9N0DGdExLAovPMVv52a9XhHc6_Qn8LjgfayyuQJYhN9Bcm31JbDiNqR78lVIB1KMe0-p9SG51W87RuGSPNDAHonqtTjRE0UN2OCCM4TdNzC3fA-opHDoLxMw=="}
     * wikipedia_digest : {"source":{"name":"维基百科","url":"http://en.wikipedia.org/wiki/Account"},"summarys":[{"key":"Account","summary":"Account may refer to:Accounts is a British term for financial statements."}]}
     */

    private AuthSentsPartBean auth_sents_part;
    private BlngSentsPartBean blng_sents_part;
    private CollinsBean collins;
    private EcBean ec;
    private Ec21Bean ec21;
    private EeBean ee;
    private EtymBean etym;
    private ExamDictBean exam_dict;
    private String input;
    private String lang;
    private String le;
    private LongmanBean longman;
    private MediaSentsPartBean media_sents_part;
    private MetaBean meta;
    private OxfordBean oxford;
    private PhrsBeanXX phrs;
    private RelWordBean rel_word;
    private SimpleBean simple;
    private SpecialBean special;
    private SplongmanBean splongman;
    private SynoBeanX syno;
    private UgcBean ugc;
    private WebTransBean web_trans;
    private WebsterBean webster;
    private WikipediaDigestBean wikipedia_digest;

    public AuthSentsPartBean getAuth_sents_part() {
        return auth_sents_part;
    }

    public void setAuth_sents_part(AuthSentsPartBean auth_sents_part) {
        this.auth_sents_part = auth_sents_part;
    }

    public BlngSentsPartBean getBlng_sents_part() {
        return blng_sents_part;
    }

    public void setBlng_sents_part(BlngSentsPartBean blng_sents_part) {
        this.blng_sents_part = blng_sents_part;
    }

    public CollinsBean getCollins() {
        return collins;
    }

    public void setCollins(CollinsBean collins) {
        this.collins = collins;
    }

    public EcBean getEc() {
        return ec;
    }

    public void setEc(EcBean ec) {
        this.ec = ec;
    }

    public Ec21Bean getEc21() {
        return ec21;
    }

    public void setEc21(Ec21Bean ec21) {
        this.ec21 = ec21;
    }

    public EeBean getEe() {
        return ee;
    }

    public void setEe(EeBean ee) {
        this.ee = ee;
    }

    public EtymBean getEtym() {
        return etym;
    }

    public void setEtym(EtymBean etym) {
        this.etym = etym;
    }

    public ExamDictBean getExam_dict() {
        return exam_dict;
    }

    public void setExam_dict(ExamDictBean exam_dict) {
        this.exam_dict = exam_dict;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLe() {
        return le;
    }

    public void setLe(String le) {
        this.le = le;
    }

    public LongmanBean getLongman() {
        return longman;
    }

    public void setLongman(LongmanBean longman) {
        this.longman = longman;
    }

    public MediaSentsPartBean getMedia_sents_part() {
        return media_sents_part;
    }

    public void setMedia_sents_part(MediaSentsPartBean media_sents_part) {
        this.media_sents_part = media_sents_part;
    }

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public OxfordBean getOxford() {
        return oxford;
    }

    public void setOxford(OxfordBean oxford) {
        this.oxford = oxford;
    }

    public PhrsBeanXX getPhrs() {
        return phrs;
    }

    public void setPhrs(PhrsBeanXX phrs) {
        this.phrs = phrs;
    }

    public RelWordBean getRel_word() {
        return rel_word;
    }

    public void setRel_word(RelWordBean rel_word) {
        this.rel_word = rel_word;
    }

    public SimpleBean getSimple() {
        return simple;
    }

    public void setSimple(SimpleBean simple) {
        this.simple = simple;
    }

    public SpecialBean getSpecial() {
        return special;
    }

    public void setSpecial(SpecialBean special) {
        this.special = special;
    }

    public SplongmanBean getSplongman() {
        return splongman;
    }

    public void setSplongman(SplongmanBean splongman) {
        this.splongman = splongman;
    }

    public SynoBeanX getSyno() {
        return syno;
    }

    public void setSyno(SynoBeanX syno) {
        this.syno = syno;
    }

    public UgcBean getUgc() {
        return ugc;
    }

    public void setUgc(UgcBean ugc) {
        this.ugc = ugc;
    }

    public WebTransBean getWeb_trans() {
        return web_trans;
    }

    public void setWeb_trans(WebTransBean web_trans) {
        this.web_trans = web_trans;
    }

    public WebsterBean getWebster() {
        return webster;
    }

    public void setWebster(WebsterBean webster) {
        this.webster = webster;
    }

    public WikipediaDigestBean getWikipedia_digest() {
        return wikipedia_digest;
    }

    public void setWikipedia_digest(WikipediaDigestBean wikipedia_digest) {
        this.wikipedia_digest = wikipedia_digest;
    }

    public static class AuthSentsPartBean {
        /**
         * more : auth_sents
         * sent : [{"foreign":"This purchase will <b>account<\/b> for 39.5% of the outstanding shares of the brokerage following the issuance. ","score":0.9831430912017822,"source":"FORBES: <i>JP Morgan Sweetens Deal That Is Still Sour For Bear Investors<\/i>","speech":"This+purchase+will+account+for+39.5%25+of+the+outstanding+shares+of+the+brokerage+following+the+issuance.+","speech-size":"30kb","url":"http://www.forbes.com/2008/03/24/bear-stearns-jpmorgan-markets-equity-cx_po_0324markets06.html"},{"foreign":"Spouse heirs, of course, can still claim the <b>account<\/b> as their own and name new heirs. ","score":0.9831407070159912,"source":"FORBES: <i>IRA Tips and Traps<\/i>","speech":"Spouse+heirs%2C+of+course%2C+can+still+claim+the+account+as+their+own+and+name+new+heirs.+","speech-size":"25kb","url":"http://www.forbes.com/forbes/2001/0611/216.html"},{"foreign":"Best for having your frequent flier <b>account<\/b> balances within easy reach for spontaneous upgrades. ","score":0.9831383228302002,"source":"BBC: <i>Five best air travel apps<\/i>","speech":"Best+for+having+your+frequent+flier+account+balances+within+easy+reach+for+spontaneous+upgrades.+","speech-size":"28kb","url":"http://www.bbc.com/travel/story/20120619-five-best-air-travel-apps"}]
         * sentence-count : 6
         */

        private String more;
        @SerializedName("sentence-count")
        private int sentencecount;
        private List<SentBean> sent;

        public String getMore() {
            return more;
        }

        public void setMore(String more) {
            this.more = more;
        }

        public int getSentencecount() {
            return sentencecount;
        }

        public void setSentencecount(int sentencecount) {
            this.sentencecount = sentencecount;
        }

        public List<SentBean> getSent() {
            return sent;
        }

        public void setSent(List<SentBean> sent) {
            this.sent = sent;
        }

        public static class SentBean {
            /**
             * foreign : This purchase will <b>account</b> for 39.5% of the outstanding shares of the brokerage following the issuance.
             * score : 0.9831430912017822
             * source : FORBES: <i>JP Morgan Sweetens Deal That Is Still Sour For Bear Investors</i>
             * speech : This+purchase+will+account+for+39.5%25+of+the+outstanding+shares+of+the+brokerage+following+the+issuance.+
             * speech-size : 30kb
             * url : http://www.forbes.com/2008/03/24/bear-stearns-jpmorgan-markets-equity-cx_po_0324markets06.html
             */

            private String foreign;
            private double score;
            private String source;
            private String speech;
            @SerializedName("speech-size")
            private String speechsize;
            private String url;

            public String getForeign() {
                return foreign;
            }

            public void setForeign(String foreign) {
                this.foreign = foreign;
            }

            public double getScore() {
                return score;
            }

            public void setScore(double score) {
                this.score = score;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getSpeech() {
                return speech;
            }

            public void setSpeech(String speech) {
                this.speech = speech;
            }

            public String getSpeechsize() {
                return speechsize;
            }

            public void setSpeechsize(String speechsize) {
                this.speechsize = speechsize;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }

    public static class BlngSentsPartBean {
        /**
         * more : blng_sents
         * sentence-count : 6
         * sentence-pair : [{"aligned-words":{"src":{"chars":[{"@e":"4","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"12","@id":"1","@s":"5","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]},"q":[{"@e":"12","@s":"5"}]},{"@e":"32","@id":"2","@s":"13","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"2"}]}}]},"tran":{"chars":[{"@e":"2","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"5","@id":"1","@s":"3","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]}},{"@e":"9","@id":"2","@s":"5","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"2"}]}}]}},"sentence":"His account contradicted itself.","sentence-eng":"His <b>account<\/b> contradicted itself.","sentence-speech":"His+account+contradicted+itself.&le=eng","sentence-translation":"他的解释自相矛盾。","source":"《21世纪大英汉词典》","speech-size":"9kb","url":"http://《21世纪大英汉词典》/"},{"aligned-words":{"src":{"chars":[{"@e":"6","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"14","@id":"1","@s":"7","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]}},{"@e":"23","@id":"2","@s":"15","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"5"}]}},{"@e":"28","@id":"3","@s":"24","aligns":{"sc":[{"@id":"3"}],"tc":[{"@id":"2"}]}},{"@e":"32","@id":"4","@s":"29","aligns":{"sc":[{"@id":"4"}],"tc":[{"@id":"3"}]}},{"@e":"40","@id":"5","@s":"33","aligns":{"sc":[{"@id":"5"}],"tc":[{"@id":"4"}]},"q":[{"@e":"40","@s":"33"}]}]},"tran":{"chars":[{"@e":"3","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"5","@id":"1","@s":"3","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]}},{"@e":"6","@id":"2","@s":"5","aligns":{"sc":[{"@id":"3"}],"tc":[{"@id":"2"}]}},{"@e":"8","@id":"3","@s":"6","aligns":{"sc":[{"@id":"4"}],"tc":[{"@id":"3"}]}},{"@e":"11","@id":"4","@s":"9","aligns":{"sc":[{"@id":"5"}],"tc":[{"@id":"4"}]}},{"@e":"13","@id":"5","@s":"11","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"5"}]}}]}},"sentence":"These figures disagree with our account.","sentence-eng":"These figures disagree with our <b>account<\/b>.","sentence-speech":"These+figures+disagree+with+our+account.&le=eng","sentence-translation":"这些数字与我们的账单不符。","source":"《21世纪大英汉词典》","speech-size":"11kb","url":"http://《21世纪大英汉词典》/"},{"aligned-words":{"src":{"chars":[{"@e":"4","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"},{"@id":"3"}]}},{"@e":"9","@id":"1","@s":"5","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"2"}]}},{"@e":"17","@id":"2","@s":"10","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"8"}]},"q":[{"@e":"17","@s":"10"}]},{"@e":"20","@id":"3","@s":"18","aligns":{"sc":[{"@id":"3"}],"tc":[{"@id":"6"}]}},{"@e":"27","@id":"4","@s":"21","aligns":{"sc":[{"@id":"4"}],"tc":[{"@id":"7"}]}},{"@e":"46","@id":"6","@s":"42","aligns":{"sc":[{"@id":"6"}],"tc":[{"@id":"5"}]}}]},"tran":{"chars":[{"@e":"2","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"},{"@id":"3"}]}},{"@e":"4","@id":"2","@s":"2","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"2"}]}},{"@e":"6","@id":"3","@s":"5","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"},{"@id":"3"}]}},{"@e":"11","@id":"5","@s":"7","aligns":{"sc":[{"@id":"6"}],"tc":[{"@id":"5"}]}},{"@e":"12","@id":"6","@s":"11","aligns":{"sc":[{"@id":"3"}],"tc":[{"@id":"6"}]}},{"@e":"14","@id":"7","@s":"12","aligns":{"sc":[{"@id":"4"}],"tc":[{"@id":"7"}]}},{"@e":"16","@id":"8","@s":"14","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"8"}]}}]}},"sentence":"You must account to father what you have done.","sentence-eng":"You must <b>account<\/b> to father what you have done.","sentence-speech":"You+must+account+to+father+what+you+have+done.&le=eng","sentence-translation":"你必须把你的所作所为对父亲解释清楚。","source":"《21世纪大英汉词典》","speech-size":"13kb","url":"http://《21世纪大英汉词典》/"}]
         */

        private String more;
        @SerializedName("sentence-count")
        private int sentencecount;
        @SerializedName("sentence-pair")
        private List<SentencepairBean> sentencepair;

        public String getMore() {
            return more;
        }

        public void setMore(String more) {
            this.more = more;
        }

        public int getSentencecount() {
            return sentencecount;
        }

        public void setSentencecount(int sentencecount) {
            this.sentencecount = sentencecount;
        }

        public List<SentencepairBean> getSentencepair() {
            return sentencepair;
        }

        public void setSentencepair(List<SentencepairBean> sentencepair) {
            this.sentencepair = sentencepair;
        }

        public static class SentencepairBean {
            /**
             * aligned-words : {"src":{"chars":[{"@e":"4","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]},"q":[{"@e":"12","@s":"5"}]},{"@e":"12","@id":"1","@s":"5","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]},"q":[{"@e":"12","@s":"5"}]},{"@e":"32","@id":"2","@s":"13","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"2"}]}}]},"tran":{"chars":[{"@e":"2","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"5","@id":"1","@s":"3","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]}},{"@e":"9","@id":"2","@s":"5","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"2"}]}}]}}
             * sentence : His account contradicted itself.
             * sentence-eng : His <b>account</b> contradicted itself.
             * sentence-speech : His+account+contradicted+itself.&le=eng
             * sentence-translation : 他的解释自相矛盾。
             * source : 《21世纪大英汉词典》
             * speech-size : 9kb
             * url : http://《21世纪大英汉词典》/
             */

            @SerializedName("aligned-words")
            private AlignedwordsBean alignedwords;
            private String sentence;
            @SerializedName("sentence-eng")
            private String sentenceeng;
            @SerializedName("sentence-speech")
            private String sentencespeech;
            @SerializedName("sentence-translation")
            private String sentencetranslation;
            private String source;
            @SerializedName("speech-size")
            private String speechsize;
            private String url;

            public AlignedwordsBean getAlignedwords() {
                return alignedwords;
            }

            public void setAlignedwords(AlignedwordsBean alignedwords) {
                this.alignedwords = alignedwords;
            }

            public String getSentence() {
                return sentence;
            }

            public void setSentence(String sentence) {
                this.sentence = sentence;
            }

            public String getSentenceeng() {
                return sentenceeng;
            }

            public void setSentenceeng(String sentenceeng) {
                this.sentenceeng = sentenceeng;
            }

            public String getSentencespeech() {
                return sentencespeech;
            }

            public void setSentencespeech(String sentencespeech) {
                this.sentencespeech = sentencespeech;
            }

            public String getSentencetranslation() {
                return sentencetranslation;
            }

            public void setSentencetranslation(String sentencetranslation) {
                this.sentencetranslation = sentencetranslation;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getSpeechsize() {
                return speechsize;
            }

            public void setSpeechsize(String speechsize) {
                this.speechsize = speechsize;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public static class AlignedwordsBean {
                /**
                 * src : {"chars":[{"@e":"4","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]},"q":[{"@e":"12","@s":"5"}]},{"@e":"12","@id":"1","@s":"5","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]},"q":[{"@e":"12","@s":"5"}]},{"@e":"32","@id":"2","@s":"13","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"2"}]}}]}
                 * tran : {"chars":[{"@e":"2","@id":"0","@s":"1","aligns":{"sc":[{"@id":"0"}],"tc":[{"@id":"0"}]}},{"@e":"5","@id":"1","@s":"3","aligns":{"sc":[{"@id":"1"}],"tc":[{"@id":"1"}]}},{"@e":"9","@id":"2","@s":"5","aligns":{"sc":[{"@id":"2"}],"tc":[{"@id":"2"}]}}]}
                 */

                private SrcBean src;
                private TranBean tran;

                public SrcBean getSrc() {
                    return src;
                }

                public void setSrc(SrcBean src) {
                    this.src = src;
                }

                public TranBean getTran() {
                    return tran;
                }

                public void setTran(TranBean tran) {
                    this.tran = tran;
                }

                public static class SrcBean {
                    private List<CharsBean> chars;

                    public List<CharsBean> getChars() {
                        return chars;
                    }

                    public void setChars(List<CharsBean> chars) {
                        this.chars = chars;
                    }

                    public static class CharsBean {
                        @SerializedName("@e")
                        private String _$E56; // FIXME check this code
                        @SerializedName("@id")
                        private String _$Id194; // FIXME check this code
                        @SerializedName("@s")
                        private String _$S214; // FIXME check this code
                        private AlignsBean aligns;
                        private List<QBean> q;

                        public String get_$E56() {
                            return _$E56;
                        }

                        public void set_$E56(String _$E56) {
                            this._$E56 = _$E56;
                        }

                        public String get_$Id194() {
                            return _$Id194;
                        }

                        public void set_$Id194(String _$Id194) {
                            this._$Id194 = _$Id194;
                        }

                        public String get_$S214() {
                            return _$S214;
                        }

                        public void set_$S214(String _$S214) {
                            this._$S214 = _$S214;
                        }

                        public AlignsBean getAligns() {
                            return aligns;
                        }

                        public void setAligns(AlignsBean aligns) {
                            this.aligns = aligns;
                        }

                        public List<QBean> getQ() {
                            return q;
                        }

                        public void setQ(List<QBean> q) {
                            this.q = q;
                        }

                        public static class AlignsBean {
                            private List<ScBean> sc;
                            private List<TcBean> tc;

                            public List<ScBean> getSc() {
                                return sc;
                            }

                            public void setSc(List<ScBean> sc) {
                                this.sc = sc;
                            }

                            public List<TcBean> getTc() {
                                return tc;
                            }

                            public void setTc(List<TcBean> tc) {
                                this.tc = tc;
                            }

                            public static class ScBean {
                                @SerializedName("@id")
                                private String _$Id69; // FIXME check this code

                                public String get_$Id69() {
                                    return _$Id69;
                                }

                                public void set_$Id69(String _$Id69) {
                                    this._$Id69 = _$Id69;
                                }
                            }

                            public static class TcBean {
                                @SerializedName("@id")
                                private String _$Id154; // FIXME check this code

                                public String get_$Id154() {
                                    return _$Id154;
                                }

                                public void set_$Id154(String _$Id154) {
                                    this._$Id154 = _$Id154;
                                }
                            }
                        }

                        public static class QBean {
                            @SerializedName("@e")
                            private String _$E264; // FIXME check this code
                            @SerializedName("@s")
                            private String _$S299; // FIXME check this code

                            public String get_$E264() {
                                return _$E264;
                            }

                            public void set_$E264(String _$E264) {
                                this._$E264 = _$E264;
                            }

                            public String get_$S299() {
                                return _$S299;
                            }

                            public void set_$S299(String _$S299) {
                                this._$S299 = _$S299;
                            }
                        }
                    }
                }

                public static class TranBean {
                    private List<CharsBeanX> chars;

                    public List<CharsBeanX> getChars() {
                        return chars;
                    }

                    public void setChars(List<CharsBeanX> chars) {
                        this.chars = chars;
                    }

                    public static class CharsBeanX {
                        @SerializedName("@e")
                        private String _$E156; // FIXME check this code
                        @SerializedName("@id")
                        private String _$Id29; // FIXME check this code
                        @SerializedName("@s")
                        private String _$S181; // FIXME check this code
                        private AlignsBeanX aligns;

                        public String get_$E156() {
                            return _$E156;
                        }

                        public void set_$E156(String _$E156) {
                            this._$E156 = _$E156;
                        }

                        public String get_$Id29() {
                            return _$Id29;
                        }

                        public void set_$Id29(String _$Id29) {
                            this._$Id29 = _$Id29;
                        }

                        public String get_$S181() {
                            return _$S181;
                        }

                        public void set_$S181(String _$S181) {
                            this._$S181 = _$S181;
                        }

                        public AlignsBeanX getAligns() {
                            return aligns;
                        }

                        public void setAligns(AlignsBeanX aligns) {
                            this.aligns = aligns;
                        }

                        public static class AlignsBeanX {
                            private List<ScBeanX> sc;
                            private List<TcBeanX> tc;

                            public List<ScBeanX> getSc() {
                                return sc;
                            }

                            public void setSc(List<ScBeanX> sc) {
                                this.sc = sc;
                            }

                            public List<TcBeanX> getTc() {
                                return tc;
                            }

                            public void setTc(List<TcBeanX> tc) {
                                this.tc = tc;
                            }

                            public static class ScBeanX {
                                @SerializedName("@id")
                                private String _$Id282; // FIXME check this code

                                public String get_$Id282() {
                                    return _$Id282;
                                }

                                public void set_$Id282(String _$Id282) {
                                    this._$Id282 = _$Id282;
                                }
                            }

                            public static class TcBeanX {
                                @SerializedName("@id")
                                private String _$Id132; // FIXME check this code

                                public String get_$Id132() {
                                    return _$Id132;
                                }

                                public void set_$Id132(String _$Id132) {
                                    this._$Id132 = _$Id132;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static class CollinsBean {
        private List<CollinsEntriesBean> collins_entries;

        public List<CollinsEntriesBean> getCollins_entries() {
            return collins_entries;
        }

        public void setCollins_entries(List<CollinsEntriesBean> collins_entries) {
            this.collins_entries = collins_entries;
        }

        public static class CollinsEntriesBean {
            /**
             * basic_entries : {"basic_entry":[{"cet":"CET4 TEM4","headword":"account","wordforms":{"wordform":[{"word":"accounting"},{"word":"accounted"},{"word":"accounts"}]}}]}
             * entries : {"entry":[{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"有些银行使开一个账户困难重重。","eng_sent":"Some banks make it difficult to open an account."}]},"pos_entry":{"pos":"N-COUNT","pos_tips":"可数名词"},"tran":"If you have an <b>account<\/b> with a bank or a similar organization, you have an arrangement to leave your money there and take some out when you need it. 账户"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"所有的三家网络代理公司都夸口说他们已赢得了大客户。","eng_sent":"All three Internet agencies boast they've won major accounts."}]},"pos_entry":{"pos":"N-COUNT","pos_tips":"可数名词"},"prof":"商业","tran":"In business, a regular customer of a company can be referred to as an <b>account<\/b>, especially when the customer is another company. 客户"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"他保存了详细的账目。","eng_sent":"He kept detailed accounts."}]},"pos_entry":{"pos":"N-COUNT","pos_tips":"可数名词"},"prof":"商业","tran":"<b>Accounts<\/b> are detailed records of all the money that a person or business receives and spends. 账目"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"他对那个决定命运的夜晚所发生的事情做了一个详细的报道。","eng_sent":"He gave a detailed account of what happened on the fateful night."}]},"pos_entry":{"pos":"N-COUNT","pos_tips":"可数名词"},"tran":"An <b>account<\/b> is a written or spoken report of something that has happened. 报道"}]},{"tran_entry":[{"seeAlsos":{"seeAlso":[{"seeword":"accounting"},{"seeword":"bank account"},{"seeword":"checking account"},{"seeword":"deposit account"}],"seealso":"see also"}}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"据说，他是一名优秀的教师。","eng_sent":"He is, by all accounts, a superb teacher."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you say that something is true <b>by all accounts<\/b> or <b>from all accounts<\/b>, you believe it is true because other people say so. 据说"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"这些无名的组织在国内或国际政治中都是无足轻重的。","eng_sent":"These obscure groups were of little account in either national or international politics."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"registr":"正式","tran":"If you say that something is <b>of no account<\/b> or <b>of little account<\/b>, you mean that it is very unimportant and is not worth considering. 无足轻重的"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"在对他的债务做最后的评估期间，他被命令先付这家公司50万美元。","eng_sent":"He was ordered to pay the company $500,000 on account pending a final assessment of his liability."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you buy or pay for something <b>on account<\/b>, you pay nothing or only part of the cost at first, and pay the rest later. 以赊账方式"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"那位总统由于嗓子疼拒绝亲自发表演讲。","eng_sent":"The president declined to deliver the speech himself, on account of a sore throat."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"You use <b>on account of<\/b> to introduce the reason or explanation for something. 由于"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"莫丽告诉了我她做过的事情，我真为她感到害怕。","eng_sent":"Mollie told me what she'd done and I was really scared on her account."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"Your feelings <b>on<\/b> someone's <b>account<\/b> are the feelings you have about what they have experienced or might experience, especially when you imagine yourself to be in their situation. 为 (某人的) 缘故 (而感到\u2026)"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"不要因为我而离开。","eng_sent":"Don't leave on my account."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"registr":"口语","tran":"If you tell someone not to do something <b>on<\/b> your <b>account<\/b>, you mean that they should do it only if they want to, and not because they think it will please you. (不) 为 (某人的) 缘故 (而做某事)"}]},{"tran_entry":[{"box_extra":"强调","exam_sents":{"sent":[{"chn_sent":"这种混合物绝对不应当接近沸点。","eng_sent":"On no account should the mixture come near boiling."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you say that something should <b>on no account<\/b> be done, you are emphasizing that it should not be done under any circumstances. 绝对不"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"我告诉他，如果他退出那么他要自负其则。","eng_sent":"I told him if he withdrew it was on his own account."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you do something <b>on<\/b> your <b>own account<\/b>, you do it because you want to and without being asked, and you take responsibility for your own action. 随 (某人) 自己"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"该被告请求将21项相似的犯罪罪行考虑在内。","eng_sent":"The defendant asked for 21 similar offences to be taken into account."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you <b>take<\/b> something <b>into account<\/b>, or <b>take account of<\/b> something, you consider it when you are thinking about a situation or deciding what to do. 考虑到"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"反复提供虚假情报的人应为其行为而受到追究。","eng_sent":"Individuals who repeatedly provide false information should be called to account for their actions."}]},"pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If someone <b>is called, held,<\/b> or <b>brought to account<\/b> for something they have done wrong, they are made to explain why they did it, and are often criticized or punished for it. 追究"}]},{"tran_entry":[{"exam_sents":{"sent":[{"chn_sent":"我们曾经为缺乏准备所阻，但我肯定我们会表现很好的。","eng_sent":"We have been hindered by our lack of preparation, but I'm sure we will give a good account of ourselves."}]},"loc":"英国英语","pos_entry":{"pos":"PHRASE","pos_tips":"习语"},"tran":"If you say that someone <b>gave a good account of<\/b> themselves in a particular situation, you mean that they performed well, although they may not have been completely successful. 表现很好"}]}]}
             * headword : account
             * phonetic : əˈkaʊnt
             * star : 5
             */

            private BasicEntriesBean basic_entries;
            private EntriesBean entries;
            private String headword;
            private String phonetic;
            private String star;

            public BasicEntriesBean getBasic_entries() {
                return basic_entries;
            }

            public void setBasic_entries(BasicEntriesBean basic_entries) {
                this.basic_entries = basic_entries;
            }

            public EntriesBean getEntries() {
                return entries;
            }

            public void setEntries(EntriesBean entries) {
                this.entries = entries;
            }

            public String getHeadword() {
                return headword;
            }

            public void setHeadword(String headword) {
                this.headword = headword;
            }

            public String getPhonetic() {
                return phonetic;
            }

            public void setPhonetic(String phonetic) {
                this.phonetic = phonetic;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public static class BasicEntriesBean {
                private List<BasicEntryBean> basic_entry;

                public List<BasicEntryBean> getBasic_entry() {
                    return basic_entry;
                }

                public void setBasic_entry(List<BasicEntryBean> basic_entry) {
                    this.basic_entry = basic_entry;
                }

                public static class BasicEntryBean {
                    /**
                     * cet : CET4 TEM4
                     * headword : account
                     * wordforms : {"wordform":[{"word":"accounting"},{"word":"accounted"},{"word":"accounts"}]}
                     */

                    private String cet;
                    private String headword;
                    private WordformsBean wordforms;

                    public String getCet() {
                        return cet;
                    }

                    public void setCet(String cet) {
                        this.cet = cet;
                    }

                    public String getHeadword() {
                        return headword;
                    }

                    public void setHeadword(String headword) {
                        this.headword = headword;
                    }

                    public WordformsBean getWordforms() {
                        return wordforms;
                    }

                    public void setWordforms(WordformsBean wordforms) {
                        this.wordforms = wordforms;
                    }

                    public static class WordformsBean {
                        private List<WordformBean> wordform;

                        public List<WordformBean> getWordform() {
                            return wordform;
                        }

                        public void setWordform(List<WordformBean> wordform) {
                            this.wordform = wordform;
                        }

                        public static class WordformBean {
                            /**
                             * word : accounting
                             */

                            private String word;

                            public String getWord() {
                                return word;
                            }

                            public void setWord(String word) {
                                this.word = word;
                            }
                        }
                    }
                }
            }

            public static class EntriesBean {
                private List<EntryBean> entry;

                public List<EntryBean> getEntry() {
                    return entry;
                }

                public void setEntry(List<EntryBean> entry) {
                    this.entry = entry;
                }

                public static class EntryBean {
                    private List<TranEntryBean> tran_entry;

                    public List<TranEntryBean> getTran_entry() {
                        return tran_entry;
                    }

                    public void setTran_entry(List<TranEntryBean> tran_entry) {
                        this.tran_entry = tran_entry;
                    }

                    public static class TranEntryBean {
                        /**
                         * exam_sents : {"sent":[{"chn_sent":"有些银行使开一个账户困难重重。","eng_sent":"Some banks make it difficult to open an account."}]}
                         * pos_entry : {"pos":"N-COUNT","pos_tips":"可数名词"}
                         * tran : If you have an <b>account</b> with a bank or a similar organization, you have an arrangement to leave your money there and take some out when you need it. 账户
                         */

                        private ExamSentsBean exam_sents;
                        private PosEntryBean pos_entry;
                        private String tran;

                        public ExamSentsBean getExam_sents() {
                            return exam_sents;
                        }

                        public void setExam_sents(ExamSentsBean exam_sents) {
                            this.exam_sents = exam_sents;
                        }

                        public PosEntryBean getPos_entry() {
                            return pos_entry;
                        }

                        public void setPos_entry(PosEntryBean pos_entry) {
                            this.pos_entry = pos_entry;
                        }

                        public String getTran() {
                            return tran;
                        }

                        public void setTran(String tran) {
                            this.tran = tran;
                        }

                        public static class ExamSentsBean {
                            private List<SentBeanX> sent;

                            public List<SentBeanX> getSent() {
                                return sent;
                            }

                            public void setSent(List<SentBeanX> sent) {
                                this.sent = sent;
                            }

                            public static class SentBeanX {
                                /**
                                 * chn_sent : 有些银行使开一个账户困难重重。
                                 * eng_sent : Some banks make it difficult to open an account.
                                 */

                                private String chn_sent;
                                private String eng_sent;

                                public String getChn_sent() {
                                    return chn_sent;
                                }

                                public void setChn_sent(String chn_sent) {
                                    this.chn_sent = chn_sent;
                                }

                                public String getEng_sent() {
                                    return eng_sent;
                                }

                                public void setEng_sent(String eng_sent) {
                                    this.eng_sent = eng_sent;
                                }
                            }
                        }

                        public static class PosEntryBean {
                            /**
                             * pos : N-COUNT
                             * pos_tips : 可数名词
                             */

                            private String pos;
                            private String pos_tips;

                            public String getPos() {
                                return pos;
                            }

                            public void setPos(String pos) {
                                this.pos = pos;
                            }

                            public String getPos_tips() {
                                return pos_tips;
                            }

                            public void setPos_tips(String pos_tips) {
                                this.pos_tips = pos_tips;
                            }
                        }
                    }
                }
            }
        }
    }

    public static class EcBean {
        /**
         * exam_type : ["CET6","考研","CET4","IELTS","高中","商务英语","TOEFL"]
         * source : {"name":"有道词典","url":"http://dict.youdao.com"}
         * word : [{"return-phrase":{"l":{"i":"account"}},"trs":[{"tr":[{"l":{"i":["n. 账户；解释；账目，账单；理由；描述"]}}]},{"tr":[{"l":{"i":["vi. 解释；导致；报账"]}}]},{"tr":[{"l":{"i":["vt. 认为；把\u2026视为"]}}]}],"ukphone":"ə'kaʊnt","ukspeech":"account&type=1","usphone":"ə'kaʊnt","usspeech":"account&type=2"}]
         */

        private SourceBean source;
        private List<String> exam_type;
        private List<WordBean> word;

        public SourceBean getSource() {
            return source;
        }

        public void setSource(SourceBean source) {
            this.source = source;
        }

        public List<String> getExam_type() {
            return exam_type;
        }

        public void setExam_type(List<String> exam_type) {
            this.exam_type = exam_type;
        }

        public List<WordBean> getWord() {
            return word;
        }

        public void setWord(List<WordBean> word) {
            this.word = word;
        }

        public static class SourceBean {
            /**
             * name : 有道词典
             * url : http://dict.youdao.com
             */

            private String name;
            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class WordBean {
            /**
             * return-phrase : {"l":{"i":"account"}}
             * trs : [{"tr":[{"l":{"i":["n. 账户；解释；账目，账单；理由；描述"]}}]},{"tr":[{"l":{"i":["vi. 解释；导致；报账"]}}]},{"tr":[{"l":{"i":["vt. 认为；把\u2026视为"]}}]}]
             * ukphone : ə'kaʊnt
             * ukspeech : account&type=1
             * usphone : ə'kaʊnt
             * usspeech : account&type=2
             */

            @SerializedName("return-phrase")
            private ReturnphraseBean returnphrase;
            private String ukphone;
            private String ukspeech;
            private String usphone;
            private String usspeech;
            private List<TrsBean> trs;

            public ReturnphraseBean getReturnphrase() {
                return returnphrase;
            }

            public void setReturnphrase(ReturnphraseBean returnphrase) {
                this.returnphrase = returnphrase;
            }

            public String getUkphone() {
                return ukphone;
            }

            public void setUkphone(String ukphone) {
                this.ukphone = ukphone;
            }

            public String getUkspeech() {
                return ukspeech;
            }

            public void setUkspeech(String ukspeech) {
                this.ukspeech = ukspeech;
            }

            public String getUsphone() {
                return usphone;
            }

            public void setUsphone(String usphone) {
                this.usphone = usphone;
            }

            public String getUsspeech() {
                return usspeech;
            }

            public void setUsspeech(String usspeech) {
                this.usspeech = usspeech;
            }

            public List<TrsBean> getTrs() {
                return trs;
            }

            public void setTrs(List<TrsBean> trs) {
                this.trs = trs;
            }

            public static class ReturnphraseBean {
                /**
                 * l : {"i":"account"}
                 */

                private LBean l;

                public LBean getL() {
                    return l;
                }

                public void setL(LBean l) {
                    this.l = l;
                }

                public static class LBean {
                    /**
                     * i : account
                     */

                    private String i;

                    public String getI() {
                        return i;
                    }

                    public void setI(String i) {
                        this.i = i;
                    }
                }
            }

            public static class TrsBean {
                private List<TrBean> tr;

                public List<TrBean> getTr() {
                    return tr;
                }

                public void setTr(List<TrBean> tr) {
                    this.tr = tr;
                }

                public static class TrBean {
                    /**
                     * l : {"i":["n. 账户；解释；账目，账单；理由；描述"]}
                     */

                    private LBeanX l;

                    public LBeanX getL() {
                        return l;
                    }

                    public void setL(LBeanX l) {
                        this.l = l;
                    }

                    public static class LBeanX {
                        private List<String> i;

                        public List<String> getI() {
                            return i;
                        }

                        public void setI(List<String> i) {
                            this.i = i;
                        }
                    }
                }
            }
        }
    }

    public static class Ec21Bean {
        /**
         * source : {"name":"21世纪大英汉词典"}
         * word : [{"phone":"ə'kaunt","phrs":[{"i":[{"des":{"l":{"i":"＝by all accounts"}},"phr":{"l":{"i":"according to all accounts"}}},{"des":{"l":{"i":"[俚语]＝on account of"}},"phr":{"l":{"i":"account of"}}},{"des":{"l":{"i":"=on all accounts"}},"phr":{"l":{"i":"at all accounts"}}},{"des":{"l":{"i":"与某人结清账目，算账"}},"phr":{"l":{"i":"balance accounts with someone"}}},{"phr":{"l":{"i":"bring to account"}},"tr":[{"l":{"i":"要求\u2026就自己的行为作出解释(或说明、澄清)"}},{"l":{"i":"质问，责问，责骂，斥责，谴责(= call to account)"}}]},{"des":{"l":{"i":"根据各种流传的说法，据各方面所说，据大家所说，人人都这样说；根据报界的报道；一致看法，一致认为"}},"phr":{"l":{"i":"by (或from)all accounts"}}},{"des":{"l":{"i":"据某人自己说"}},"phr":{"l":{"i":"by one's own account"}}},{"phr":{"l":{"i":"call to account"}},"tr":[{"l":{"i":"要求\u2026就自己的行为作出解释(或说明、澄清)，让作解释(为什么做错事)"}},{"l":{"i":"质问，责问；斥责，谴责；要求\u2026承担责任；惩罚"}}]},{"phr":{"l":{"i":"cast accounts"}},"tr":[{"l":{"i":"算账"}},{"l":{"i":"计算，运算"}}]},{"phr":{"l":{"i":"cast up one's accounts"}},"tr":[{"l":{"i":"[俚语]"}},{"l":{"i":"呕吐"}},{"l":{"i":"提供证词告发同犯"}}]},{"des":{"l":{"i":"把\u2026记入某人账内"}},"phr":{"l":{"i":"charge(或put down)something to somebody's account"}}},{"des":{"l":{"i":"与\u2026结清账目，与\u2026结束账户"}},"phr":{"l":{"i":"close an account(或one's accounts)"}}},{"des":{"l":{"i":"[口语]窜改(或伪造)账目，造假账"}},"phr":{"l":{"i":"cook(或doctor) the accounts"}}},{"des":{"l":{"i":"从\u2026中得益，从中得到好处"}},"phr":{"l":{"i":"find one's account in"}}},{"des":{"l":{"i":"未从中得到好处"}},"phr":{"l":{"i":"find no account in"}}},{"des":{"l":{"i":"【商业】作为\u2026的代销(或账户代理)；算在\u2026的账上，归在\u2026名下"}},"phr":{"l":{"i":"for account of"}}},{"des":{"l":{"i":"＝on one's own account"}},"phr":{"l":{"i":"for one's own account"}}},{"des":{"l":{"i":"＝on somebody's account"}},"phr":{"l":{"i":"for somebody's account"}}},{"des":{"l":{"i":"(证券交易所的交易)有待定期结清"}},"phr":{"l":{"i":"for the account"}}},{"des":{"l":{"i":"作为\u2026风险与共的账户代理[常作证券经纪人、股票掮客用语]"}},"phr":{"l":{"i":"for the account and risk of"}}},{"phr":{"l":{"i":"give a bad account of oneself"}},"tr":[{"l":{"i":"干得很糟糕，显得差劲"}},{"l":{"i":"(在体育比赛中)表现拙劣(或不佳)"}}]},{"phr":{"l":{"i":"give a good account of oneself"}},"tr":[{"l":{"i":"充分证明自己有理"}},{"l":{"i":"表现良好；给人好印象(或好感)；干得出色"}},{"l":{"i":"(在体育比赛中)表现出色，大显身手"}}]},{"des":{"l":{"i":"报告；叙述；说明，解释(理由)"}},"phr":{"l":{"i":"give (或render) an account of"}}},{"phr":{"l":{"i":"give an account of oneself"}},"tr":[{"l":{"i":"使(自己)做出某种表现"}},{"l":{"i":"充分证明自己有理[亦作 give a good account of oneself]"}}]},{"phr":{"l":{"i":"give a poor account of oneself"}},"tr":[{"l":{"i":"干得差劲，表现不好"}},{"l":{"i":"(在体育比赛中)表现拙劣(或不佳)"}}]},{"des":{"l":{"i":"[委婉语]死去"}},"phr":{"l":{"i":"go(或gone,be called,sent) to one's (或last或long) account"}}},{"des":{"l":{"i":"[美国口语]死"}},"phr":{"l":{"i":"hand in one's accounts"}}},{"des":{"l":{"i":"[口语]要跟\u2026算账；与\u2026有不愉快的事要解决，与\u2026有争执要解决"}},"phr":{"l":{"i":"have an account to settle with"}}},{"des":{"l":{"i":"使承担责任"}},"phr":{"l":{"i":"hold to account"}}},{"des":{"l":{"i":"与\u2026有账务来往"}},"phr":{"l":{"i":"in account with"}}},{"des":{"l":{"i":"计较"}},"phr":{"l":{"i":"keep account of"}}},{"des":{"l":{"i":"记账"}},"phr":{"l":{"i":"keep accounts"}}},{"des":{"l":{"i":"记载，记录，把\u2026记下来"}},"phr":{"l":{"i":"keep an account of"}}},{"des":{"l":{"i":"把\u2026计算在内；指望，期望，期待；考虑到"}},"phr":{"l":{"i":"lay one's account with(或on, for)"}}},{"des":{"l":{"i":"对\u2026不予考虑，没考虑到，置之度外，不要计较"}},"phr":{"l":{"i":"leave out of account"}}},{"des":{"l":{"i":"重视"}},"phr":{"l":{"i":"make account of"}}},{"des":{"l":{"i":"对\u2026十分(或不大，完全不)重视"}},"phr":{"l":{"i":"make much(或little, no) account of"}}},{"phr":{"l":{"i":"no account"}},"tr":[{"l":{"i":"[美国英语]"}},{"l":{"i":"无关紧要的；没有价值的；不可取的，不可靠的"}},{"l":{"i":"没有社会地位的人，普通人"}}]},{"des":{"l":{"i":"认为没多少价值，不甚重视"}},"phr":{"l":{"i":"not hold of much account"}}},{"des":{"l":{"i":"决不可以，切莫，绝不要，无论如何不要(＝on no account)"}},"phr":{"l":{"i":"not on any account"}}},{"des":{"l":{"i":"有\u2026重要性"}},"phr":{"l":{"i":"of \u2026 account"}}},{"des":{"l":{"i":"不大重要"}},"phr":{"l":{"i":"of little account"}}},{"des":{"l":{"i":"很重要的；很有价值的；很有意义的；很有威望的"}},"phr":{"l":{"i":"of much(或 great) account"}}},{"des":{"l":{"i":"没有价值的；无意义的；无足轻重的，不重要的"}},"phr":{"l":{"i":"of no account"}}},{"des":{"l":{"i":"不大重要的；没有多大价值的"}},"phr":{"l":{"i":"of small account"}}},{"phr":{"l":{"i":"on account"}},"tr":[{"l":{"i":"作为部分账款；预付[亦作to account]"}},{"l":{"i":"以分期付款方式，以赊账方式，赊账"}},{"l":{"i":"[俚语]＝on account of"}}]},{"des":{"l":{"i":"为了\u2026的缘故；因为，由于[亦作 on account， account of]"}},"phr":{"l":{"i":"on account of"}}},{"des":{"l":{"i":"无论如何"}},"phr":{"l":{"i":"on all accounts(或on every account)"}}},{"des":{"l":{"i":"[一般用于否定句]无论如何，不管怎样，不管怎么说"}},"phr":{"l":{"i":"on any account"}}},{"des":{"l":{"i":"＝on all accounts"}},"phr":{"l":{"i":"on every account"}}},{"des":{"l":{"i":"为了我(或你等)的缘故"}},"phr":{"l":{"i":"on my (或 your, etc.) account"}}},{"des":{"l":{"i":"绝对不，决不可以，绝不要，无论如何不要，切莫"}},"phr":{"l":{"i":"on no account"}}},{"phr":{"l":{"i":"on one's own account"}},"tr":[{"l":{"i":"为自身利益"}},{"l":{"i":"独立地；靠自己的力量"}},{"l":{"i":"在自己承担风险的情况下，自担风险地"}}]},{"des":{"l":{"i":"为了某人的利益；为某人的缘故"}},"phr":{"l":{"i":"on(或for)somebody's account"}}},{"des":{"l":{"i":"由于这个(或那个)缘故"}},"phr":{"l":{"i":"on this (或that) account"}}},{"des":{"l":{"i":"在\u2026开一个账户"}},"phr":{"l":{"i":"open an account with"}}},{"des":{"l":{"i":"让记在自己的账上(暂欠不付)"}},"phr":{"l":{"i":"put something down(或add)to one's account"}}},{"des":{"l":{"i":"＝turn to (good) account"}},"phr":{"l":{"i":"put to(good) account"}}},{"des":{"l":{"i":"开送账单；报账"}},"phr":{"l":{"i":"render(或send in) an account"}}},{"phr":{"l":{"i":"run up an account"}},"tr":[{"l":{"i":"赊欠，挂账"}},{"l":{"i":"负债"}},{"l":{"i":"登账"}}]},{"phr":{"l":{"i":"settle(或balance, square) accounts with somebody"}},"tr":[{"l":{"i":"与某人结清账目"}},{"l":{"i":"[比喻]跟某人算账，向某人作清算；解决与某人的争执"}}]},{"des":{"l":{"i":"[谚语]勤结账，交情长。"}},"phr":{"l":{"i":"Short accounts make long friends."}}},{"des":{"l":{"i":"＝settle accounts with somebody"}},"phr":{"l":{"i":"square accounts with somebody"}}},{"phr":{"l":{"i":"take account of"}},"tr":[{"l":{"i":"注意到，留心"}},{"l":{"i":"考虑到；体谅；估及，顾及；重视；为\u2026留有余地"}}]},{"des":{"l":{"i":"把\u2026列表；把\u2026登账"}},"phr":{"l":{"i":"take an account of"}}},{"des":{"l":{"i":"把\u2026考虑进去，考虑到；体谅；估及，顾及；重视"}},"phr":{"l":{"i":"take into account"}}},{"des":{"l":{"i":"对\u2026不予注意(或重视、考虑)"}},"phr":{"l":{"i":"take no account of"}}},{"des":{"l":{"i":"【宗教】最后审判日"}},"phr":{"l":{"i":"the great account"}}},{"des":{"l":{"i":"作为部分账款；预付"}},"phr":{"l":{"i":"to account"}}},{"des":{"l":{"i":"加以利用；从中获利，从中得益"}},"phr":{"l":{"i":"turn(或put)to (good) account"}}}]}],"return-phrase":{"l":{"i":["account"]}},"trs":[{"pos":"vt.","tr":[{"exam":[{"i":{"f":{"l":{"i":"He was accounted a merciful man."}},"n":{"l":{"i":"他被人看做是一位仁者。"}}}},{"i":{"f":{"l":{"i":"I account myself well paid."}},"n":{"l":{"i":"我认为自己得到优厚报酬。(或：我认为给我的报酬相当好。)"}}}}],"l":{"i":["以为，认为，把\u2026看做，把\u2026视作："]}},{"exam":[{"i":{"f":{"l":{"i":"This report will be accounted by the committee."}},"n":{"l":{"i":"委员会将研究这份报告。"}}}}],"l":{"i":["钻研；分析；探究；考虑："]}},{"exam":[{"i":{"f":{"l":{"i":"She has many virtues accounted to her."}},"n":{"l":{"i":"许多美德集于她一身。"}}}}],"l":{"i":["[罕用语]把\u2026归因于，把\u2026归咎于(to)；把\u2026转嫁于(to):"]}}]},{"pos":"vi.","tr":[{"exam":[{"i":{"f":{"l":{"i":"He could not account for the missing funds."}},"n":{"l":{"i":"他无法说清那些钱怎么不见了。"}}}}],"l":{"i":["(向某人)说明钱的用途，(向某人)提供(钱的)开支情况，报账(for):"]}},{"exam":[{"i":{"f":{"l":{"i":"How do you account for the accident?"}},"n":{"l":{"i":"你怎么解释那场事故?"}}}}],"l":{"i":["说明原因(或理由)，提出理由；是\u2026的原因；做出说明(或解释)，解释(for):"]}},{"exam":[{"i":{"f":{"l":{"i":"His reckless driving accounted for the accident."}},"n":{"l":{"i":"他开车鲁莽，引起了这场事故。"}}}}],"l":{"i":["为\u2026负责；导致，引起(与for连用)："]}},{"exam":[{"i":{"f":{"l":{"i":"He will account for his crime."}},"n":{"l":{"i":"他会赎罪的。"}}}}],"l":{"i":["报偿；赎罪；受罚(for):"]}},{"exam":[{"i":{"f":{"l":{"i":"It accounts for 25 per cent of all traffic accidents."}},"n":{"l":{"i":"它占所有交通事故的25%。"}}}}],"l":{"i":["(在数量、比例方面)占；共计达："]}},{"exam":[{"i":{"f":{"l":{"i":"Our battery accounted for three enemy planes."}},"n":{"l":{"i":"我们炮兵连击落了三架敌机。"}}}}],"l":{"i":["[口语]捕获；杀死，打死，射死，干掉，消灭；击落；俘获(与for连用)："]}},{"l":{"i":["【体育】(在比赛中)击败；击出场(for)"]}}]},{"pos":"n.","tr":[{"l":{"i":["(关于特定事务或事件的口头或笔头的)描述，描写；叙述，记述；报道；记事；故事"]}},{"l":{"i":["报告；(尤指对上级的关于自己行为的)陈述，交代"]}},{"l":{"i":["(对某一事件的起因、理由等所作的)解释，说明；考虑，深思熟虑[主要用于on account of， take into account 等短语中]"]}},{"l":{"i":["原因；理由；根据；基础"]}},{"l":{"i":["价值；重要性"]}},{"l":{"i":["估价，估计；判断"]}},{"l":{"i":["利益，好处；利润"]}},{"l":{"i":["[常用复数]传闻，道听途说[主要用于短语 by (或 from)all accounts 中]"]}},{"l":{"i":["[常用复数](有关资产、负债、收入、支出、资本净值的)账，账目；账单，收付清单"]}},{"l":{"i":["银行往来账(＝bank account)"]}},{"l":{"i":["有关某人(或财产、商业等)财务事项的账目"]}},{"l":{"i":["赊购制，允许储户超支(或客户赊购)的业务关系(＝charge account)"]}},{"l":{"i":["(客户购货的)赊购账；允许超支(或赊购)的款数"]}},{"l":{"i":["(顾客定期赊购的)商号，商行，商店，赊欠户"]}},{"l":{"i":["给予储户(或客户)的超支(或赊购等)的权利"]}},{"l":{"i":["[常用复数]待结账目"]}},{"l":{"i":["(会计年度等的)交易结清单；(伦敦股票交易所两周一次的)定期结清"]}},{"l":{"i":["指定期间的收支平衡"]}},{"l":{"i":["账户；交易(或主顾)关系；客户，委托人"]}},{"l":{"i":["算账"]}},{"l":{"i":["委托的广告业务，顾客给予广告商的广告业务；为对产品进行广告宣传而委托给广告代理商的公司(或个人)，客户"]}},{"l":{"i":["(乐曲的)演奏法，演奏(方式)；(体现对作品特定理解的)表演(方式)"]}},{"l":{"i":["[比喻]欠账"]}},{"l":{"i":["[古语]计算；运算"]}}]}]}]
         */

        private SourceBeanX source;
        private List<WordBeanX> word;

        public SourceBeanX getSource() {
            return source;
        }

        public void setSource(SourceBeanX source) {
            this.source = source;
        }

        public List<WordBeanX> getWord() {
            return word;
        }

        public void setWord(List<WordBeanX> word) {
            this.word = word;
        }

        public static class SourceBeanX {
            /**
             * name : 21世纪大英汉词典
             */

            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class WordBeanX {
            /**
             * phone : ə'kaunt
             * phrs : [{"i":[{"des":{"l":{"i":"＝by all accounts"}},"phr":{"l":{"i":"according to all accounts"}}},{"des":{"l":{"i":"[俚语]＝on account of"}},"phr":{"l":{"i":"account of"}}},{"des":{"l":{"i":"=on all accounts"}},"phr":{"l":{"i":"at all accounts"}}},{"des":{"l":{"i":"与某人结清账目，算账"}},"phr":{"l":{"i":"balance accounts with someone"}}},{"phr":{"l":{"i":"bring to account"}},"tr":[{"l":{"i":"要求\u2026就自己的行为作出解释(或说明、澄清)"}},{"l":{"i":"质问，责问，责骂，斥责，谴责(= call to account)"}}]},{"des":{"l":{"i":"根据各种流传的说法，据各方面所说，据大家所说，人人都这样说；根据报界的报道；一致看法，一致认为"}},"phr":{"l":{"i":"by (或from)all accounts"}}},{"des":{"l":{"i":"据某人自己说"}},"phr":{"l":{"i":"by one's own account"}}},{"phr":{"l":{"i":"call to account"}},"tr":[{"l":{"i":"要求\u2026就自己的行为作出解释(或说明、澄清)，让作解释(为什么做错事)"}},{"l":{"i":"质问，责问；斥责，谴责；要求\u2026承担责任；惩罚"}}]},{"phr":{"l":{"i":"cast accounts"}},"tr":[{"l":{"i":"算账"}},{"l":{"i":"计算，运算"}}]},{"phr":{"l":{"i":"cast up one's accounts"}},"tr":[{"l":{"i":"[俚语]"}},{"l":{"i":"呕吐"}},{"l":{"i":"提供证词告发同犯"}}]},{"des":{"l":{"i":"把\u2026记入某人账内"}},"phr":{"l":{"i":"charge(或put down)something to somebody's account"}}},{"des":{"l":{"i":"与\u2026结清账目，与\u2026结束账户"}},"phr":{"l":{"i":"close an account(或one's accounts)"}}},{"des":{"l":{"i":"[口语]窜改(或伪造)账目，造假账"}},"phr":{"l":{"i":"cook(或doctor) the accounts"}}},{"des":{"l":{"i":"从\u2026中得益，从中得到好处"}},"phr":{"l":{"i":"find one's account in"}}},{"des":{"l":{"i":"未从中得到好处"}},"phr":{"l":{"i":"find no account in"}}},{"des":{"l":{"i":"【商业】作为\u2026的代销(或账户代理)；算在\u2026的账上，归在\u2026名下"}},"phr":{"l":{"i":"for account of"}}},{"des":{"l":{"i":"＝on one's own account"}},"phr":{"l":{"i":"for one's own account"}}},{"des":{"l":{"i":"＝on somebody's account"}},"phr":{"l":{"i":"for somebody's account"}}},{"des":{"l":{"i":"(证券交易所的交易)有待定期结清"}},"phr":{"l":{"i":"for the account"}}},{"des":{"l":{"i":"作为\u2026风险与共的账户代理[常作证券经纪人、股票掮客用语]"}},"phr":{"l":{"i":"for the account and risk of"}}},{"phr":{"l":{"i":"give a bad account of oneself"}},"tr":[{"l":{"i":"干得很糟糕，显得差劲"}},{"l":{"i":"(在体育比赛中)表现拙劣(或不佳)"}}]},{"phr":{"l":{"i":"give a good account of oneself"}},"tr":[{"l":{"i":"充分证明自己有理"}},{"l":{"i":"表现良好；给人好印象(或好感)；干得出色"}},{"l":{"i":"(在体育比赛中)表现出色，大显身手"}}]},{"des":{"l":{"i":"报告；叙述；说明，解释(理由)"}},"phr":{"l":{"i":"give (或render) an account of"}}},{"phr":{"l":{"i":"give an account of oneself"}},"tr":[{"l":{"i":"使(自己)做出某种表现"}},{"l":{"i":"充分证明自己有理[亦作 give a good account of oneself]"}}]},{"phr":{"l":{"i":"give a poor account of oneself"}},"tr":[{"l":{"i":"干得差劲，表现不好"}},{"l":{"i":"(在体育比赛中)表现拙劣(或不佳)"}}]},{"des":{"l":{"i":"[委婉语]死去"}},"phr":{"l":{"i":"go(或gone,be called,sent) to one's (或last或long) account"}}},{"des":{"l":{"i":"[美国口语]死"}},"phr":{"l":{"i":"hand in one's accounts"}}},{"des":{"l":{"i":"[口语]要跟\u2026算账；与\u2026有不愉快的事要解决，与\u2026有争执要解决"}},"phr":{"l":{"i":"have an account to settle with"}}},{"des":{"l":{"i":"使承担责任"}},"phr":{"l":{"i":"hold to account"}}},{"des":{"l":{"i":"与\u2026有账务来往"}},"phr":{"l":{"i":"in account with"}}},{"des":{"l":{"i":"计较"}},"phr":{"l":{"i":"keep account of"}}},{"des":{"l":{"i":"记账"}},"phr":{"l":{"i":"keep accounts"}}},{"des":{"l":{"i":"记载，记录，把\u2026记下来"}},"phr":{"l":{"i":"keep an account of"}}},{"des":{"l":{"i":"把\u2026计算在内；指望，期望，期待；考虑到"}},"phr":{"l":{"i":"lay one's account with(或on, for)"}}},{"des":{"l":{"i":"对\u2026不予考虑，没考虑到，置之度外，不要计较"}},"phr":{"l":{"i":"leave out of account"}}},{"des":{"l":{"i":"重视"}},"phr":{"l":{"i":"make account of"}}},{"des":{"l":{"i":"对\u2026十分(或不大，完全不)重视"}},"phr":{"l":{"i":"make much(或little, no) account of"}}},{"phr":{"l":{"i":"no account"}},"tr":[{"l":{"i":"[美国英语]"}},{"l":{"i":"无关紧要的；没有价值的；不可取的，不可靠的"}},{"l":{"i":"没有社会地位的人，普通人"}}]},{"des":{"l":{"i":"认为没多少价值，不甚重视"}},"phr":{"l":{"i":"not hold of much account"}}},{"des":{"l":{"i":"决不可以，切莫，绝不要，无论如何不要(＝on no account)"}},"phr":{"l":{"i":"not on any account"}}},{"des":{"l":{"i":"有\u2026重要性"}},"phr":{"l":{"i":"of \u2026 account"}}},{"des":{"l":{"i":"不大重要"}},"phr":{"l":{"i":"of little account"}}},{"des":{"l":{"i":"很重要的；很有价值的；很有意义的；很有威望的"}},"phr":{"l":{"i":"of much(或 great) account"}}},{"des":{"l":{"i":"没有价值的；无意义的；无足轻重的，不重要的"}},"phr":{"l":{"i":"of no account"}}},{"des":{"l":{"i":"不大重要的；没有多大价值的"}},"phr":{"l":{"i":"of small account"}}},{"phr":{"l":{"i":"on account"}},"tr":[{"l":{"i":"作为部分账款；预付[亦作to account]"}},{"l":{"i":"以分期付款方式，以赊账方式，赊账"}},{"l":{"i":"[俚语]＝on account of"}}]},{"des":{"l":{"i":"为了\u2026的缘故；因为，由于[亦作 on account， account of]"}},"phr":{"l":{"i":"on account of"}}},{"des":{"l":{"i":"无论如何"}},"phr":{"l":{"i":"on all accounts(或on every account)"}}},{"des":{"l":{"i":"[一般用于否定句]无论如何，不管怎样，不管怎么说"}},"phr":{"l":{"i":"on any account"}}},{"des":{"l":{"i":"＝on all accounts"}},"phr":{"l":{"i":"on every account"}}},{"des":{"l":{"i":"为了我(或你等)的缘故"}},"phr":{"l":{"i":"on my (或 your, etc.) account"}}},{"des":{"l":{"i":"绝对不，决不可以，绝不要，无论如何不要，切莫"}},"phr":{"l":{"i":"on no account"}}},{"phr":{"l":{"i":"on one's own account"}},"tr":[{"l":{"i":"为自身利益"}},{"l":{"i":"独立地；靠自己的力量"}},{"l":{"i":"在自己承担风险的情况下，自担风险地"}}]},{"des":{"l":{"i":"为了某人的利益；为某人的缘故"}},"phr":{"l":{"i":"on(或for)somebody's account"}}},{"des":{"l":{"i":"由于这个(或那个)缘故"}},"phr":{"l":{"i":"on this (或that) account"}}},{"des":{"l":{"i":"在\u2026开一个账户"}},"phr":{"l":{"i":"open an account with"}}},{"des":{"l":{"i":"让记在自己的账上(暂欠不付)"}},"phr":{"l":{"i":"put something down(或add)to one's account"}}},{"des":{"l":{"i":"＝turn to (good) account"}},"phr":{"l":{"i":"put to(good) account"}}},{"des":{"l":{"i":"开送账单；报账"}},"phr":{"l":{"i":"render(或send in) an account"}}},{"phr":{"l":{"i":"run up an account"}},"tr":[{"l":{"i":"赊欠，挂账"}},{"l":{"i":"负债"}},{"l":{"i":"登账"}}]},{"phr":{"l":{"i":"settle(或balance, square) accounts with somebody"}},"tr":[{"l":{"i":"与某人结清账目"}},{"l":{"i":"[比喻]跟某人算账，向某人作清算；解决与某人的争执"}}]},{"des":{"l":{"i":"[谚语]勤结账，交情长。"}},"phr":{"l":{"i":"Short accounts make long friends."}}},{"des":{"l":{"i":"＝settle accounts with somebody"}},"phr":{"l":{"i":"square accounts with somebody"}}},{"phr":{"l":{"i":"take account of"}},"tr":[{"l":{"i":"注意到，留心"}},{"l":{"i":"考虑到；体谅；估及，顾及；重视；为\u2026留有余地"}}]},{"des":{"l":{"i":"把\u2026列表；把\u2026登账"}},"phr":{"l":{"i":"take an account of"}}},{"des":{"l":{"i":"把\u2026考虑进去，考虑到；体谅；估及，顾及；重视"}},"phr":{"l":{"i":"take into account"}}},{"des":{"l":{"i":"对\u2026不予注意(或重视、考虑)"}},"phr":{"l":{"i":"take no account of"}}},{"des":{"l":{"i":"【宗教】最后审判日"}},"phr":{"l":{"i":"the great account"}}},{"des":{"l":{"i":"作为部分账款；预付"}},"phr":{"l":{"i":"to account"}}},{"des":{"l":{"i":"加以利用；从中获利，从中得益"}},"phr":{"l":{"i":"turn(或put)to (good) account"}}}]}]
             * return-phrase : {"l":{"i":["account"]}}
             * trs : [{"pos":"vt.","tr":[{"exam":[{"i":{"f":{"l":{"i":"He was accounted a merciful man."}},"n":{"l":{"i":"他被人看做是一位仁者。"}}}},{"i":{"f":{"l":{"i":"I account myself well paid."}},"n":{"l":{"i":"我认为自己得到优厚报酬。(或：我认为给我的报酬相当好。)"}}}}],"l":{"i":["以为，认为，把\u2026看做，把\u2026视作："]}},{"exam":[{"i":{"f":{"l":{"i":"This report will be accounted by the committee."}},"n":{"l":{"i":"委员会将研究这份报告。"}}}}],"l":{"i":["钻研；分析；探究；考虑："]}},{"exam":[{"i":{"f":{"l":{"i":"She has many virtues accounted to her."}},"n":{"l":{"i":"许多美德集于她一身。"}}}}],"l":{"i":["[罕用语]把\u2026归因于，把\u2026归咎于(to)；把\u2026转嫁于(to):"]}}]},{"pos":"vi.","tr":[{"exam":[{"i":{"f":{"l":{"i":"He could not account for the missing funds."}},"n":{"l":{"i":"他无法说清那些钱怎么不见了。"}}}}],"l":{"i":["(向某人)说明钱的用途，(向某人)提供(钱的)开支情况，报账(for):"]}},{"exam":[{"i":{"f":{"l":{"i":"How do you account for the accident?"}},"n":{"l":{"i":"你怎么解释那场事故?"}}}}],"l":{"i":["说明原因(或理由)，提出理由；是\u2026的原因；做出说明(或解释)，解释(for):"]}},{"exam":[{"i":{"f":{"l":{"i":"His reckless driving accounted for the accident."}},"n":{"l":{"i":"他开车鲁莽，引起了这场事故。"}}}}],"l":{"i":["为\u2026负责；导致，引起(与for连用)："]}},{"exam":[{"i":{"f":{"l":{"i":"He will account for his crime."}},"n":{"l":{"i":"他会赎罪的。"}}}}],"l":{"i":["报偿；赎罪；受罚(for):"]}},{"exam":[{"i":{"f":{"l":{"i":"It accounts for 25 per cent of all traffic accidents."}},"n":{"l":{"i":"它占所有交通事故的25%。"}}}}],"l":{"i":["(在数量、比例方面)占；共计达："]}},{"exam":[{"i":{"f":{"l":{"i":"Our battery accounted for three enemy planes."}},"n":{"l":{"i":"我们炮兵连击落了三架敌机。"}}}}],"l":{"i":["[口语]捕获；杀死，打死，射死，干掉，消灭；击落；俘获(与for连用)："]}},{"l":{"i":["【体育】(在比赛中)击败；击出场(for)"]}}]},{"pos":"n.","tr":[{"l":{"i":["(关于特定事务或事件的口头或笔头的)描述，描写；叙述，记述；报道；记事；故事"]}},{"l":{"i":["报告；(尤指对上级的关于自己行为的)陈述，交代"]}},{"l":{"i":["(对某一事件的起因、理由等所作的)解释，说明；考虑，深思熟虑[主要用于on account of， take into account 等短语中]"]}},{"l":{"i":["原因；理由；根据；基础"]}},{"l":{"i":["价值；重要性"]}},{"l":{"i":["估价，估计；判断"]}},{"l":{"i":["利益，好处；利润"]}},{"l":{"i":["[常用复数]传闻，道听途说[主要用于短语 by (或 from)all accounts 中]"]}},{"l":{"i":["[常用复数](有关资产、负债、收入、支出、资本净值的)账，账目；账单，收付清单"]}},{"l":{"i":["银行往来账(＝bank account)"]}},{"l":{"i":["有关某人(或财产、商业等)财务事项的账目"]}},{"l":{"i":["赊购制，允许储户超支(或客户赊购)的业务关系(＝charge account)"]}},{"l":{"i":["(客户购货的)赊购账；允许超支(或赊购)的款数"]}},{"l":{"i":["(顾客定期赊购的)商号，商行，商店，赊欠户"]}},{"l":{"i":["给予储户(或客户)的超支(或赊购等)的权利"]}},{"l":{"i":["[常用复数]待结账目"]}},{"l":{"i":["(会计年度等的)交易结清单；(伦敦股票交易所两周一次的)定期结清"]}},{"l":{"i":["指定期间的收支平衡"]}},{"l":{"i":["账户；交易(或主顾)关系；客户，委托人"]}},{"l":{"i":["算账"]}},{"l":{"i":["委托的广告业务，顾客给予广告商的广告业务；为对产品进行广告宣传而委托给广告代理商的公司(或个人)，客户"]}},{"l":{"i":["(乐曲的)演奏法，演奏(方式)；(体现对作品特定理解的)表演(方式)"]}},{"l":{"i":["[比喻]欠账"]}},{"l":{"i":["[古语]计算；运算"]}}]}]
             */

            private String phone;
            @SerializedName("return-phrase")
            private ReturnphraseBeanX returnphrase;
            private List<PhrsBean> phrs;
            private List<TrsBeanX> trs;

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public ReturnphraseBeanX getReturnphrase() {
                return returnphrase;
            }

            public void setReturnphrase(ReturnphraseBeanX returnphrase) {
                this.returnphrase = returnphrase;
            }

            public List<PhrsBean> getPhrs() {
                return phrs;
            }

            public void setPhrs(List<PhrsBean> phrs) {
                this.phrs = phrs;
            }

            public List<TrsBeanX> getTrs() {
                return trs;
            }

            public void setTrs(List<TrsBeanX> trs) {
                this.trs = trs;
            }

            public static class ReturnphraseBeanX {
                /**
                 * l : {"i":["account"]}
                 */

                private LBeanXX l;

                public LBeanXX getL() {
                    return l;
                }

                public void setL(LBeanXX l) {
                    this.l = l;
                }

                public static class LBeanXX {
                    private List<String> i;

                    public List<String> getI() {
                        return i;
                    }

                    public void setI(List<String> i) {
                        this.i = i;
                    }
                }
            }

            public static class PhrsBean {
                private List<IBean> i;

                public List<IBean> getI() {
                    return i;
                }

                public void setI(List<IBean> i) {
                    this.i = i;
                }

                public static class IBean {
                    /**
                     * des : {"l":{"i":"＝by all accounts"}}
                     * phr : {"l":{"i":"according to all accounts"}}
                     * tr : [{"l":{"i":"要求\u2026就自己的行为作出解释(或说明、澄清)"}},{"l":{"i":"质问，责问，责骂，斥责，谴责(= call to account)"}}]
                     */

                    private DesBean des;
                    private PhrBean phr;
                    private List<TrBeanX> tr;

                    public DesBean getDes() {
                        return des;
                    }

                    public void setDes(DesBean des) {
                        this.des = des;
                    }

                    public PhrBean getPhr() {
                        return phr;
                    }

                    public void setPhr(PhrBean phr) {
                        this.phr = phr;
                    }

                    public List<TrBeanX> getTr() {
                        return tr;
                    }

                    public void setTr(List<TrBeanX> tr) {
                        this.tr = tr;
                    }

                    public static class DesBean {
                        /**
                         * l : {"i":"＝by all accounts"}
                         */

                        private LBeanXXX l;

                        public LBeanXXX getL() {
                            return l;
                        }

                        public void setL(LBeanXXX l) {
                            this.l = l;
                        }

                        public static class LBeanXXX {
                            /**
                             * i : ＝by all accounts
                             */

                            private String i;

                            public String getI() {
                                return i;
                            }

                            public void setI(String i) {
                                this.i = i;
                            }
                        }
                    }

                    public static class PhrBean {
                        /**
                         * l : {"i":"according to all accounts"}
                         */

                        private LBeanXXXX l;

                        public LBeanXXXX getL() {
                            return l;
                        }

                        public void setL(LBeanXXXX l) {
                            this.l = l;
                        }

                        public static class LBeanXXXX {
                            /**
                             * i : according to all accounts
                             */

                            private String i;

                            public String getI() {
                                return i;
                            }

                            public void setI(String i) {
                                this.i = i;
                            }
                        }
                    }

                    public static class TrBeanX {
                        /**
                         * l : {"i":"要求\u2026就自己的行为作出解释(或说明、澄清)"}
                         */

                        private LBeanXXXXX l;

                        public LBeanXXXXX getL() {
                            return l;
                        }

                        public void setL(LBeanXXXXX l) {
                            this.l = l;
                        }

                        public static class LBeanXXXXX {
                            /**
                             * i : 要求…就自己的行为作出解释(或说明、澄清)
                             */

                            private String i;

                            public String getI() {
                                return i;
                            }

                            public void setI(String i) {
                                this.i = i;
                            }
                        }
                    }
                }
            }

            public static class TrsBeanX {
                /**
                 * pos : vt.
                 * tr : [{"exam":[{"i":{"f":{"l":{"i":"He was accounted a merciful man."}},"n":{"l":{"i":"他被人看做是一位仁者。"}}}},{"i":{"f":{"l":{"i":"I account myself well paid."}},"n":{"l":{"i":"我认为自己得到优厚报酬。(或：我认为给我的报酬相当好。)"}}}}],"l":{"i":["以为，认为，把\u2026看做，把\u2026视作："]}},{"exam":[{"i":{"f":{"l":{"i":"This report will be accounted by the committee."}},"n":{"l":{"i":"委员会将研究这份报告。"}}}}],"l":{"i":["钻研；分析；探究；考虑："]}},{"exam":[{"i":{"f":{"l":{"i":"She has many virtues accounted to her."}},"n":{"l":{"i":"许多美德集于她一身。"}}}}],"l":{"i":["[罕用语]把\u2026归因于，把\u2026归咎于(to)；把\u2026转嫁于(to):"]}}]
                 */

                private String pos;
                private List<TrBeanXX> tr;

                public String getPos() {
                    return pos;
                }

                public void setPos(String pos) {
                    this.pos = pos;
                }

                public List<TrBeanXX> getTr() {
                    return tr;
                }

                public void setTr(List<TrBeanXX> tr) {
                    this.tr = tr;
                }

                public static class TrBeanXX {
                    /**
                     * exam : [{"i":{"f":{"l":{"i":"He was accounted a merciful man."}},"n":{"l":{"i":"他被人看做是一位仁者。"}}}},{"i":{"f":{"l":{"i":"I account myself well paid."}},"n":{"l":{"i":"我认为自己得到优厚报酬。(或：我认为给我的报酬相当好。)"}}}}]
                     * l : {"i":["以为，认为，把\u2026看做，把\u2026视作："]}
                     */

                    private LBeanXXXXXX l;
                    private List<ExamBean> exam;

                    public LBeanXXXXXX getL() {
                        return l;
                    }

                    public void setL(LBeanXXXXXX l) {
                        this.l = l;
                    }

                    public List<ExamBean> getExam() {
                        return exam;
                    }

                    public void setExam(List<ExamBean> exam) {
                        this.exam = exam;
                    }

                    public static class LBeanXXXXXX {
                        private List<String> i;

                        public List<String> getI() {
                            return i;
                        }

                        public void setI(List<String> i) {
                            this.i = i;
                        }
                    }

                    public static class ExamBean {
                        /**
                         * i : {"f":{"l":{"i":"He was accounted a merciful man."}},"n":{"l":{"i":"他被人看做是一位仁者。"}}}
                         */

                        private IBeanX i;

                        public IBeanX getI() {
                            return i;
                        }

                        public void setI(IBeanX i) {
                            this.i = i;
                        }

                        public static class IBeanX {
                            /**
                             * f : {"l":{"i":"He was accounted a merciful man."}}
                             * n : {"l":{"i":"他被人看做是一位仁者。"}}
                             */

                            private FBean f;
                            private NBean n;

                            public FBean getF() {
                                return f;
                            }

                            public void setF(FBean f) {
                                this.f = f;
                            }

                            public NBean getN() {
                                return n;
                            }

                            public void setN(NBean n) {
                                this.n = n;
                            }

                            public static class FBean {
                                /**
                                 * l : {"i":"He was accounted a merciful man."}
                                 */

                                private LBeanXXXXXXX l;

                                public LBeanXXXXXXX getL() {
                                    return l;
                                }

                                public void setL(LBeanXXXXXXX l) {
                                    this.l = l;
                                }

                                public static class LBeanXXXXXXX {
                                    /**
                                     * i : He was accounted a merciful man.
                                     */

                                    private String i;

                                    public String getI() {
                                        return i;
                                    }

                                    public void setI(String i) {
                                        this.i = i;
                                    }
                                }
                            }

                            public static class NBean {
                                /**
                                 * l : {"i":"他被人看做是一位仁者。"}
                                 */

                                private LBeanXXXXXXXX l;

                                public LBeanXXXXXXXX getL() {
                                    return l;
                                }

                                public void setL(LBeanXXXXXXXX l) {
                                    this.l = l;
                                }

                                public static class LBeanXXXXXXXX {
                                    /**
                                     * i : 他被人看做是一位仁者。
                                     */

                                    private String i;

                                    public String getI() {
                                        return i;
                                    }

                                    public void setI(String i) {
                                        this.i = i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static class EeBean {
        /**
         * source : {"name":"WordNet","url":"http://wordnet.princeton.edu"}
         * word : {"phone":"","return-phrase":{"l":{"i":"account"}},"speech":"account","trs":[{"pos":"n.","tr":[{"exam":{"i":{"f":{"l":[{"i":"he asked to see the executive who handled his account"}]}}},"l":{"i":"a formal contractual relationship established to provide for regular banking or brokerage or business services"},"similar-words":[{"similar":"business relationship"}]},{"exam":{"i":{"f":{"l":[{"i":"by all accounts they were a happy couple"}]}}},"l":{"i":"the act of informing by verbal report"},"similar-words":[{"similar":"report"}]},{"exam":{"i":{"f":{"l":[{"i":"he gave an inaccurate account of the plot to kill the president"}]}}},"l":{"i":"a record or narrative description of past events"},"similar-words":[{"similar":"history"},{"similar":"chronicle"},{"similar":"story"}]},{"exam":{"i":{"f":{"l":[{"i":"the account of his speech that was given on the evening news made the governor furious"}]}}},"l":{"i":"a short account of the news"},"similar-words":[{"similar":"report"},{"similar":"news report"},{"similar":"story"},{"similar":"write up"}]},{"exam":{"i":{"f":{"l":[{"i":"they send me an accounting every month"}]}}},"l":{"i":"a statement of recent transactions and the resulting balance"},"similar-words":[{"similar":"accounting"},{"similar":"account statement"}]},{"exam":{"i":{"f":{"l":[{"i":"I expected a brief account"}]}}},"l":{"i":"a statement that makes something comprehensible by describing the relevant structure or operation or circumstances etc."},"similar-words":[{"similar":"explanation"}]},{"exam":{"i":{"f":{"l":[{"i":"send me an account of what I owe"}]}}},"l":{"i":"an itemized statement of money owed for goods shipped or services rendered"},"similar-words":[{"similar":"bill"},{"similar":"invoice"}]},{"exam":{"i":{"f":{"l":[{"i":"don't do it on my account"},{"i":"the paper was rejected on account of its length"}]}}},"l":{"i":"grounds"},"similar-words":[{"similar":"score"}]},{"exam":{"i":{"f":{"l":[{"i":"a person of considerable account"},{"i":"he predicted that although it is of small account now it will rapidly increase in importance"}]}}},"l":{"i":"importance or value"}},{"exam":{"i":{"f":{"l":[{"i":"she turned her writing skills to good account"}]}}},"l":{"i":"the quality of taking advantage"}}]},{"pos":"v.","tr":[{"exam":{"i":{"f":{"l":[{"i":"Passing grades account for half of the grades given in this exam"}]}}},"l":{"i":"be the sole or primary factor in the existence, acquisition, supply, or disposal of something"}},{"l":{"i":"keep an account of"},"similar-words":[{"similar":"calculate"}]},{"l":{"i":"to give an account or representation of in words"},"similar-words":[{"similar":"report"},{"similar":"describe"}]},{"exam":{"i":{"f":{"l":[{"i":"I can't account for the missing money"}]}}},"l":{"i":"furnish a justifying analysis or explanation"},"similar-words":[{"similar":"answer for"}]}]}]}
         */

        private SourceBeanXX source;
        private WordBeanXX word;

        public SourceBeanXX getSource() {
            return source;
        }

        public void setSource(SourceBeanXX source) {
            this.source = source;
        }

        public WordBeanXX getWord() {
            return word;
        }

        public void setWord(WordBeanXX word) {
            this.word = word;
        }

        public static class SourceBeanXX {
            /**
             * name : WordNet
             * url : http://wordnet.princeton.edu
             */

            private String name;
            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class WordBeanXX {
            /**
             * phone :
             * return-phrase : {"l":{"i":"account"}}
             * speech : account
             * trs : [{"pos":"n.","tr":[{"exam":{"i":{"f":{"l":[{"i":"he asked to see the executive who handled his account"}]}}},"l":{"i":"a formal contractual relationship established to provide for regular banking or brokerage or business services"},"similar-words":[{"similar":"business relationship"}]},{"exam":{"i":{"f":{"l":[{"i":"by all accounts they were a happy couple"}]}}},"l":{"i":"the act of informing by verbal report"},"similar-words":[{"similar":"report"}]},{"exam":{"i":{"f":{"l":[{"i":"he gave an inaccurate account of the plot to kill the president"}]}}},"l":{"i":"a record or narrative description of past events"},"similar-words":[{"similar":"history"},{"similar":"chronicle"},{"similar":"story"}]},{"exam":{"i":{"f":{"l":[{"i":"the account of his speech that was given on the evening news made the governor furious"}]}}},"l":{"i":"a short account of the news"},"similar-words":[{"similar":"report"},{"similar":"news report"},{"similar":"story"},{"similar":"write up"}]},{"exam":{"i":{"f":{"l":[{"i":"they send me an accounting every month"}]}}},"l":{"i":"a statement of recent transactions and the resulting balance"},"similar-words":[{"similar":"accounting"},{"similar":"account statement"}]},{"exam":{"i":{"f":{"l":[{"i":"I expected a brief account"}]}}},"l":{"i":"a statement that makes something comprehensible by describing the relevant structure or operation or circumstances etc."},"similar-words":[{"similar":"explanation"}]},{"exam":{"i":{"f":{"l":[{"i":"send me an account of what I owe"}]}}},"l":{"i":"an itemized statement of money owed for goods shipped or services rendered"},"similar-words":[{"similar":"bill"},{"similar":"invoice"}]},{"exam":{"i":{"f":{"l":[{"i":"don't do it on my account"},{"i":"the paper was rejected on account of its length"}]}}},"l":{"i":"grounds"},"similar-words":[{"similar":"score"}]},{"exam":{"i":{"f":{"l":[{"i":"a person of considerable account"},{"i":"he predicted that although it is of small account now it will rapidly increase in importance"}]}}},"l":{"i":"importance or value"}},{"exam":{"i":{"f":{"l":[{"i":"she turned her writing skills to good account"}]}}},"l":{"i":"the quality of taking advantage"}}]},{"pos":"v.","tr":[{"exam":{"i":{"f":{"l":[{"i":"Passing grades account for half of the grades given in this exam"}]}}},"l":{"i":"be the sole or primary factor in the existence, acquisition, supply, or disposal of something"}},{"l":{"i":"keep an account of"},"similar-words":[{"similar":"calculate"}]},{"l":{"i":"to give an account or representation of in words"},"similar-words":[{"similar":"report"},{"similar":"describe"}]},{"exam":{"i":{"f":{"l":[{"i":"I can't account for the missing money"}]}}},"l":{"i":"furnish a justifying analysis or explanation"},"similar-words":[{"similar":"answer for"}]}]}]
             */

            private String phone;
            @SerializedName("return-phrase")
            private ReturnphraseBeanXX returnphrase;
            private String speech;
            private List<TrsBeanXX> trs;

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public ReturnphraseBeanXX getReturnphrase() {
                return returnphrase;
            }

            public void setReturnphrase(ReturnphraseBeanXX returnphrase) {
                this.returnphrase = returnphrase;
            }

            public String getSpeech() {
                return speech;
            }

            public void setSpeech(String speech) {
                this.speech = speech;
            }

            public List<TrsBeanXX> getTrs() {
                return trs;
            }

            public void setTrs(List<TrsBeanXX> trs) {
                this.trs = trs;
            }

            public static class ReturnphraseBeanXX {
                /**
                 * l : {"i":"account"}
                 */

                private LBeanXXXXXXXXX l;

                public LBeanXXXXXXXXX getL() {
                    return l;
                }

                public void setL(LBeanXXXXXXXXX l) {
                    this.l = l;
                }

                public static class LBeanXXXXXXXXX {
                    /**
                     * i : account
                     */

                    private String i;

                    public String getI() {
                        return i;
                    }

                    public void setI(String i) {
                        this.i = i;
                    }
                }
            }

            public static class TrsBeanXX {
                /**
                 * pos : n.
                 * tr : [{"exam":{"i":{"f":{"l":[{"i":"he asked to see the executive who handled his account"}]}}},"l":{"i":"a formal contractual relationship established to provide for regular banking or brokerage or business services"},"similar-words":[{"similar":"business relationship"}]},{"exam":{"i":{"f":{"l":[{"i":"by all accounts they were a happy couple"}]}}},"l":{"i":"the act of informing by verbal report"},"similar-words":[{"similar":"report"}]},{"exam":{"i":{"f":{"l":[{"i":"he gave an inaccurate account of the plot to kill the president"}]}}},"l":{"i":"a record or narrative description of past events"},"similar-words":[{"similar":"history"},{"similar":"chronicle"},{"similar":"story"}]},{"exam":{"i":{"f":{"l":[{"i":"the account of his speech that was given on the evening news made the governor furious"}]}}},"l":{"i":"a short account of the news"},"similar-words":[{"similar":"report"},{"similar":"news report"},{"similar":"story"},{"similar":"write up"}]},{"exam":{"i":{"f":{"l":[{"i":"they send me an accounting every month"}]}}},"l":{"i":"a statement of recent transactions and the resulting balance"},"similar-words":[{"similar":"accounting"},{"similar":"account statement"}]},{"exam":{"i":{"f":{"l":[{"i":"I expected a brief account"}]}}},"l":{"i":"a statement that makes something comprehensible by describing the relevant structure or operation or circumstances etc."},"similar-words":[{"similar":"explanation"}]},{"exam":{"i":{"f":{"l":[{"i":"send me an account of what I owe"}]}}},"l":{"i":"an itemized statement of money owed for goods shipped or services rendered"},"similar-words":[{"similar":"bill"},{"similar":"invoice"}]},{"exam":{"i":{"f":{"l":[{"i":"don't do it on my account"},{"i":"the paper was rejected on account of its length"}]}}},"l":{"i":"grounds"},"similar-words":[{"similar":"score"}]},{"exam":{"i":{"f":{"l":[{"i":"a person of considerable account"},{"i":"he predicted that although it is of small account now it will rapidly increase in importance"}]}}},"l":{"i":"importance or value"}},{"exam":{"i":{"f":{"l":[{"i":"she turned her writing skills to good account"}]}}},"l":{"i":"the quality of taking advantage"}}]
                 */

                private String pos;
                private List<TrBeanXXX> tr;

                public String getPos() {
                    return pos;
                }

                public void setPos(String pos) {
                    this.pos = pos;
                }

                public List<TrBeanXXX> getTr() {
                    return tr;
                }

                public void setTr(List<TrBeanXXX> tr) {
                    this.tr = tr;
                }

                public static class TrBeanXXX {
                    /**
                     * exam : {"i":{"f":{"l":[{"i":"he asked to see the executive who handled his account"}]}}}
                     * l : {"i":"a formal contractual relationship established to provide for regular banking or brokerage or business services"}
                     * similar-words : [{"similar":"business relationship"}]
                     */

                    private ExamBeanX exam;
                    private LBeanXXXXXXXXXXX l;
                    @SerializedName("similar-words")
                    private List<SimilarwordsBean> similarwords;

                    public ExamBeanX getExam() {
                        return exam;
                    }

                    public void setExam(ExamBeanX exam) {
                        this.exam = exam;
                    }

                    public LBeanXXXXXXXXXXX getL() {
                        return l;
                    }

                    public void setL(LBeanXXXXXXXXXXX l) {
                        this.l = l;
                    }

                    public List<SimilarwordsBean> getSimilarwords() {
                        return similarwords;
                    }

                    public void setSimilarwords(List<SimilarwordsBean> similarwords) {
                        this.similarwords = similarwords;
                    }

                    public static class ExamBeanX {
                        /**
                         * i : {"f":{"l":[{"i":"he asked to see the executive who handled his account"}]}}
                         */

                        private IBeanXX i;

                        public IBeanXX getI() {
                            return i;
                        }

                        public void setI(IBeanXX i) {
                            this.i = i;
                        }

                        public static class IBeanXX {
                            /**
                             * f : {"l":[{"i":"he asked to see the executive who handled his account"}]}
                             */

                            private FBeanX f;

                            public FBeanX getF() {
                                return f;
                            }

                            public void setF(FBeanX f) {
                                this.f = f;
                            }

                            public static class FBeanX {
                                private List<LBeanXXXXXXXXXX> l;

                                public List<LBeanXXXXXXXXXX> getL() {
                                    return l;
                                }

                                public void setL(List<LBeanXXXXXXXXXX> l) {
                                    this.l = l;
                                }

                                public static class LBeanXXXXXXXXXX {
                                    /**
                                     * i : he asked to see the executive who handled his account
                                     */

                                    private String i;

                                    public String getI() {
                                        return i;
                                    }

                                    public void setI(String i) {
                                        this.i = i;
                                    }
                                }
                            }
                        }
                    }

                    public static class LBeanXXXXXXXXXXX {
                        /**
                         * i : a formal contractual relationship established to provide for regular banking or brokerage or business services
                         */

                        private String i;

                        public String getI() {
                            return i;
                        }

                        public void setI(String i) {
                            this.i = i;
                        }
                    }

                    public static class SimilarwordsBean {
                        /**
                         * similar : business relationship
                         */

                        private String similar;

                        public String getSimilar() {
                            return similar;
                        }

                        public void setSimilar(String similar) {
                            this.similar = similar;
                        }
                    }
                }
            }
        }
    }

    public static class EtymBean {
        /**
         * etyms : {"en":[{"desc":"(n.)","source":"etymonline","url":"http://www.etymonline.com","value":"c. 1300, \"counting,\" especially \"reckoning of money received and paid, detailed statement of funds owed or spent or property held,\" from Old French acont \"(financial) account, reckoning, terminal payment,\" from a \"to\" (see ad-) + cont \"counting, reckoning of money to be paid,\" from Late Latin computus \"a calculation,\" from Latin computare \"calculate\" (see compute).\n\nFrom the first often in plural form; sometimes in late Middle English accompt (see account (v.)). Meaning \"course of business dealings requiring records\" is from 1640s; hence \"arrangement to keep money in a business, bank, etc.\" (1833), also \"customer or client having an account\" (1937). Money of account (1690s), that used in reckoning but not circulating as coin or paper, preserves the \"counting\" sense of the word.\n\nFrom the notion of \"rendering an account\" comes the sense \"statement answering for conduct\" (mid-14c.) and the general sense \"narration, recital of facts,\" attested by 1610s. Phrase by all accounts is attested from 1798. From the notion of \"statement of reasons\" comes on no account \"under no circumstances\" (1704). Also from c. 1300 in reference to answering for one's conduct, especially at the Last Judgment. Meaning \"estimation, consideration,\" especially in the eyes of others, is from late 14c. \n\nOn account in the financial sense \"as an item to be accounted for at the final settlement\" is from 1610s, hence on account of in the general sense \"for the sake of, in regard to, in consideration of\" (1640s, originally upon account of). Also on (my, your, etc.) account \"on (one's) behalf.\" To give accounts \"prepare or present a statement of funds and property\" is from mid-15c; the older term was cast accounts (mid-14c.); to take account of originally was to make an inventory; take into account \"take account of\" is from 1680s.\n\nThe spellings accompt, accomptable, etc. are artificial forms used, not prevailingly, in the sixteenth and seventeenth centuries. They are now obsolete, or nearly so, though accompt and accomptant may still be used in the formal or legal style. The pronunciation has always conformed to the regular spelling, account, accountable, etc. [Century Dictionary]\n","word":"account"},{"desc":"(v.)","source":"etymonline","url":"http://www.etymonline.com","value":"c. 1300, \"to count, enumerate,\" from Old French aconter \"to enumerate; reckon up, render account\" (Modern French conter), from a \"to\" (see ad-) + conter \"to count, tell\" (see count (v.)).\n\nMeaning \"to reckon for money given or received, render a reckoning,\" is from late 14c. Sense of \"to explain, justify\" (c. 1300) is from notion of \"present a detailed explanation of money, etc. held in trust.\" Transferred sense of \"to value, to estimate\" (to account as belonging to a certain class of quality) is from late 14c. Intransitive sense of \"to render an account of particulars\" is from late 14c.; hence transitive sense \"give an explanation\" (1670s, usually with to before a person and for before a thing).\n\nIn later Old French partly re-Latinized as acompter (Modern French accompter), hence late Middle English accompten. Related: Accounted; accounting.","word":"account"},{"desc":"","source":"youdict","url":"http://www.youdict.com/etym/","value":"account: [14] Account is of Old French origin. It was formed from compter, conter \u2018count\u2019 (which derived from Latin computāre) and the prefix a-. Its original meaning in English, too, was \u2018count\u2019 or \u2018count up\u2019; this had disappeared by the end of the 18th century, but its specialized reference to the keeping of financial records is of equal antiquity. Account for, meaning \u2018explain\u2019, arose in the mid 18th century.=> count","word":"account"},{"desc":"(v.)","source":"youdict","url":"http://www.youdict.com/etym/","value":"c. 1300, \"to count, enumerate,\" from Old French aconter \"to count, render account\" (Modern French conter), from a \"to\" (see ad-) + conter \"to count, tell\" (see count (v.)). Meaning \"to reckon for money given or received, render a reckoning,\" is from late 14c.; sense of \"to explain\" (c. 1710) is from notion of \"answer for money held in trust.\" Transferred sense of \"value\" is from late 14c. Related: Accounted; accounting.","word":"account"}],"zh":[{"desc":"帐目","source":"童理民","url":"","value":"来自法语，来自于拉丁语compute,来自于词根put,思考，计算。","word":"account"},{"desc":"账目，账户；说明，叙述","source":"童理民","url":"","value":"词根词缀：ac-加强意义 + -count-计算,讲故事 →账目/说明","word":"account"}]}
         * word : account
         */

        private EtymsBean etyms;
        private String word;

        public EtymsBean getEtyms() {
            return etyms;
        }

        public void setEtyms(EtymsBean etyms) {
            this.etyms = etyms;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public static class EtymsBean {
            private List<EnBean> en;
            private List<ZhBean> zh;

            public List<EnBean> getEn() {
                return en;
            }

            public void setEn(List<EnBean> en) {
                this.en = en;
            }

            public List<ZhBean> getZh() {
                return zh;
            }

            public void setZh(List<ZhBean> zh) {
                this.zh = zh;
            }

            public static class EnBean {
                /**
                 * desc : (n.)
                 * source : etymonline
                 * url : http://www.etymonline.com
                 * value : c. 1300, "counting," especially "reckoning of money received and paid, detailed statement of funds owed or spent or property held," from Old French acont "(financial) account, reckoning, terminal payment," from a "to" (see ad-) + cont "counting, reckoning of money to be paid," from Late Latin computus "a calculation," from Latin computare "calculate" (see compute).

                 From the first often in plural form; sometimes in late Middle English accompt (see account (v.)). Meaning "course of business dealings requiring records" is from 1640s; hence "arrangement to keep money in a business, bank, etc." (1833), also "customer or client having an account" (1937). Money of account (1690s), that used in reckoning but not circulating as coin or paper, preserves the "counting" sense of the word.

                 From the notion of "rendering an account" comes the sense "statement answering for conduct" (mid-14c.) and the general sense "narration, recital of facts," attested by 1610s. Phrase by all accounts is attested from 1798. From the notion of "statement of reasons" comes on no account "under no circumstances" (1704). Also from c. 1300 in reference to answering for one's conduct, especially at the Last Judgment. Meaning "estimation, consideration," especially in the eyes of others, is from late 14c.

                 On account in the financial sense "as an item to be accounted for at the final settlement" is from 1610s, hence on account of in the general sense "for the sake of, in regard to, in consideration of" (1640s, originally upon account of). Also on (my, your, etc.) account "on (one's) behalf." To give accounts "prepare or present a statement of funds and property" is from mid-15c; the older term was cast accounts (mid-14c.); to take account of originally was to make an inventory; take into account "take account of" is from 1680s.

                 The spellings accompt, accomptable, etc. are artificial forms used, not prevailingly, in the sixteenth and seventeenth centuries. They are now obsolete, or nearly so, though accompt and accomptant may still be used in the formal or legal style. The pronunciation has always conformed to the regular spelling, account, accountable, etc. [Century Dictionary]

                 * word : account
                 */

                private String desc;
                private String source;
                private String url;
                private String value;
                private String word;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getSource() {
                    return source;
                }

                public void setSource(String source) {
                    this.source = source;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getWord() {
                    return word;
                }

                public void setWord(String word) {
                    this.word = word;
                }
            }

            public static class ZhBean {
                /**
                 * desc : 帐目
                 * source : 童理民
                 * url :
                 * value : 来自法语，来自于拉丁语compute,来自于词根put,思考，计算。
                 * word : account
                 */

                private String desc;
                private String source;
                private String url;
                private String value;
                private String word;

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getSource() {
                    return source;
                }

                public void setSource(String source) {
                    this.source = source;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getWord() {
                    return word;
                }

                public void setWord(String word) {
                    this.word = word;
                }
            }
        }
    }

    public static class ExamDictBean {
        private List<String> exam_type;
        private List<ExamsBean> exams;

        public List<String> getExam_type() {
            return exam_type;
        }

        public void setExam_type(List<String> exam_type) {
            this.exam_type = exam_type;
        }

        public List<ExamsBean> getExams() {
            return exams;
        }

        public void setExams(List<ExamsBean> exams) {
            this.exams = exams;
        }

        public static class ExamsBean {
            /**
             * books : [{"book_name":"新东方·六级词汇词根+联想记忆法","content":{"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"[ə'kaunt]","phrases":[{"content":[{"phrase":"<b>account<\/b> for 解释， 说明； 占有； on <b>account<\/b> of 由于， 为了\u2026； on no <b>account<\/b> 决不可以， 无论如何也不"}],"name":"常考词组"}],"regular":false,"related":[],"remember":[{"content":" ac(表加强) ＋ count(数) → 账目需要一数再数， 保证正确 → 账目","name":"联想记忆"}],"sentences":[{"content":[{"eng":"Foreign sales <b>accounted<\/b> for 65 percent of Coke\u2019s beverage business. (2008. 6) 可口可乐公司在海外的销售量占饮料业务总量的65%。"}],"name":"例句"}],"star":false,"translation":[{"examples":[],"occured":false,"tran":"n. 记述； 解释； 账目 vi. 说明\u2026的原因； (在数量、 比例方面)占\u2026"}],"word":"account"}}]
             * category : CET6
             */

            private String category;
            private List<BooksBean> books;

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public List<BooksBean> getBooks() {
                return books;
            }

            public void setBooks(List<BooksBean> books) {
                this.books = books;
            }

            public static class BooksBean {
                /**
                 * book_name : 新东方·六级词汇词根+联想记忆法
                 * content : {"barron":false,"discriminate":[],"explanation":[],"freq":-1,"pastexams":[],"phonetic":"[ə'kaunt]","phrases":[{"content":[{"phrase":"<b>account<\/b> for 解释， 说明； 占有； on <b>account<\/b> of 由于， 为了\u2026； on no <b>account<\/b> 决不可以， 无论如何也不"}],"name":"常考词组"}],"regular":false,"related":[],"remember":[{"content":" ac(表加强) ＋ count(数) → 账目需要一数再数， 保证正确 → 账目","name":"联想记忆"}],"sentences":[{"content":[{"eng":"Foreign sales <b>accounted<\/b> for 65 percent of Coke\u2019s beverage business. (2008. 6) 可口可乐公司在海外的销售量占饮料业务总量的65%。"}],"name":"例句"}],"star":false,"translation":[{"examples":[],"occured":false,"tran":"n. 记述； 解释； 账目 vi. 说明\u2026的原因； (在数量、 比例方面)占\u2026"}],"word":"account"}
                 */

                private String book_name;
                private ContentBeanXX content;

                public String getBook_name() {
                    return book_name;
                }

                public void setBook_name(String book_name) {
                    this.book_name = book_name;
                }

                public ContentBeanXX getContent() {
                    return content;
                }

                public void setContent(ContentBeanXX content) {
                    this.content = content;
                }

                public static class ContentBeanXX {
                    /**
                     * barron : false
                     * discriminate : []
                     * explanation : []
                     * freq : -1
                     * pastexams : []
                     * phonetic : [ə'kaunt]
                     * phrases : [{"content":[{"phrase":"<b>account<\/b> for 解释， 说明； 占有； on <b>account<\/b> of 由于， 为了\u2026； on no <b>account<\/b> 决不可以， 无论如何也不"}],"name":"常考词组"}]
                     * regular : false
                     * related : []
                     * remember : [{"content":" ac(表加强) ＋ count(数) → 账目需要一数再数， 保证正确 → 账目","name":"联想记忆"}]
                     * sentences : [{"content":[{"eng":"Foreign sales <b>accounted<\/b> for 65 percent of Coke\u2019s beverage business. (2008. 6) 可口可乐公司在海外的销售量占饮料业务总量的65%。"}],"name":"例句"}]
                     * star : false
                     * translation : [{"examples":[],"occured":false,"tran":"n. 记述； 解释； 账目 vi. 说明\u2026的原因； (在数量、 比例方面)占\u2026"}]
                     * word : account
                     */

                    private boolean barron;
                    private int freq;
                    private String phonetic;
                    private boolean regular;
                    private boolean star;
                    private String word;
                    private List<?> discriminate;
                    private List<?> explanation;
                    private List<?> pastexams;
                    private List<PhrasesBean> phrases;
                    private List<?> related;
                    private List<RememberBean> remember;
                    private List<SentencesBean> sentences;
                    private List<TranslationBean> translation;

                    public boolean isBarron() {
                        return barron;
                    }

                    public void setBarron(boolean barron) {
                        this.barron = barron;
                    }

                    public int getFreq() {
                        return freq;
                    }

                    public void setFreq(int freq) {
                        this.freq = freq;
                    }

                    public String getPhonetic() {
                        return phonetic;
                    }

                    public void setPhonetic(String phonetic) {
                        this.phonetic = phonetic;
                    }

                    public boolean isRegular() {
                        return regular;
                    }

                    public void setRegular(boolean regular) {
                        this.regular = regular;
                    }

                    public boolean isStar() {
                        return star;
                    }

                    public void setStar(boolean star) {
                        this.star = star;
                    }

                    public String getWord() {
                        return word;
                    }

                    public void setWord(String word) {
                        this.word = word;
                    }

                    public List<?> getDiscriminate() {
                        return discriminate;
                    }

                    public void setDiscriminate(List<?> discriminate) {
                        this.discriminate = discriminate;
                    }

                    public List<?> getExplanation() {
                        return explanation;
                    }

                    public void setExplanation(List<?> explanation) {
                        this.explanation = explanation;
                    }

                    public List<?> getPastexams() {
                        return pastexams;
                    }

                    public void setPastexams(List<?> pastexams) {
                        this.pastexams = pastexams;
                    }

                    public List<PhrasesBean> getPhrases() {
                        return phrases;
                    }

                    public void setPhrases(List<PhrasesBean> phrases) {
                        this.phrases = phrases;
                    }

                    public List<?> getRelated() {
                        return related;
                    }

                    public void setRelated(List<?> related) {
                        this.related = related;
                    }

                    public List<RememberBean> getRemember() {
                        return remember;
                    }

                    public void setRemember(List<RememberBean> remember) {
                        this.remember = remember;
                    }

                    public List<SentencesBean> getSentences() {
                        return sentences;
                    }

                    public void setSentences(List<SentencesBean> sentences) {
                        this.sentences = sentences;
                    }

                    public List<TranslationBean> getTranslation() {
                        return translation;
                    }

                    public void setTranslation(List<TranslationBean> translation) {
                        this.translation = translation;
                    }

                    public static class PhrasesBean {
                        /**
                         * content : [{"phrase":"<b>account<\/b> for 解释， 说明； 占有； on <b>account<\/b> of 由于， 为了\u2026； on no <b>account<\/b> 决不可以， 无论如何也不"}]
                         * name : 常考词组
                         */

                        private String name;
                        private List<ContentBean> content;

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public List<ContentBean> getContent() {
                            return content;
                        }

                        public void setContent(List<ContentBean> content) {
                            this.content = content;
                        }

                        public static class ContentBean {
                            /**
                             * phrase : <b>account</b> for 解释， 说明； 占有； on <b>account</b> of 由于， 为了…； on no <b>account</b> 决不可以， 无论如何也不
                             */

                            private String phrase;

                            public String getPhrase() {
                                return phrase;
                            }

                            public void setPhrase(String phrase) {
                                this.phrase = phrase;
                            }
                        }
                    }

                    public static class RememberBean {
                        /**
                         * content :  ac(表加强) ＋ count(数) → 账目需要一数再数， 保证正确 → 账目
                         * name : 联想记忆
                         */

                        private String content;
                        private String name;

                        public String getContent() {
                            return content;
                        }

                        public void setContent(String content) {
                            this.content = content;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }
                    }

                    public static class SentencesBean {
                        /**
                         * content : [{"eng":"Foreign sales <b>accounted<\/b> for 65 percent of Coke\u2019s beverage business. (2008. 6) 可口可乐公司在海外的销售量占饮料业务总量的65%。"}]
                         * name : 例句
                         */

                        private String name;
                        private List<ContentBeanX> content;

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public List<ContentBeanX> getContent() {
                            return content;
                        }

                        public void setContent(List<ContentBeanX> content) {
                            this.content = content;
                        }

                        public static class ContentBeanX {
                            /**
                             * eng : Foreign sales <b>accounted</b> for 65 percent of Coke’s beverage business. (2008. 6) 可口可乐公司在海外的销售量占饮料业务总量的65%。
                             */

                            private String eng;

                            public String getEng() {
                                return eng;
                            }

                            public void setEng(String eng) {
                                this.eng = eng;
                            }
                        }
                    }

                    public static class TranslationBean {
                        /**
                         * examples : []
                         * occured : false
                         * tran : n. 记述； 解释； 账目 vi. 说明…的原因； (在数量、 比例方面)占…
                         */

                        private boolean occured;
                        private String tran;
                        private List<?> examples;

                        public boolean isOccured() {
                            return occured;
                        }

                        public void setOccured(boolean occured) {
                            this.occured = occured;
                        }

                        public String getTran() {
                            return tran;
                        }

                        public void setTran(String tran) {
                            this.tran = tran;
                        }

                        public List<?> getExamples() {
                            return examples;
                        }

                        public void setExamples(List<?> examples) {
                            this.examples = examples;
                        }
                    }
                }
            }
        }
    }

    public static class LongmanBean {
        /**
         * isGood : true
         * wordList : [{"Entry":{"Head":[{"FREQ":["S1","W1"],"GRAM":["C"],"HOMNUM":["1"],"HWD":["account"],"HYPHENATION":["ac\u2027count"],"POS":["n"],"PronCodes":[{"PRON":["əˈkaʊnt"],"PRONKK":["əˋka u nt"]}],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}],"Sense":[{"DEF":["a written or spoken description that says what happens in an event or process"],"EXAMPLE":["Chomsky\u2019s account of how children learn their first language"],"EXAMPLETRAN":["乔姆斯基关于儿童如何学习第一语言的描述"],"GramExa":[{"EXAMPLE":["He was too shocked to <i>give an account<\/i> of what had happened."],"EXAMPLETRAN":["他因受惊过度而无法描述所发生的事情。"],"PROPFORMPREP":["of"]},{"COLLOTRAN":["一五一十的叙述"],"EXAMPLE":["a blow-by-blow account of how England lost to Portugal"],"EXAMPLETRAN":["英格兰队如何负于葡萄牙队的详细报道"],"GLOSS":["a description of all the details of an event in the order that they happened"],"PROPFORM":["blow-by-blow account"]},{"COLLOTRAN":["目击者的/第一手的描述"],"EXAMPLE":["Eye-witness accounts told of the unprovoked shooting of civilians.","This gives a first-hand account of the war."],"EXAMPLETRAN":["目击者讲到平民无故被枪击。","这是关于这场战争的第一手报道。"],"GLOSS":["a description of events by someone who saw them"],"PROPFORM":["eye-witness/first-hand account"]}],"SIGNPOST":["description"],"SIGNTRAN":["描述"],"TRAN":["叙述，描写，报道"]},{"Crossref":[{"Crossrefto":[{"REFHWD":["bank account"]},{"REFHWD":["checking account"]},{"REFHWD":["current account"]},{"REFHWD":["deposit account"]},{"REFHWD":["profit and loss account"]},{"REFHWD":["savings account"]}]}],"DEF":["an arrangement in which a bank keeps your money safe so that you can pay more in or take money out"],"EXAMPLE":["My salary is paid into my bank account.","I\u2019ve <i>opened an account<\/i> with Barclay\u2019s Bank.","My husband and I have a <i>joint account<\/i> (= <em> one that is shared between two people <\/em> ) ."],"EXAMPLETRAN":["我的工资直接存入我的银行账户。","我在巴克莱银行开了一个账户。","我和丈夫有个联名账户。"],"SIGNPOST":["at a bank"],"SIGNTRAN":["在银行"],"TRAN":["账户"],"Variant":[{"ABBR":["a/c","acct."],"LINKWORD":["written abbreviation <i>书面缩写为<\/i>","or"]}]},{"DEF":["to consider or include particular facts or details when making a decision or judgment about something"],"EXAMPLE":["These figures do not take account of changes in the rate of inflation."],"EXAMPLETRAN":["这些数字没有把通货膨胀率的变化考虑进去。"],"LEXUNIT":["take account of sth"],"TRAN":["考虑到某事，把某事考虑进去"],"Variant":[{"LEXVAR":["take sth into account"],"LINKWORD":["also <i>又作<\/i>"]}]},{"DEF":["because of something else, especially a problem or difficulty"],"EXAMPLE":["She was told to wear flat shoes, on account of her back problem."],"EXAMPLETRAN":["因为背部有问题，她被建议穿平底鞋。"],"LEXUNIT":["on account of sth"],"TRAN":["因为某事，由于某事"]},{"LEXUNIT":["accounts"],"Subsense":[{"DEF":["an exact record of the money that a company has received and the money it has spent"],"EXAMPLE":["The accounts for last year showed a profit of $2 million."],"EXAMPLETRAN":["去年的账目显示利润为200万美元。"],"GRAM":["plural"],"GRAMTRAN":["复数"],"TRAN":["账目"]},{"DEF":["a department in a company that is responsible for keeping records of the amount of money spent and received"],"EXAMPLE":["Eileen works in accounts."],"EXAMPLETRAN":["艾琳在财务部工作。"],"GRAM":["U"],"TRAN":["〔公司的〕财务部"]}]},{"DEF":["if you buy goods on account, you take them away with you and pay for them later"],"LEXUNIT":["on account"],"TRAN":["赊账"]},{"DEF":["an arrangement that you have with a shop or company, which allows you to buy goods or use a service now and pay for them later"],"EXAMPLE":["Can you charge this to my account please?","an unlimited-use Internet account"],"EXAMPLETRAN":["你能把这记在我的（赊欠）账上吗？","一个能无限使用的因特网后付费账户"],"SIGNPOST":["with a shop/company"],"SIGNTRAN":["商店/公司"],"SYN":["credit account"],"TRAN":["〔可先使用后付款的〕赊欠账户"]},{"DEF":["a statement that shows how much money you owe for things you have bought from a shop"],"GramExa":[{"COLLOTRAN":["付账/结账"],"EXAMPLE":["James left the restaurant, settling his account by credit card."],"EXAMPLETRAN":["詹姆斯用信用卡结完账离开餐厅。"],"GLOSS":["pay what you owe"],"PROPFORM":["pay/settle your account"]}],"SIGNPOST":["bill"],"SIGNTRAN":["账单"],"SYN":["bill"],"TRAN":["账单"]},{"DEF":["an arrangement to sell goods and services to another company over a period of time"],"EXAMPLE":["Our sales manager has secured several big accounts recently."],"EXAMPLETRAN":["我们的销售部经理最近拉到了好几笔大生意。"],"SIGNPOST":["arrangement to sell goods"],"SIGNTRAN":["售货安排"],"TRAN":["〔一段时间内的〕交易安排"]},{"DEF":["according to what a lot of people say"],"EXAMPLE":["It has, from all accounts, been a successful marriage."],"EXAMPLETRAN":["谁都说这是一桩美满的婚姻。"],"LEXUNIT":["by/from all accounts"],"TRAN":["根据各方面所说"]},{"DEF":["if you do something on someone\u2019s account, you do it because you think they want you to"],"EXAMPLE":["Please don\u2019t change your plans on my account."],"EXAMPLETRAN":["请不要为了我而改变你的计划。"],"LEXUNIT":["on sb\u2019s account"],"TRAN":["为了某人的缘故"]},{"DEF":["by yourself or for yourself"],"EXAMPLE":["Carrie decided to do a little research on her own account."],"EXAMPLETRAN":["卡丽决定自己做点研究。"],"LEXUNIT":["on your own account"],"TRAN":["靠自己；为自己"]},{"DEF":["used when saying that someone must not, for any reason, do something"],"EXAMPLE":["On no account must you disturb me."],"EXAMPLETRAN":["你千万不要打扰我。"],"LEXUNIT":["on no account/not on any account"],"TRAN":["决不，绝对不"]},{"DEF":["according to what you have said, especially when you have admitted doing something wrong"],"EXAMPLE":["Bentley was, by his own account, over-sensitive to criticism."],"EXAMPLETRAN":["据本特利自己说，他对批评过于敏感。"],"LEXUNIT":["by sb\u2019s own account"],"TRAN":["据某人自己所说"]},{"DEF":["concerning a particular situation"],"EXAMPLE":["There needn\u2019t be any more worries on that account."],"EXAMPLETRAN":["没有必要再为那事担心了。"],"LEXUNIT":["on that account/on this account"],"TRAN":["由于那个/这个缘故"]},{"DEF":["to do something or perform very well or very badly"],"EXAMPLE":["Kevin gave a good account of himself in today\u2019s game."],"EXAMPLETRAN":["凯文在今天的比赛中表现出色。"],"LEXUNIT":["give a good/poor account of yourself"],"TRAN":["表现好/表现差"]},{"DEF":["to force someone who is responsible for a mistake or a crime to explain publicly why they did it and punish them for it if necessary"],"EXAMPLE":["The people responsible for the accident have never been brought to account."],"EXAMPLETRAN":["这起事故的责任人一直没有被追究责任。"],"LABELTRAN":["【正式】"],"LEXUNIT":["bring/call sb to account"],"REGISTERLAB":["formal"],"TRAN":["追究某人的责任"]},{"DEF":["to use something for a good purpose"],"EXAMPLE":["Perhaps she could put some of her talents to good account by helping us."],"EXAMPLETRAN":["通过帮助我们，也许她可以把自己的某些才能充分发挥出来。"],"LABELTRAN":["【正式】"],"LEXUNIT":["put/turn sth to good account"],"REGISTERLAB":["formal"],"TRAN":["善用某物，充分利用某物"]},{"DEF":["not important"],"EXAMPLE":["As she grew up, her father was of no account to her."],"EXAMPLETRAN":["她渐渐长大，父亲对她也不重要了。"],"LABELTRAN":["【正式】"],"LEXUNIT":["of no/little account"],"REGISTERLAB":["formal"],"TRAN":["不重要，没关系"]}]}},{"Entry":{"Head":[{"FREQ":["S3","W2"],"HOMNUM":["2"],"HWD":["account"],"HYPHENATION":["account"],"POS":["v"],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}],"PhrVbEntry":[{"Head":[{"PHRVBHWD":["account for <i>sth<\/i>"],"POS":["phr v"]}],"Sense":[{"DEF":["to form a particular amount or part of something"],"EXAMPLE":["Afro-Americans account for 12% of the US population."],"EXAMPLETRAN":["非裔美国人占美国人口的12%。"],"TRAN":["占〔一定数量或比例〕"]},{"DEF":["to be the reason why something happens"],"EXAMPLE":["Recent pressure at work may account for his behavior."],"EXAMPLETRAN":["他的行为也许是最近的工作压力导致的。"],"SYN":["explain"],"TRAN":["是\u2026的原因"]},{"DEF":["to give a satisfactory explanation of why something has happened or why you did something"],"EXAMPLE":["Can you account for your movements on that night?"],"EXAMPLETRAN":["你能说明一下你那天晚上的行踪吗？"],"SYN":["explain"],"TRAN":["解释，说明"]},{"DEF":["to say where all the members of a group of people or things are, especially because you are worried that some of them may be lost"],"EXAMPLE":["Three days after the earthquake, more than 150 people had still to be accounted for."],"EXAMPLETRAN":["地震发生3天后，仍有150多人下落不明。"],"TRAN":["说明\u2026在何处"]}]}]}}]
         */

        private String isGood;
        private List<WordListBean> wordList;

        public String getIsGood() {
            return isGood;
        }

        public void setIsGood(String isGood) {
            this.isGood = isGood;
        }

        public List<WordListBean> getWordList() {
            return wordList;
        }

        public void setWordList(List<WordListBean> wordList) {
            this.wordList = wordList;
        }

        public static class WordListBean {
            /**
             * Entry : {"Head":[{"FREQ":["S1","W1"],"GRAM":["C"],"HOMNUM":["1"],"HWD":["account"],"HYPHENATION":["ac\u2027count"],"POS":["n"],"PronCodes":[{"PRON":["əˈkaʊnt"],"PRONKK":["əˋka u nt"]}],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}],"Sense":[{"DEF":["a written or spoken description that says what happens in an event or process"],"EXAMPLE":["Chomsky\u2019s account of how children learn their first language"],"EXAMPLETRAN":["乔姆斯基关于儿童如何学习第一语言的描述"],"GramExa":[{"EXAMPLE":["He was too shocked to <i>give an account<\/i> of what had happened."],"EXAMPLETRAN":["他因受惊过度而无法描述所发生的事情。"],"PROPFORMPREP":["of"],"COLLOTRAN":["一五一十的叙述"],"GLOSS":["a description of all the details of an event in the order that they happened"],"PROPFORM":["blow-by-blow account"]},{"COLLOTRAN":["一五一十的叙述"],"EXAMPLE":["a blow-by-blow account of how England lost to Portugal"],"EXAMPLETRAN":["英格兰队如何负于葡萄牙队的详细报道"],"GLOSS":["a description of all the details of an event in the order that they happened"],"PROPFORM":["blow-by-blow account"]},{"COLLOTRAN":["目击者的/第一手的描述"],"EXAMPLE":["Eye-witness accounts told of the unprovoked shooting of civilians.","This gives a first-hand account of the war."],"EXAMPLETRAN":["目击者讲到平民无故被枪击。","这是关于这场战争的第一手报道。"],"GLOSS":["a description of events by someone who saw them"],"PROPFORM":["eye-witness/first-hand account"]}],"SIGNPOST":["description"],"SIGNTRAN":["描述"],"TRAN":["叙述，描写，报道"],"Crossref":[{"Crossrefto":[{"REFHWD":["bank account"]},{"REFHWD":["checking account"]},{"REFHWD":["current account"]},{"REFHWD":["deposit account"]},{"REFHWD":["profit and loss account"]},{"REFHWD":["savings account"]}]}],"Variant":[{"ABBR":["a/c","acct."],"LINKWORD":["written abbreviation <i>书面缩写为<\/i>","or"]}],"LEXUNIT":["take account of sth"],"Subsense":[{"DEF":["an exact record of the money that a company has received and the money it has spent"],"EXAMPLE":["The accounts for last year showed a profit of $2 million."],"EXAMPLETRAN":["去年的账目显示利润为200万美元。"],"GRAM":["plural"],"GRAMTRAN":["复数"],"TRAN":["账目"]},{"DEF":["a department in a company that is responsible for keeping records of the amount of money spent and received"],"EXAMPLE":["Eileen works in accounts."],"EXAMPLETRAN":["艾琳在财务部工作。"],"GRAM":["U"],"TRAN":["〔公司的〕财务部"]}],"SYN":["credit account"],"LABELTRAN":["【正式】"],"REGISTERLAB":["formal"]},{"Crossref":[{"Crossrefto":[{"REFHWD":["bank account"]},{"REFHWD":["checking account"]},{"REFHWD":["current account"]},{"REFHWD":["deposit account"]},{"REFHWD":["profit and loss account"]},{"REFHWD":["savings account"]}]}],"DEF":["an arrangement in which a bank keeps your money safe so that you can pay more in or take money out"],"EXAMPLE":["My salary is paid into my bank account.","I\u2019ve <i>opened an account<\/i> with Barclay\u2019s Bank.","My husband and I have a <i>joint account<\/i> (= <em> one that is shared between two people <\/em> ) ."],"EXAMPLETRAN":["我的工资直接存入我的银行账户。","我在巴克莱银行开了一个账户。","我和丈夫有个联名账户。"],"SIGNPOST":["at a bank"],"SIGNTRAN":["在银行"],"TRAN":["账户"],"Variant":[{"ABBR":["a/c","acct."],"LINKWORD":["written abbreviation <i>书面缩写为<\/i>","or"]}]},{"DEF":["to consider or include particular facts or details when making a decision or judgment about something"],"EXAMPLE":["These figures do not take account of changes in the rate of inflation."],"EXAMPLETRAN":["这些数字没有把通货膨胀率的变化考虑进去。"],"LEXUNIT":["take account of sth"],"TRAN":["考虑到某事，把某事考虑进去"],"Variant":[{"LEXVAR":["take sth into account"],"LINKWORD":["also <i>又作<\/i>"]}]},{"DEF":["because of something else, especially a problem or difficulty"],"EXAMPLE":["She was told to wear flat shoes, on account of her back problem."],"EXAMPLETRAN":["因为背部有问题，她被建议穿平底鞋。"],"LEXUNIT":["on account of sth"],"TRAN":["因为某事，由于某事"]},{"LEXUNIT":["accounts"],"Subsense":[{"DEF":["an exact record of the money that a company has received and the money it has spent"],"EXAMPLE":["The accounts for last year showed a profit of $2 million."],"EXAMPLETRAN":["去年的账目显示利润为200万美元。"],"GRAM":["plural"],"GRAMTRAN":["复数"],"TRAN":["账目"]},{"DEF":["a department in a company that is responsible for keeping records of the amount of money spent and received"],"EXAMPLE":["Eileen works in accounts."],"EXAMPLETRAN":["艾琳在财务部工作。"],"GRAM":["U"],"TRAN":["〔公司的〕财务部"]}]},{"DEF":["if you buy goods on account, you take them away with you and pay for them later"],"LEXUNIT":["on account"],"TRAN":["赊账"]},{"DEF":["an arrangement that you have with a shop or company, which allows you to buy goods or use a service now and pay for them later"],"EXAMPLE":["Can you charge this to my account please?","an unlimited-use Internet account"],"EXAMPLETRAN":["你能把这记在我的（赊欠）账上吗？","一个能无限使用的因特网后付费账户"],"SIGNPOST":["with a shop/company"],"SIGNTRAN":["商店/公司"],"SYN":["credit account"],"TRAN":["〔可先使用后付款的〕赊欠账户"]},{"DEF":["a statement that shows how much money you owe for things you have bought from a shop"],"GramExa":[{"COLLOTRAN":["付账/结账"],"EXAMPLE":["James left the restaurant, settling his account by credit card."],"EXAMPLETRAN":["詹姆斯用信用卡结完账离开餐厅。"],"GLOSS":["pay what you owe"],"PROPFORM":["pay/settle your account"]}],"SIGNPOST":["bill"],"SIGNTRAN":["账单"],"SYN":["bill"],"TRAN":["账单"]},{"DEF":["an arrangement to sell goods and services to another company over a period of time"],"EXAMPLE":["Our sales manager has secured several big accounts recently."],"EXAMPLETRAN":["我们的销售部经理最近拉到了好几笔大生意。"],"SIGNPOST":["arrangement to sell goods"],"SIGNTRAN":["售货安排"],"TRAN":["〔一段时间内的〕交易安排"]},{"DEF":["according to what a lot of people say"],"EXAMPLE":["It has, from all accounts, been a successful marriage."],"EXAMPLETRAN":["谁都说这是一桩美满的婚姻。"],"LEXUNIT":["by/from all accounts"],"TRAN":["根据各方面所说"]},{"DEF":["if you do something on someone\u2019s account, you do it because you think they want you to"],"EXAMPLE":["Please don\u2019t change your plans on my account."],"EXAMPLETRAN":["请不要为了我而改变你的计划。"],"LEXUNIT":["on sb\u2019s account"],"TRAN":["为了某人的缘故"]},{"DEF":["by yourself or for yourself"],"EXAMPLE":["Carrie decided to do a little research on her own account."],"EXAMPLETRAN":["卡丽决定自己做点研究。"],"LEXUNIT":["on your own account"],"TRAN":["靠自己；为自己"]},{"DEF":["used when saying that someone must not, for any reason, do something"],"EXAMPLE":["On no account must you disturb me."],"EXAMPLETRAN":["你千万不要打扰我。"],"LEXUNIT":["on no account/not on any account"],"TRAN":["决不，绝对不"]},{"DEF":["according to what you have said, especially when you have admitted doing something wrong"],"EXAMPLE":["Bentley was, by his own account, over-sensitive to criticism."],"EXAMPLETRAN":["据本特利自己说，他对批评过于敏感。"],"LEXUNIT":["by sb\u2019s own account"],"TRAN":["据某人自己所说"]},{"DEF":["concerning a particular situation"],"EXAMPLE":["There needn\u2019t be any more worries on that account."],"EXAMPLETRAN":["没有必要再为那事担心了。"],"LEXUNIT":["on that account/on this account"],"TRAN":["由于那个/这个缘故"]},{"DEF":["to do something or perform very well or very badly"],"EXAMPLE":["Kevin gave a good account of himself in today\u2019s game."],"EXAMPLETRAN":["凯文在今天的比赛中表现出色。"],"LEXUNIT":["give a good/poor account of yourself"],"TRAN":["表现好/表现差"]},{"DEF":["to force someone who is responsible for a mistake or a crime to explain publicly why they did it and punish them for it if necessary"],"EXAMPLE":["The people responsible for the accident have never been brought to account."],"EXAMPLETRAN":["这起事故的责任人一直没有被追究责任。"],"LABELTRAN":["【正式】"],"LEXUNIT":["bring/call sb to account"],"REGISTERLAB":["formal"],"TRAN":["追究某人的责任"]},{"DEF":["to use something for a good purpose"],"EXAMPLE":["Perhaps she could put some of her talents to good account by helping us."],"EXAMPLETRAN":["通过帮助我们，也许她可以把自己的某些才能充分发挥出来。"],"LABELTRAN":["【正式】"],"LEXUNIT":["put/turn sth to good account"],"REGISTERLAB":["formal"],"TRAN":["善用某物，充分利用某物"]},{"DEF":["not important"],"EXAMPLE":["As she grew up, her father was of no account to her."],"EXAMPLETRAN":["她渐渐长大，父亲对她也不重要了。"],"LABELTRAN":["【正式】"],"LEXUNIT":["of no/little account"],"REGISTERLAB":["formal"],"TRAN":["不重要，没关系"]}]}
             */

            private EntryBeanX Entry;

            public EntryBeanX getEntry() {
                return Entry;
            }

            public void setEntry(EntryBeanX Entry) {
                this.Entry = Entry;
            }

            public static class EntryBeanX {
                private List<HeadBean> Head;
                private List<SenseBean> Sense;

                public List<HeadBean> getHead() {
                    return Head;
                }

                public void setHead(List<HeadBean> Head) {
                    this.Head = Head;
                }

                public List<SenseBean> getSense() {
                    return Sense;
                }

                public void setSense(List<SenseBean> Sense) {
                    this.Sense = Sense;
                }

                public static class HeadBean {
                    private List<String> FREQ;
                    private List<String> GRAM;
                    private List<String> HOMNUM;
                    private List<String> HWD;
                    private List<String> HYPHENATION;
                    private List<String> POS;
                    private List<PronCodesBean> PronCodes;
                    private List<String> VIDEOCAL;

                    public List<String> getFREQ() {
                        return FREQ;
                    }

                    public void setFREQ(List<String> FREQ) {
                        this.FREQ = FREQ;
                    }

                    public List<String> getGRAM() {
                        return GRAM;
                    }

                    public void setGRAM(List<String> GRAM) {
                        this.GRAM = GRAM;
                    }

                    public List<String> getHOMNUM() {
                        return HOMNUM;
                    }

                    public void setHOMNUM(List<String> HOMNUM) {
                        this.HOMNUM = HOMNUM;
                    }

                    public List<String> getHWD() {
                        return HWD;
                    }

                    public void setHWD(List<String> HWD) {
                        this.HWD = HWD;
                    }

                    public List<String> getHYPHENATION() {
                        return HYPHENATION;
                    }

                    public void setHYPHENATION(List<String> HYPHENATION) {
                        this.HYPHENATION = HYPHENATION;
                    }

                    public List<String> getPOS() {
                        return POS;
                    }

                    public void setPOS(List<String> POS) {
                        this.POS = POS;
                    }

                    public List<PronCodesBean> getPronCodes() {
                        return PronCodes;
                    }

                    public void setPronCodes(List<PronCodesBean> PronCodes) {
                        this.PronCodes = PronCodes;
                    }

                    public List<String> getVIDEOCAL() {
                        return VIDEOCAL;
                    }

                    public void setVIDEOCAL(List<String> VIDEOCAL) {
                        this.VIDEOCAL = VIDEOCAL;
                    }

                    public static class PronCodesBean {
                        private List<String> PRON;
                        private List<String> PRONKK;

                        public List<String> getPRON() {
                            return PRON;
                        }

                        public void setPRON(List<String> PRON) {
                            this.PRON = PRON;
                        }

                        public List<String> getPRONKK() {
                            return PRONKK;
                        }

                        public void setPRONKK(List<String> PRONKK) {
                            this.PRONKK = PRONKK;
                        }
                    }
                }

                public static class SenseBean {
                    private List<String> DEF;
                    private List<String> EXAMPLE;
                    private List<String> EXAMPLETRAN;
                    private List<GramExaBean> GramExa;
                    private List<String> SIGNPOST;
                    private List<String> SIGNTRAN;
                    private List<String> TRAN;
                    private List<CrossrefBean> Crossref;
                    private List<VariantBean> Variant;
                    private List<String> LEXUNIT;
                    private List<SubsenseBean> Subsense;
                    private List<String> SYN;
                    private List<String> LABELTRAN;
                    private List<String> REGISTERLAB;

                    public List<String> getDEF() {
                        return DEF;
                    }

                    public void setDEF(List<String> DEF) {
                        this.DEF = DEF;
                    }

                    public List<String> getEXAMPLE() {
                        return EXAMPLE;
                    }

                    public void setEXAMPLE(List<String> EXAMPLE) {
                        this.EXAMPLE = EXAMPLE;
                    }

                    public List<String> getEXAMPLETRAN() {
                        return EXAMPLETRAN;
                    }

                    public void setEXAMPLETRAN(List<String> EXAMPLETRAN) {
                        this.EXAMPLETRAN = EXAMPLETRAN;
                    }

                    public List<GramExaBean> getGramExa() {
                        return GramExa;
                    }

                    public void setGramExa(List<GramExaBean> GramExa) {
                        this.GramExa = GramExa;
                    }

                    public List<String> getSIGNPOST() {
                        return SIGNPOST;
                    }

                    public void setSIGNPOST(List<String> SIGNPOST) {
                        this.SIGNPOST = SIGNPOST;
                    }

                    public List<String> getSIGNTRAN() {
                        return SIGNTRAN;
                    }

                    public void setSIGNTRAN(List<String> SIGNTRAN) {
                        this.SIGNTRAN = SIGNTRAN;
                    }

                    public List<String> getTRAN() {
                        return TRAN;
                    }

                    public void setTRAN(List<String> TRAN) {
                        this.TRAN = TRAN;
                    }

                    public List<CrossrefBean> getCrossref() {
                        return Crossref;
                    }

                    public void setCrossref(List<CrossrefBean> Crossref) {
                        this.Crossref = Crossref;
                    }

                    public List<VariantBean> getVariant() {
                        return Variant;
                    }

                    public void setVariant(List<VariantBean> Variant) {
                        this.Variant = Variant;
                    }

                    public List<String> getLEXUNIT() {
                        return LEXUNIT;
                    }

                    public void setLEXUNIT(List<String> LEXUNIT) {
                        this.LEXUNIT = LEXUNIT;
                    }

                    public List<SubsenseBean> getSubsense() {
                        return Subsense;
                    }

                    public void setSubsense(List<SubsenseBean> Subsense) {
                        this.Subsense = Subsense;
                    }

                    public List<String> getSYN() {
                        return SYN;
                    }

                    public void setSYN(List<String> SYN) {
                        this.SYN = SYN;
                    }

                    public List<String> getLABELTRAN() {
                        return LABELTRAN;
                    }

                    public void setLABELTRAN(List<String> LABELTRAN) {
                        this.LABELTRAN = LABELTRAN;
                    }

                    public List<String> getREGISTERLAB() {
                        return REGISTERLAB;
                    }

                    public void setREGISTERLAB(List<String> REGISTERLAB) {
                        this.REGISTERLAB = REGISTERLAB;
                    }

                    public static class GramExaBean {
                        private List<String> EXAMPLE;
                        private List<String> EXAMPLETRAN;
                        private List<String> PROPFORMPREP;
                        private List<String> COLLOTRAN;
                        private List<String> GLOSS;
                        private List<String> PROPFORM;

                        public List<String> getEXAMPLE() {
                            return EXAMPLE;
                        }

                        public void setEXAMPLE(List<String> EXAMPLE) {
                            this.EXAMPLE = EXAMPLE;
                        }

                        public List<String> getEXAMPLETRAN() {
                            return EXAMPLETRAN;
                        }

                        public void setEXAMPLETRAN(List<String> EXAMPLETRAN) {
                            this.EXAMPLETRAN = EXAMPLETRAN;
                        }

                        public List<String> getPROPFORMPREP() {
                            return PROPFORMPREP;
                        }

                        public void setPROPFORMPREP(List<String> PROPFORMPREP) {
                            this.PROPFORMPREP = PROPFORMPREP;
                        }

                        public List<String> getCOLLOTRAN() {
                            return COLLOTRAN;
                        }

                        public void setCOLLOTRAN(List<String> COLLOTRAN) {
                            this.COLLOTRAN = COLLOTRAN;
                        }

                        public List<String> getGLOSS() {
                            return GLOSS;
                        }

                        public void setGLOSS(List<String> GLOSS) {
                            this.GLOSS = GLOSS;
                        }

                        public List<String> getPROPFORM() {
                            return PROPFORM;
                        }

                        public void setPROPFORM(List<String> PROPFORM) {
                            this.PROPFORM = PROPFORM;
                        }
                    }

                    public static class CrossrefBean {
                        private List<CrossreftoBean> Crossrefto;

                        public List<CrossreftoBean> getCrossrefto() {
                            return Crossrefto;
                        }

                        public void setCrossrefto(List<CrossreftoBean> Crossrefto) {
                            this.Crossrefto = Crossrefto;
                        }

                        public static class CrossreftoBean {
                            private List<String> REFHWD;

                            public List<String> getREFHWD() {
                                return REFHWD;
                            }

                            public void setREFHWD(List<String> REFHWD) {
                                this.REFHWD = REFHWD;
                            }
                        }
                    }

                    public static class VariantBean {
                        private List<String> ABBR;
                        private List<String> LINKWORD;

                        public List<String> getABBR() {
                            return ABBR;
                        }

                        public void setABBR(List<String> ABBR) {
                            this.ABBR = ABBR;
                        }

                        public List<String> getLINKWORD() {
                            return LINKWORD;
                        }

                        public void setLINKWORD(List<String> LINKWORD) {
                            this.LINKWORD = LINKWORD;
                        }
                    }

                    public static class SubsenseBean {
                        private List<String> DEF;
                        private List<String> EXAMPLE;
                        private List<String> EXAMPLETRAN;
                        private List<String> GRAM;
                        private List<String> GRAMTRAN;
                        private List<String> TRAN;

                        public List<String> getDEF() {
                            return DEF;
                        }

                        public void setDEF(List<String> DEF) {
                            this.DEF = DEF;
                        }

                        public List<String> getEXAMPLE() {
                            return EXAMPLE;
                        }

                        public void setEXAMPLE(List<String> EXAMPLE) {
                            this.EXAMPLE = EXAMPLE;
                        }

                        public List<String> getEXAMPLETRAN() {
                            return EXAMPLETRAN;
                        }

                        public void setEXAMPLETRAN(List<String> EXAMPLETRAN) {
                            this.EXAMPLETRAN = EXAMPLETRAN;
                        }

                        public List<String> getGRAM() {
                            return GRAM;
                        }

                        public void setGRAM(List<String> GRAM) {
                            this.GRAM = GRAM;
                        }

                        public List<String> getGRAMTRAN() {
                            return GRAMTRAN;
                        }

                        public void setGRAMTRAN(List<String> GRAMTRAN) {
                            this.GRAMTRAN = GRAMTRAN;
                        }

                        public List<String> getTRAN() {
                            return TRAN;
                        }

                        public void setTRAN(List<String> TRAN) {
                            this.TRAN = TRAN;
                        }
                    }
                }
            }
        }
    }

    public static class MediaSentsPartBean {
        /**
         * more : media_sents
         * query : account
         * sent : [{"@mediatype":"audio","eng":"\" ...on <b>account<\/b> of the number of pine trees that grow in the gorge of the mountain in which it is situated.","snippets":{"snippet":[{"duration":"11300","name":"special.2010.04.26","source":"VOA","streamUrl":"https://dict.youdao.com/pureaudio?docid=-139385106736947527","swf":"","win8":"https://dict.youdao.com/pureaudio?docid=-139385106736947527&dist=win8"}]},"speech-size":"33kb"},{"@mediatype":"video","chn":"我们还应该注意第一个创世故事中的描述，说他们在上帝面前有不平等的关系。<br>","eng":"It should further be noted that in the first creation <b>account<\/b>, in any kind of unequal relationship before God.<br>","snippets":{"snippet":[{"imageUrl":"http://dict.youdao.com/pureimage?docid=6315912264594031708","name":"耶鲁公开课","source":"旧约导论课程节选","sourceUrl":"http://v.163.com/special/sp/introductiontotheoldtestament.html","streamUrl":"movie=http://dict.youdao.com/purevideo?docid=6315912264594031708&auto=true","swf":"http://shared.ydstatic.com/dict/4.0/simplayer.swf"}]}},{"@mediatype":"video","chn":"通常经过文学分析，会发现,最终版本都经过艺术加工。<br>","eng":"Literary analysis that is sensitive to the larger contours of the <b>account<\/b> will reveal the artistic hand of the final editor.<br>","snippets":{"snippet":[{"imageUrl":"http://dict.youdao.com/pureimage?docid=1354883003772870612","name":"耶鲁公开课","source":"旧约导论课程节选","sourceUrl":"http://v.163.com/special/sp/introductiontotheoldtestament.html","streamUrl":"movie=http://dict.youdao.com/purevideo?docid=1354883003772870612&auto=true","swf":"http://shared.ydstatic.com/dict/4.0/simplayer.swf"}]}},{"@mediatype":"audio","eng":"But users are charged if they try to spend more than the amount available in their <b>account<\/b>.","snippets":{"snippet":[{"duration":"9500","name":"special.2009.05.21","source":"VOA","streamUrl":"https://dict.youdao.com/pureaudio?docid=3489381727482543878","swf":"","win8":"https://dict.youdao.com/pureaudio?docid=3489381727482543878&dist=win8"}]},"speech-size":"28kb"},{"@mediatype":"audio","eng":"He also wanted her to repay the two thousand dollars that was put into her bank <b>account<\/b>.","snippets":{"snippet":[{"duration":"8200","name":"special.2010.04.24","source":"VOA","streamUrl":"https://dict.youdao.com/pureaudio?docid=8361486732036605144","swf":"","win8":"https://dict.youdao.com/pureaudio?docid=8361486732036605144&dist=win8"}]},"speech-size":"27kb"}]
         * sentence-count : 6
         */

        private String more;
        private String query;
        @SerializedName("sentence-count")
        private int sentencecount;
        private List<SentBeanXX> sent;

        public String getMore() {
            return more;
        }

        public void setMore(String more) {
            this.more = more;
        }

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public int getSentencecount() {
            return sentencecount;
        }

        public void setSentencecount(int sentencecount) {
            this.sentencecount = sentencecount;
        }

        public List<SentBeanXX> getSent() {
            return sent;
        }

        public void setSent(List<SentBeanXX> sent) {
            this.sent = sent;
        }

        public static class SentBeanXX {
            @SerializedName("@mediatype")
            private String _$Mediatype155; // FIXME check this code
            private String eng;
            private SnippetsBean snippets;
            @SerializedName("speech-size")
            private String speechsize;
            private String chn;

            public String get_$Mediatype155() {
                return _$Mediatype155;
            }

            public void set_$Mediatype155(String _$Mediatype155) {
                this._$Mediatype155 = _$Mediatype155;
            }

            public String getEng() {
                return eng;
            }

            public void setEng(String eng) {
                this.eng = eng;
            }

            public SnippetsBean getSnippets() {
                return snippets;
            }

            public void setSnippets(SnippetsBean snippets) {
                this.snippets = snippets;
            }

            public String getSpeechsize() {
                return speechsize;
            }

            public void setSpeechsize(String speechsize) {
                this.speechsize = speechsize;
            }

            public String getChn() {
                return chn;
            }

            public void setChn(String chn) {
                this.chn = chn;
            }

            public static class SnippetsBean {
                private List<SnippetBean> snippet;

                public List<SnippetBean> getSnippet() {
                    return snippet;
                }

                public void setSnippet(List<SnippetBean> snippet) {
                    this.snippet = snippet;
                }

                public static class SnippetBean {
                    /**
                     * duration : 11300
                     * name : special.2010.04.26
                     * source : VOA
                     * streamUrl : https://dict.youdao.com/pureaudio?docid=-139385106736947527
                     * swf :
                     * win8 : https://dict.youdao.com/pureaudio?docid=-139385106736947527&dist=win8
                     */

                    private String duration;
                    private String name;
                    private String source;
                    private String streamUrl;
                    private String swf;
                    private String win8;

                    public String getDuration() {
                        return duration;
                    }

                    public void setDuration(String duration) {
                        this.duration = duration;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getSource() {
                        return source;
                    }

                    public void setSource(String source) {
                        this.source = source;
                    }

                    public String getStreamUrl() {
                        return streamUrl;
                    }

                    public void setStreamUrl(String streamUrl) {
                        this.streamUrl = streamUrl;
                    }

                    public String getSwf() {
                        return swf;
                    }

                    public void setSwf(String swf) {
                        this.swf = swf;
                    }

                    public String getWin8() {
                        return win8;
                    }

                    public void setWin8(String win8) {
                        this.win8 = win8;
                    }
                }
            }
        }
    }

    public static class MetaBean {
        /**
         * dicts : ["ugc","media_sents_part","simple","etym","blng_sents_part","wikipedia_digest","syno","web_trans","longman","meta","ec","ec21","phrs","exam_dict","ee","oxford","auth_sents_part","special","rel_word","webster","collins","splongman"]
         * guessLanguage : eng
         * input : account
         * lang : eng
         * le : en
         */

        private String guessLanguage;
        private String input;
        private String lang;
        private String le;
        private List<String> dicts;

        public String getGuessLanguage() {
            return guessLanguage;
        }

        public void setGuessLanguage(String guessLanguage) {
            this.guessLanguage = guessLanguage;
        }

        public String getInput() {
            return input;
        }

        public void setInput(String input) {
            this.input = input;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public String getLe() {
            return le;
        }

        public void setLe(String le) {
            this.le = le;
        }

        public List<String> getDicts() {
            return dicts;
        }

        public void setDicts(List<String> dicts) {
            this.dicts = dicts;
        }
    }

    public static class OxfordBean {
        /**
         * encryptedData : TNvL5RvzrtPgEpLHE_NgThWwwkxquWqw-vfSABjPoFNyL3_S4K0m21IsczBUYE3Ukt-FiVGKQypHwLkUAzoIWeFEkTDRjFdRKhzCVwelaWii-o2uk65pOT2eRfQ8Mr4zxzolxNcOIQC-VhzC4ykUDj6eGS1x3OfN3mN1DzTXg_52iWoZsRBhstm09kSW_pb4jsc-UzVgASFgWRuitbZKn252KYFWOLLWuV8l3xnVCJTqzxRUZlPE_hvw2_L0jcUktmuPwU4t7bYvqzjPuXVJ5qu9T2W-rTHC8fhM_00CpkBp7TiKH5apQUOQ04YS-S3iRqYRi-L225937pf7Jeau4fWXK1JWv7A-cKg_IEc8hVe27csfOyg2Hl2fFhitvoqjwtIPfdCQvFpBtockRLRgMERRp24D5acCbhXukCT97k7jxTO07ALjbUC55WZCQUDa38r9B2YyFcOx1-LNY0_rDgr8ry3WpFcT9q_CuIhwSjYi7Vurc8ynCEukQQYRwyP4G6jpqfRG9fLN57axlunamEbtNNsMkqjxYNddBSaCKkV89-cfGtfexjVPbkGLMIu4aXVlFN-Sn9UIo-AoL6g-QRyUNxjJblDa2wpRiZv4wp5iKvdPFEGWTWsRQOCH4OE2fjtv3wq811vZr_ntww807A-oK-FJL7J5ZnKb1w0sbG6hRTJkscLjtmfZGPEc6BCooQEQD0SBJYqDAYSFCwTJMi5ZfipTonPKjsTUqrEbLwRtOIwtYa9TqWnThVVdBmvDF18Z1Az4X-bcaKvgQ7gQz6iRHtNt_Ksq9r4v5QXXV-V444A9sILLEeuEgxIy_dN6OSEfqv8DivJePN2CgUVZ9s6S6ZBh5jfzkrZzq433UMCWwV1xrtwzFm8qVESWiIC4e_F123dtyumliUGTuCVaRNWyU-ZeRE17KYqx4qo6t_aJ3YvOis5SDxK_J-otr0sbx6m3OtiShmc_MXS2n3xelggw02tfW6uQvcybGCnc9Zt9B3zd0o9qCyh5wvgcHv4RBLKrpJl9LvFARN8Gg4B_NAcYmX2wXQFGObKvNXatTzWHDBtu0t9DIunQO9Z0KNGKpMCsZASz0W1D6UlPC16IyNWqT4fW9azZKCX-DX4a0aNyNpPrQipmyYrYiISoGZ9Cs9JgQzyio5ej-D_1UvRMnzq9RsCMRFknfURnruwD_CYunhzb-jxwY1SzfhgSU9zeq-vzR2ye7dUAAqrPLN1gKb57OyoqbvpClmXerwE3OtFxu97BTeR_Jb_U-_V-FcTIjxA-lm2btGEDjuAHbGUsdEsUzCvI04u3hqR9-vnPfDqUk7tzKiiRBHUojMLWr6g8l51Eot2cOJra-XODabkvMyhtZ1H7TzFOq8s8TBw6do5lRtca4SIdigVbv96J9ZoVDTrC304XXV_-WVA4J02ZEsihYoQL_Y4z_CMPKbbqIdaWuXDoxeU_Y3UQ3QBiA0Qtvj6HNFMkhLlXplB4PnT9Z-rjd6XR6GON0bCf1LgsvwfoAUt_hvUd6ezb2MSjetyQprTfXARXmRltn7n3SF1L-2EgocfGW_a5ugZj3-aNnKQkOpeH3k6VkCcohcwVqiUpXApepoA9s2BsRB5W-dTnDTCPaqnwS8WrXLo4Urpx0WVODEbKBODlRUxuJUPm1SPGfFmIyvZCC4K_Jb9haELxilYedZGk3M__cfBt_BjCHuKr1hLyvWDFZjgg1ZZ4Y1VVaOqWSZFu1kXjwUtWLsBxqCEn_BSgbQKyohBaaeLONO9i0n4snFIZV45-a8Jps64ob5fJG-HL9iAhdx6_yhSw80UPmVSzRaDOfFAaUAnxNsr9pFfhDONnpWePnlwU25N9duz20V6dJaurtVVsTkmYj3w2C9Bl01toVzOCTe29fO0sRjLVdFQ1SWDQkfQJxgrb56IpigAy0acuApddkyNRs7xl8JpEJzu7NvAyucScIGMwkJRw7Fxo1wsjPVZNIGPV1HQFxHpcYRp6E4ZzC2_wvknJl2reQ7oVoPGFH4S8ccIxzCH-2cwcSDm0ud-Nsc3hdGM9280UaTIS_j707_Nj3xMSt0aIFG2QoJ7hnRI9YwkFvRzeoKQ-UcL4TAch0wzjRPABeREcG7mo8RTiWB1U-0IupmXUVHTsV2xHxOZRJfVMzrehmAwyH5HLCbKywsGTgVXDaMVlaxWAdJsDqe8Xw81If09_j3cPCi1CX8RjLbXBZ8UXgutQZDZTAbYtjTFvEdmHaavcgE3qMoJtAX_v1l3F7kVSkpDmykU7yH5wgs6K1D-__QIdECQSJg8Dvw1heJnUvwWQmyiG55c78TQtUkAe6eHVZ7gMO4NoeW9RQpFFSf-TGL-t9jcsdGvgn-qerunDJhhYFlsFvLh9rnN4BFqUcJkChkxiX7gBxy4w1eiD7PucTHA5LD0hgiFcBsBuJCRm_j7HFuPdAQLCzHcn3v9xKCsbao7T1BDpFvwyIgEXmFfXjHsq3I5Avj0CZFxFRb2YfMnevkz5NaxtLbMfv-8GDLUF3dOf-oazEHGGCvrQW2CFupM-soLEbaEszOnJHfD580K3kvsYrRh9ythQvqt_gWPZnfPlp5Kd71Am1qUEWw3QMAS_p567dTAbr8e0o_vZFlxi12f1x6pDcWqgxFyM5xwLblu6i6EHZaZdAf_-0W_IWjYlkthiSQ2be43B4zWPe1gPlL8zvlztRPZE_U7AddDVITb3MOmrU_nk7CgO8G9gsBMzi8mAdqGkOZ3A-0SNi2abnFHhjpcZHuxRCVXsyXrkQa7xSv9fku0rXoAEhT7S1QVCwwW-mhAPjVoECLFdob8vECpbEoSaoIDnqhNJnfLDHEILEvrTrtim6yjI1hnnLM86ou6-P1waNA0QIGxCwMe4ANP11_QFg18LDLZRV5rkso43xa7Q3hsQBa2CSHS7emGMKvdeGXxa4rC_okhAOKCpP7hadLwaE3bNRWusKstkowC-eQXo5wcBXS3YvLVOsfkYv5-jJyU1AXceg9Fi8PuuVxhslLv759jesL82kuhptzZk2NlJOqe-AwWbdLlK4aAutzeXPD5-nvH5oxal8RxlTz6yU2KfJ10dgvnjRrhjzVGrQ0kTzVZaPnQFajKY8oQoSD_RoiPua2a3zgPN-P2cfIp6dDNtcweN5QT4HZ6VSnCS5EaRHUklf_RAHBajRvhctIb4r5_M_VubFwtg4usJMlUkgodyMVN2e7dXYO9WeB42sKgAA_GVJWsNuag9fawc3fZzIdWr7YipQ9ZZpvb_RObV7oKPapJtwv073qVM4bSOXZ7K8Q2gbLhY_CF_C7jhrWf-fFa7MOSI3k1C6cRe_30M4kW6XU9k95GbW-Ap42rMJ2u6YGdMLE4zZBbw-HjnjwUgAHaSSm6-XLzGkZf_lVQIHnCt-MUKagcw0eWysifNr1Alagkr5pA9VY6P8YZxFpmKFx7lxy_-bsCbjRJCIKiW8KsG_t3MSjuBb4VLEE49kiNrJBQ-s6m9ddueObRVKnz_zhfMBfZ4si6tHJpBHf29m8ppuq0EoBMFR4iPJ5-Y8jOqBLrtsTv3hBCT_wZKctcjzhZ3OIGYwf_tufP1tC9_EG1v__x-sA5-fyZzkac7WWUF8qvFGdcCesk_ZNOdzsRVMRBd_8zD2IPyqayb2q91JzLJcYw2L33ilNvQDZkPVhNjCVAf0O5sb8hSl5d9-X745doVX1TJci8XfiZpwuiOkZDiU3azW5ndaS4XgyR_BkRFzaVj4GbXWXa9NWVrsYLmVYSt7k_pYH-cSepMQU_Ca1E9MuXLiyuV88J1Z53v5j6wdSmbfPa83QWJcXbJpX2upL9lyqVnjwht5YqAVZ8Ap8pbiPi8gvnEPhGC-pcKnIpeQ-BObltn2mT0sLKOPGnSb4WBQE36Gd3flPPv3EhkvieNsQuysxevvCGQabbFFMQp00oSIfUccRawL4Rzw4v9URM5hywWgsMevkwYiqcrJxRZuts_L-ABL_a2fxE3OgJWQomD9l-8in9iQATR8_s9xczoVgVov7WUZtaDcuhARHLogSLojh7CryD932bHI0R8smeMFXGkpb4_azrQ2qv-btI1OBWR09_uqdr-GIENyI506fVZeozwZMdloPVd6ffeaauHCHlZPZzoEnV4aF7NsiTsN3CR_AE17whNn6y1GqfvO8CMJDME1Ly-WKBuQ0lda1A_efhS0nqebincT-qHs5WMz9Flk1UM-CAlRxxmejNgLET51kZeZy8e9n4jofbEL_tThwmEP_QSyEKr1BlaC6a3Ia4VaaQ0VV6NvuSQ8hSqN5HXi1--W6M0csR4ufsBIx5aOXh6_omtLO0-uBkkbpndLDz5XqHr1N3KsG3ZhA-tltXhIWu2v-l7tj0GF_kgvAYdPULNgPUbQcvAXt5MG86rhMKIxNsrV15KeCfqiTfsciK4n64h7ttYwreseIe5Oj1jSZELYGHo-WeLL06Etv3J83Q87IdXNML0T33amTmb6RRSrobjzh0BdE07d9o8yPoOD5Yz2x31S2iU0ogUkjOqluyyo3lWMy-cyxkLl689MylgaTPUfMNRctCcEByGbHbRCdRNG-KYAaEej82UnQp-A6G5zVwdb0tRV60uqOwn6U7C-j3Lus7g9UVuhV1RQCKMg70Y9Oob9JtcLXxBwuqnFj4eBew2Pyt0KK1esMqBSKl0xhvGs_RKFiKV2vmiz1NIpOVhj6bCgdNfgp7yG97fAIlLRNdSQCy827k1tqdspgEPFGk83Y6qakkvUG70QOmnrQ-CR5AGX3_WsrVbSrQ_g99bd9suofb4ebv5hRgsC5lSCXiliuc9syMWLEo7lY0qfAIz0WspQ_tLU-k9U11HGKRoDFdmFmvyQ3l3CroWap1lzhmRGHmXlUkIUzZH5jfEBcrlxnC39KySfxupz5AORA5WCCaZOp5_cR5rlmRt2sg6PjG0Bj-r8fWCJH8jOhpuplvWQ5CQCtjg6zkOzJqOK3dF0EYfHLclu1wmHBDJLGd2fnUK5NP-ssBguxdANFi0f9KcNxTe2827t_xqNdpN1FGugPMGlbL4xKvfEiDmPi-1Euz7_1j9bqftXZbg4ZgyNW8rZoCvgGNsfmzuR4nrmbRYA7n5LhRh2Eczr25TFWrNShXUBjWJItPKg4vgr-42gFweyGyjzTbmL5X026ZrIsGUzMFmL4pvLlM2crHv_WFwtpXwZXTgqVcjvaj57Ucq_PafUDbYCitouh_wVWXynhFqIvNxlQpkkS8syl6geYybivBQBqPnaWoej36SAA-lRuydDqMIMMpMFyt-0T4s66C5_7ttbRVagBlGnFnYsmjn26OOSgp8VIYIBIIJPnXFMjnYhVlE-YlQUz8-KApmCfo6rX_SJNldBztocBS3w1jZxRCR1_ZcITA7RPbap-xUsNy-uVfUwnXrHj-9mv6gYBojrEELC0OdHvk-a2PJYPsJ9AvGx8D0JY-RsfM-LJw5QhKCLmShUBt6qwUQzGNEQpzSoOtw73CEYj3DKIUwdb6vrdFomD7_HDD1pPp3kOM1RjlCPyvxuNROLjFNyiQPPPoVYUwX_llz_H_gx8Bf8vUTOFxb47b3ZWA_lAIj30A_TrO8fful870VTtog0qKdL_7eE3iAn52bbljN7vbGlSp3t5JoiHoh6zJXMrIRuEUe6tz-_fKeRQL9TzR_pJr50WI4C2HQplVw1LFlLLIID39pxyaZ7XrzkHpeeoHfhCtnYbvImEchi1Wx8s59ZGjGPDUkUvzgfUMGXGQnCvRSlB9_A4o0mMCyhRb0Yhg0L_tzXg9z8zB5QcRakGaxwXvrXZbutRRASu2itwWCJHi4ryIMqOdus2yNMYZ-8tJB2kgD38brgvBrMbGlpRyLJOKjOqXqMJZB23g9Mh_Kp6zU-djS6UhisAi6YpynY6k6reUa0HV9Q5XaNk5dGk6PU9LfPO9jIBUnBsRY3UGQtTpdtY3S9ZHMlWkA2WEU3-H4Kgi5QTaYYIYJBRhqKHIXI1YdBFO4TuL_FFZvKv8jt4so_MQTUIu7xuyjnkHON8lYV-BGHSXO4Xd4C9wz09gAaTDq_OYC5RW3XmNiVkZ4i85rRLozzReIo1wRMn1Lk2VbUDWVnf32zZDugy761jltqp_3H2Ahl92MqnpfAh4zH2mCnqwOw5RluIR4FCb3Cxn9y05wQmIALM_n2aFI1eoQPi8hLFqa3EiR0SFa6WLm-Go2VQL3wkAmARiND7bPzs3NFTFPvV0W2d8uRoqt-xTA8bnMt60fBByVuMmxqQ9-Ephl3VhKqJdbtxHdk7HUqgdgLGpQxZhFzcfmf8LRDdgnxJMu14FRnD0vJ0JKg7kkxjMbylKWcbS0v3pngoiBdT-ZnDNCeZcNbJp-7VFUmaPwR8TQJT1qpcfdYLAQA_5WjiU3GYdBfJo4USvtLpF9fPcD3VeelZbKxb0nZL-KFNvoi-Og91_nllM3fmkOuydIMGIMsY8kskUJMpBhrun_tU6UbFhX7z43ZI6alDAHR-9kAqYJNmbpSzSEy4G2-wt1Lr6ak_6X3sNdSJciW3KeKnX1nnerkYOz9jmGpDd0Fc0cbtrqtogtPpxNvWqIWEqUBVPX_IzG7BrxfoYvCtYGzyBRM4OYCjY9VnGzGZfAaRJZbi-rxrZ7uJxu5bZJcegwNN4GqsydUEgAwPdTsbd3OEYbTB5SDFsIsWUxviHHuavHYhjZQSxK2vSIn8Se5Syce2G45jXljk87pR9x0bdYm89mt6uiFw3kcebfFvScaelvpxCffcR4AhIGLRPTGtxfGMU7s5V0M4M0F0c4VgsUVby6SdN-hBTxxQjmxY21x8ev6J2Pi4jpPwE-vboQe0PkNSNCg8kl0-6SgwbWgUlgUtYEyx8_jvTaNuV3rXBiZ3ioF-Fw2vidXyXOX-12ffqjTgNh2uisFJRxD6gi_BKxDMdaDlKTY_xLLGlxCEhyBQWsMPOHX2srqg9A8c0WOsd_dKM6LICgb2UPQK_yscbuCK9iWOUqLH0IXw-M5G6ZhQWmZptuY-uUQT-rSvAb-XH7FXq5pTrKFe9DaoW-JKSg2oT2R7rDFYpd2BapcfiD3CwKwaQF-ZP4YUIZcY-u8g76YX9j5VIrXus_z9-3J8cjeU3SDU309um-MEAwXd70QeORqIhqwLR0N7JFQki2lxCKYofYUquvkgw0FHdA-2N4njjIKommLeDkcsYk7UJb0--VkAndyQPwh_ouQFBDd3d0HEeyuVyby2EMFvXlIwTOh7AyxU-_D_1TDL_AKw0YZTR1yjpNNwF2vlj8mTKBj10wljUsG98BlWRz-b4Eorosorvsum_Wd7mh7McvPxZubkRDgBmjx0IlQTTobwKvsyikvq-8BtLYsqoJ88YpYFpY1mWINIkMrkYI3h8nsrQ-90p1U9cD-Zs8I5q0Rmk9euS9-_QS8pue1BfnB7puF3VYf_7jdbiuGbIRv1O3h_aSIwsHq3qN3xVZo_G6IjHrtalC228Su3dIabla1guZNnCycBPLcztbzRyxkADu2ZnRfSUXlDsZPiS-2afWIUzTBawlT9bbUNU4zzQ6MVtyzW16v35uappxr2Z5YsglXGNk2GkQEIjH-WqlqRY0oofVNjMGojv0xf1X_QSftIlqUS8JiVf2yZphrZtZ9y-T_b1-R_T2esqL_RJQtfuxrNR_biuyQnjt9tluzbmY2qlsjnoPYIKEMbwlF63lC1UipLW0Jdrpa1BcZiYAsmhrxRhfRzj7aiBX4knfpfdENsibJBmFtAamlWmYeakF6lknn4oZMRBi6uMhkrs5leXKLFYozn0OCAiM3kQhwkAngH0fqf4R7snW_h8VSDwdD-xxBYq0cEkgAJpnYGtF9TkVyb2Z-VsfQETqRo9uiXTLYmMlXJ_Xmy8R5lTfGIqg91-M3u6lrVsmhL7xaIBKzWBwkhrPOG8331Sy95ml_05KvBF0KhH1ogSQDzztzqyWkwedh2a_XuccfjjsKHJhR533SgYTaDRtpbmdiD0S-gSB4tgBvoelBfcZgzUzwrBTFZXudYFstREjFMwsCTVym74MvNZ6fEG-QnjVPe_2tkaNJzYSUXL7qf7q9JLVFX1bA5qUNrUCLnMkcG2FB--SugZZbZSrdFEGdL58h2LxTNj5h3I_NlNZ3fOlglbUy_f8No7aro-rQbXzXzJiJ6v9hFB3jBn9EI5yVkYoKl8XgQJ9oELpzcSJCNAYOjOhm9wV3-kL3HQrozDCYAiJ6PkvhnTcPnNh0-i9zBgjzm5ASmwzGaAFjsf7rBuQrPllztIg6xXMH7-8yDA7P3M8Uyzv3dN0KUrrq9cnS4mMxGOAsEzimdidZC5zWVlIAqQ8Ku-QyTmylHJuRvzzg83IG2R8cM7tmmqMJi59_4Nb1z_Cm_y2eZm04Ma20krsoMa4KRSulRrGiUm2cdXTg06RSTUQv3dpiBvr-OJD-uF3Kb24SODGd6ojOC-fZt264aojEyDfCFuRWRCXsYDIYSxsOZSuWmpcjkyrTWkdQ8WnmuHQgf0qKK763pAV4Xlse7K7EyG9o-b2k5jeYraGPeEwpQJCzfZxIxcpFyXJymuMwgHznRbia9uHOqh0WCbpOb6MPkSvL3Qo6Lpcvz0ibyb4Vn5_ddYEEucGKRwOAZcqFd4yPC1l3pC29K_PxeG-fU3rO9jeza3JP5teC5i_Q1D9PdaY4ji8AvGdZaqsgfWxKXN0JXS-9sFOW6OeQZ7hmgHtVP5FuLsl31p1WJzo2_YqP4tg6hurjP3XkRhkpq3SNHZt7XfUK4jJTQVZxnonXgfBmsNBLsTozs47sZSqpioPcNxWRbZYm5BwgGv0a4ANMh8w5Wc1FmADwL3O1KCeIYfrej9r_b14HL5M9A3GR5ZQsEMFht5GS1Uye3huVV0wTy5VdfvyZ5wLG8N0xT5bnMOMt_K_ioKXKp1X0mXjasQG4HUudLz6DPJCdP1ZzlJMRRocHyyv_PletB5NAQdi7Ra1BxdN9IUNZp0gW0YMG5zY3j3ziwkyw0CvodQDA2yX6LDkx_8WocGWxro2hR5RdWrJDfsWtAyGn4fU1pNa3pUMYXrqmdFCHM3zLSxCn3ScUnaJTkwTFPkMRE_vtqwbcXMa_0MDgvCGGePDSiCCASm1mSYt8vz5KQ-D2vNURBip2LktfeOnwgfYmGeEi5zxbxa90WfoiqGDsrnBb8XIwyzyRHMB
         */

        private String encryptedData;

        public String getEncryptedData() {
            return encryptedData;
        }

        public void setEncryptedData(String encryptedData) {
            this.encryptedData = encryptedData;
        }
    }

    public static class PhrsBeanXX {
        /**
         * phrs : [{"phr":{"headword":{"l":{"i":"account of"}},"source":"","trs":[{"tr":{"l":{"i":"在某人帐上重视，\t记帐"}}}]}},{"phr":{"headword":{"l":{"i":"account for"}},"source":"","trs":[{"tr":{"l":{"i":"对\u2026负有责任；对\u2026做出解释；说明\u2026\u2026的原因"}}}]}},{"phr":{"headword":{"l":{"i":"your account"}},"source":"","trs":[{"tr":{"l":{"i":"您的帐号"}}}]}},{"phr":{"headword":{"l":{"i":"take into account"}},"source":"","trs":[{"tr":{"l":{"i":"考虑；重视；体谅"}}}]}},{"phr":{"headword":{"l":{"i":"on account"}},"source":"","trs":[{"tr":{"l":{"i":"记帐，赊帐；分期付款"}}}]}},{"phr":{"headword":{"l":{"i":"on account of"}},"source":"","trs":[{"tr":{"l":{"i":"由于；因为；为了\u2026的缘故"}}}]}},{"phr":{"headword":{"l":{"i":"bank account"}},"source":"","trs":[{"tr":{"l":{"i":"银行存款；银行往来帐户"}}}]}},{"phr":{"headword":{"l":{"i":"be taken into account"}},"source":"","trs":[{"tr":{"l":{"i":"[俚]被考虑"}}}]}},{"phr":{"headword":{"l":{"i":"current account"}},"source":"","trs":[{"tr":{"l":{"i":"经常帐；活期存款帐户"}}}]}},{"phr":{"headword":{"l":{"i":"account number"}},"source":"","trs":[{"tr":{"l":{"i":"帐号"}}}]}},{"phr":{"headword":{"l":{"i":"of account"}},"source":"","trs":[{"tr":{"l":{"i":"重要的；有价值的"}}}]}},{"phr":{"headword":{"l":{"i":"savings account"}},"source":"","trs":[{"tr":{"l":{"i":"储蓄帐户"}}}]}},{"phr":{"headword":{"l":{"i":"no account"}},"source":"","trs":[{"tr":{"l":{"i":"没用的；无交易；未交帐户；无会计科目"}}}]}},{"phr":{"headword":{"l":{"i":"account management"}},"source":"","trs":[{"tr":{"l":{"i":"账户管理"}}}]}},{"phr":{"headword":{"l":{"i":"capital account"}},"source":"","trs":[{"tr":{"l":{"i":"资本性帐户；固定资产帐户"}}}]}},{"phr":{"headword":{"l":{"i":"open an account"}},"source":"","trs":[{"tr":{"l":{"i":"开立帐户"}}}]}},{"phr":{"headword":{"l":{"i":"take account of"}},"source":"","trs":[{"tr":{"l":{"i":"考虑到；顾及；体谅"}}}]}},{"phr":{"headword":{"l":{"i":"deposit account"}},"source":"","trs":[{"tr":{"l":{"i":"存款帐户；储蓄存款"}}}]}},{"phr":{"headword":{"l":{"i":"new account"}},"source":"","trs":[{"tr":{"l":{"i":"新帐户；新开帐户"}}}]}},{"phr":{"headword":{"l":{"i":"checking account"}},"source":"","trs":[{"tr":{"l":{"i":"活期存款；支票户头；活期存款户头"}}}]}}]
         * word : account
         */

        private String word;
        private List<PhrsBeanX> phrs;

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public List<PhrsBeanX> getPhrs() {
            return phrs;
        }

        public void setPhrs(List<PhrsBeanX> phrs) {
            this.phrs = phrs;
        }

        public static class PhrsBeanX {
            /**
             * phr : {"headword":{"l":{"i":"account of"}},"source":"","trs":[{"tr":{"l":{"i":"在某人帐上重视，\t记帐"}}}]}
             */

            private PhrBeanX phr;

            public PhrBeanX getPhr() {
                return phr;
            }

            public void setPhr(PhrBeanX phr) {
                this.phr = phr;
            }

            public static class PhrBeanX {
                /**
                 * headword : {"l":{"i":"account of"}}
                 * source :
                 * trs : [{"tr":{"l":{"i":"在某人帐上重视，\t记帐"}}}]
                 */

                private HeadwordBean headword;
                private String source;
                private List<TrsBeanXXX> trs;

                public HeadwordBean getHeadword() {
                    return headword;
                }

                public void setHeadword(HeadwordBean headword) {
                    this.headword = headword;
                }

                public String getSource() {
                    return source;
                }

                public void setSource(String source) {
                    this.source = source;
                }

                public List<TrsBeanXXX> getTrs() {
                    return trs;
                }

                public void setTrs(List<TrsBeanXXX> trs) {
                    this.trs = trs;
                }

                public static class HeadwordBean {
                    /**
                     * l : {"i":"account of"}
                     */

                    private LBeanXXXXXXXXXXXX l;

                    public LBeanXXXXXXXXXXXX getL() {
                        return l;
                    }

                    public void setL(LBeanXXXXXXXXXXXX l) {
                        this.l = l;
                    }

                    public static class LBeanXXXXXXXXXXXX {
                        /**
                         * i : account of
                         */

                        private String i;

                        public String getI() {
                            return i;
                        }

                        public void setI(String i) {
                            this.i = i;
                        }
                    }
                }

                public static class TrsBeanXXX {
                    /**
                     * tr : {"l":{"i":"在某人帐上重视，\t记帐"}}
                     */

                    private TrBeanXXXX tr;

                    public TrBeanXXXX getTr() {
                        return tr;
                    }

                    public void setTr(TrBeanXXXX tr) {
                        this.tr = tr;
                    }

                    public static class TrBeanXXXX {
                        /**
                         * l : {"i":"在某人帐上重视，\t记帐"}
                         */

                        private LBeanXXXXXXXXXXXXX l;

                        public LBeanXXXXXXXXXXXXX getL() {
                            return l;
                        }

                        public void setL(LBeanXXXXXXXXXXXXX l) {
                            this.l = l;
                        }

                        public static class LBeanXXXXXXXXXXXXX {
                            /**
                             * i : 在某人帐上重视，	记帐
                             */

                            private String i;

                            public String getI() {
                                return i;
                            }

                            public void setI(String i) {
                                this.i = i;
                            }
                        }
                    }
                }
            }
        }
    }

    public static class RelWordBean {
        /**
         * rels : [{"rel":{"pos":"adj.","words":[{"tran":" 有责任的；有解释义务的；可解释的","word":"accountable"}]}},{"rel":{"pos":"n.","words":[{"tran":" 会计，会计学；帐单","word":"accounting"}]}},{"rel":{"pos":"v.","words":[{"tran":" 解释（account的ing形式）；叙述","word":"accounting"}]}}]
         * stem : account
         * word : account
         */

        private String stem;
        private String word;
        private List<RelsBean> rels;

        public String getStem() {
            return stem;
        }

        public void setStem(String stem) {
            this.stem = stem;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public List<RelsBean> getRels() {
            return rels;
        }

        public void setRels(List<RelsBean> rels) {
            this.rels = rels;
        }

        public static class RelsBean {
            /**
             * rel : {"pos":"adj.","words":[{"tran":" 有责任的；有解释义务的；可解释的","word":"accountable"}]}
             */

            private RelBean rel;

            public RelBean getRel() {
                return rel;
            }

            public void setRel(RelBean rel) {
                this.rel = rel;
            }

            public static class RelBean {
                /**
                 * pos : adj.
                 * words : [{"tran":" 有责任的；有解释义务的；可解释的","word":"accountable"}]
                 */

                private String pos;
                private List<WordsBean> words;

                public String getPos() {
                    return pos;
                }

                public void setPos(String pos) {
                    this.pos = pos;
                }

                public List<WordsBean> getWords() {
                    return words;
                }

                public void setWords(List<WordsBean> words) {
                    this.words = words;
                }

                public static class WordsBean {
                    /**
                     * tran :  有责任的；有解释义务的；可解释的
                     * word : accountable
                     */

                    private String tran;
                    private String word;

                    public String getTran() {
                        return tran;
                    }

                    public void setTran(String tran) {
                        this.tran = tran;
                    }

                    public String getWord() {
                        return word;
                    }

                    public void setWord(String word) {
                        this.word = word;
                    }
                }
            }
        }
    }

    public static class SimpleBean {
        /**
         * query : account
         * word : [{"return-phrase":"account","ukphone":"ə'kaʊnt","ukspeech":"account&type=1","usphone":"ə'kaʊnt","usspeech":"account&type=2"}]
         */

        private String query;
        private List<WordBeanXXX> word;

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public List<WordBeanXXX> getWord() {
            return word;
        }

        public void setWord(List<WordBeanXXX> word) {
            this.word = word;
        }

        public static class WordBeanXXX {
            /**
             * return-phrase : account
             * ukphone : ə'kaʊnt
             * ukspeech : account&type=1
             * usphone : ə'kaʊnt
             * usspeech : account&type=2
             */

            @SerializedName("return-phrase")
            private String returnphrase;
            private String ukphone;
            private String ukspeech;
            private String usphone;
            private String usspeech;

            public String getReturnphrase() {
                return returnphrase;
            }

            public void setReturnphrase(String returnphrase) {
                this.returnphrase = returnphrase;
            }

            public String getUkphone() {
                return ukphone;
            }

            public void setUkphone(String ukphone) {
                this.ukphone = ukphone;
            }

            public String getUkspeech() {
                return ukspeech;
            }

            public void setUkspeech(String ukspeech) {
                this.ukspeech = ukspeech;
            }

            public String getUsphone() {
                return usphone;
            }

            public void setUsphone(String usphone) {
                this.usphone = usphone;
            }

            public String getUsspeech() {
                return usspeech;
            }

            public void setUsspeech(String usspeech) {
                this.usspeech = usspeech;
            }
        }
    }

    public static class SpecialBean {
        /**
         * co-add : http://www.inoteexpress.com
         * entries : [{"entry":{"major":"经济学","num":4,"trs":[{"tr":{"chnSent":"2006年,美国经常<b>账户<\/b>的逆差占GDP的6.2%,这是史无前例的。","cite":"688","docTitle":"论美国经常账户逆差的成因及不可持续性 （研究生论文）","engSent":"In 2006, the US current <b>account<\/b> deficit amounts to unprecedented 6.2% of its GDP.","nat":"账户","url":"http://www.591-lw.com/article.php?r_id=148017"}},{"tr":{"chnSent":"近几年来,随着江汉油田快速发展,经济规模不断扩大,<b>应收账款<\/b>逐年增多。","cite":"169","docTitle":"浅议应收账款管理 ","engSent":"in recent years,Jianghan Oilfield has made a rapid headway and constantly expanded its economic scale. Its <b>account<\/b> receivable,however,is growing year after year.","nat":"应收账款","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CJFQ&dbname=CJFDLAST2010&filename=jszd201001025"}},{"tr":{"chnSent":"而目前这些巨大的森林环境服务效益在国民<b>经济核算<\/b>中未予考虑,需要采取适当的措施将这些外部效益内部化。","cite":"19","docTitle":"北京山区森林资源价值评价 ","engSent":"However, the benefit of these environmental services is not considered in the system of national economic <b>account<\/b>. The appropriated measures should be taken to internalize these external benefits.","nat":"经济核算","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CDFD&dbname=CDFD2005&filename=2005085003.nh"}},{"tr":{"cite":"0","nat":"帐户"}}]}},{"entry":{"major":"计算机科学技术","num":6,"trs":[{"tr":{"chnSent":"构建了基于远程访问拨号接入用户服务（RADIUS）的认证、授权和<b>计费<\/b>系统。","cite":"157","docTitle":"期刊学术社区","engSent":"A remote access dial in user service(RADIUS) authentication,authorization and <b>account<\/b> system is constructed.","nat":"计费","url":"http://www.magsci.org/SearchArticle?flag=showaticle&id=6975451"}},{"tr":{"chnSent":"宽带接入过程中容易出现<b>账号<\/b>密码被盗用的现象，因而需要使用接入认证技术。","cite":"39","docTitle":"宽带接入中的认证技术分析\u2014《电脑知识与技术》\u20142007年第18期\u2014龙源期刊网","engSent":"s：It is apt to present the phenomenon that the <b>account<\/b> number password is usurped in the course of broadband access, therefore need to use and inserting authentication technology.","nat":"账号","url":"http://cn.qikan.com/Article/zsjs/zsjs200718/zsjs20071833.html"}},{"tr":{"cite":"0","nat":"帐户"}},{"tr":{"cite":"0","nat":"科目"}},{"tr":{"cite":"0","nat":"会计"}},{"tr":{"cite":"0","nat":"帐款"}}]}},{"entry":{"major":"体育","num":1,"trs":[{"tr":{"cite":"0","nat":"(在比赛中)击败；击出场(for)"}}]}},{"entry":{"major":"数学","num":1,"trs":[{"tr":{"cite":"6","docTitle":"\u201c5+3\u201d工程项目管理模式 ","nat":"计算","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CMFD&dbname=CMFD2009&filename=2008186124.nh"}}]}},{"entry":{"major":"交通运输工程","num":1,"trs":[{"tr":{"cite":"0","nat":"帐目"}}]}}]
         * summary : {"sources":{"source":{"site":"NoteExpress","url":"http://www.inoteexpress.com"}},"text":"以上统计来源于2,447,534篇论文数据，部分数据来源于"}
         * total : 2,447,543
         */

        @SerializedName("co-add")
        private String coadd;
        private SummaryBean summary;
        private String total;
        private List<EntriesBeanX> entries;

        public String getCoadd() {
            return coadd;
        }

        public void setCoadd(String coadd) {
            this.coadd = coadd;
        }

        public SummaryBean getSummary() {
            return summary;
        }

        public void setSummary(SummaryBean summary) {
            this.summary = summary;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public List<EntriesBeanX> getEntries() {
            return entries;
        }

        public void setEntries(List<EntriesBeanX> entries) {
            this.entries = entries;
        }

        public static class SummaryBean {
            /**
             * sources : {"source":{"site":"NoteExpress","url":"http://www.inoteexpress.com"}}
             * text : 以上统计来源于2,447,534篇论文数据，部分数据来源于
             */

            private SourcesBean sources;
            private String text;

            public SourcesBean getSources() {
                return sources;
            }

            public void setSources(SourcesBean sources) {
                this.sources = sources;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public static class SourcesBean {
                /**
                 * source : {"site":"NoteExpress","url":"http://www.inoteexpress.com"}
                 */

                private SourceBeanXXX source;

                public SourceBeanXXX getSource() {
                    return source;
                }

                public void setSource(SourceBeanXXX source) {
                    this.source = source;
                }

                public static class SourceBeanXXX {
                    /**
                     * site : NoteExpress
                     * url : http://www.inoteexpress.com
                     */

                    private String site;
                    private String url;

                    public String getSite() {
                        return site;
                    }

                    public void setSite(String site) {
                        this.site = site;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }
                }
            }
        }

        public static class EntriesBeanX {
            /**
             * entry : {"major":"经济学","num":4,"trs":[{"tr":{"chnSent":"2006年,美国经常<b>账户<\/b>的逆差占GDP的6.2%,这是史无前例的。","cite":"688","docTitle":"论美国经常账户逆差的成因及不可持续性 （研究生论文）","engSent":"In 2006, the US current <b>account<\/b> deficit amounts to unprecedented 6.2% of its GDP.","nat":"账户","url":"http://www.591-lw.com/article.php?r_id=148017"}},{"tr":{"chnSent":"近几年来,随着江汉油田快速发展,经济规模不断扩大,<b>应收账款<\/b>逐年增多。","cite":"169","docTitle":"浅议应收账款管理 ","engSent":"in recent years,Jianghan Oilfield has made a rapid headway and constantly expanded its economic scale. Its <b>account<\/b> receivable,however,is growing year after year.","nat":"应收账款","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CJFQ&dbname=CJFDLAST2010&filename=jszd201001025"}},{"tr":{"chnSent":"而目前这些巨大的森林环境服务效益在国民<b>经济核算<\/b>中未予考虑,需要采取适当的措施将这些外部效益内部化。","cite":"19","docTitle":"北京山区森林资源价值评价 ","engSent":"However, the benefit of these environmental services is not considered in the system of national economic <b>account<\/b>. The appropriated measures should be taken to internalize these external benefits.","nat":"经济核算","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CDFD&dbname=CDFD2005&filename=2005085003.nh"}},{"tr":{"cite":"0","nat":"帐户"}}]}
             */

            private EntryBeanXX entry;

            public EntryBeanXX getEntry() {
                return entry;
            }

            public void setEntry(EntryBeanXX entry) {
                this.entry = entry;
            }

            public static class EntryBeanXX {
                /**
                 * major : 经济学
                 * num : 4
                 * trs : [{"tr":{"chnSent":"2006年,美国经常<b>账户<\/b>的逆差占GDP的6.2%,这是史无前例的。","cite":"688","docTitle":"论美国经常账户逆差的成因及不可持续性 （研究生论文）","engSent":"In 2006, the US current <b>account<\/b> deficit amounts to unprecedented 6.2% of its GDP.","nat":"账户","url":"http://www.591-lw.com/article.php?r_id=148017"}},{"tr":{"chnSent":"近几年来,随着江汉油田快速发展,经济规模不断扩大,<b>应收账款<\/b>逐年增多。","cite":"169","docTitle":"浅议应收账款管理 ","engSent":"in recent years,Jianghan Oilfield has made a rapid headway and constantly expanded its economic scale. Its <b>account<\/b> receivable,however,is growing year after year.","nat":"应收账款","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CJFQ&dbname=CJFDLAST2010&filename=jszd201001025"}},{"tr":{"chnSent":"而目前这些巨大的森林环境服务效益在国民<b>经济核算<\/b>中未予考虑,需要采取适当的措施将这些外部效益内部化。","cite":"19","docTitle":"北京山区森林资源价值评价 ","engSent":"However, the benefit of these environmental services is not considered in the system of national economic <b>account<\/b>. The appropriated measures should be taken to internalize these external benefits.","nat":"经济核算","url":"http://www.cnki.net/kcms/detail/detailall.aspx?dbcode=CDFD&dbname=CDFD2005&filename=2005085003.nh"}},{"tr":{"cite":"0","nat":"帐户"}}]
                 */

                private String major;
                private int num;
                private List<TrsBeanXXXX> trs;

                public String getMajor() {
                    return major;
                }

                public void setMajor(String major) {
                    this.major = major;
                }

                public int getNum() {
                    return num;
                }

                public void setNum(int num) {
                    this.num = num;
                }

                public List<TrsBeanXXXX> getTrs() {
                    return trs;
                }

                public void setTrs(List<TrsBeanXXXX> trs) {
                    this.trs = trs;
                }

                public static class TrsBeanXXXX {
                    /**
                     * tr : {"chnSent":"2006年,美国经常<b>账户<\/b>的逆差占GDP的6.2%,这是史无前例的。","cite":"688","docTitle":"论美国经常账户逆差的成因及不可持续性 （研究生论文）","engSent":"In 2006, the US current <b>account<\/b> deficit amounts to unprecedented 6.2% of its GDP.","nat":"账户","url":"http://www.591-lw.com/article.php?r_id=148017"}
                     */

                    private TrBeanXXXXX tr;

                    public TrBeanXXXXX getTr() {
                        return tr;
                    }

                    public void setTr(TrBeanXXXXX tr) {
                        this.tr = tr;
                    }

                    public static class TrBeanXXXXX {
                        /**
                         * chnSent : 2006年,美国经常<b>账户</b>的逆差占GDP的6.2%,这是史无前例的。
                         * cite : 688
                         * docTitle : 论美国经常账户逆差的成因及不可持续性 （研究生论文）
                         * engSent : In 2006, the US current <b>account</b> deficit amounts to unprecedented 6.2% of its GDP.
                         * nat : 账户
                         * url : http://www.591-lw.com/article.php?r_id=148017
                         */

                        private String chnSent;
                        private String cite;
                        private String docTitle;
                        private String engSent;
                        private String nat;
                        private String url;

                        public String getChnSent() {
                            return chnSent;
                        }

                        public void setChnSent(String chnSent) {
                            this.chnSent = chnSent;
                        }

                        public String getCite() {
                            return cite;
                        }

                        public void setCite(String cite) {
                            this.cite = cite;
                        }

                        public String getDocTitle() {
                            return docTitle;
                        }

                        public void setDocTitle(String docTitle) {
                            this.docTitle = docTitle;
                        }

                        public String getEngSent() {
                            return engSent;
                        }

                        public void setEngSent(String engSent) {
                            this.engSent = engSent;
                        }

                        public String getNat() {
                            return nat;
                        }

                        public void setNat(String nat) {
                            this.nat = nat;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }
                }
            }
        }
    }

    public static class SplongmanBean {
        /**
         * isGood : true
         * wordList : [{"Entry":{"Head":[{"FREQ":["S1","W1"],"GRAM":["C"],"HOMNUM":["1"],"HWD":["account"],"HYPHENATION":["ac\u2027count"],"POS":["n"],"PronCodes":[{"PRON":["əˈkaʊnt"],"PRONKK":["əˋka u nt"]}],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}],"Sense":[{"DEF":["a written or spoken description that says what happens in an event or process"],"EXAMPLE":["Chomsky\u2019s account of how children learn their first language"],"EXAMPLETRAN":["乔姆斯基关于儿童如何学习第一语言的描述"],"SIGNPOST":["description"],"SIGNTRAN":["描述"],"TRAN":["叙述，描写，报道"]},{"DEF":["an arrangement in which a bank keeps your money safe so that you can pay more in or take money out"],"EXAMPLE":["My salary is paid into my bank account.","I\u2019ve <i>opened an account<\/i> with Barclay\u2019s Bank.","My husband and I have a <i>joint account<\/i> (= <em> one that is shared between two people <\/em> ) ."],"EXAMPLETRAN":["我的工资直接存入我的银行账户。","我在巴克莱银行开了一个账户。","我和丈夫有个联名账户。"],"SIGNPOST":["at a bank"],"SIGNTRAN":["在银行"],"TRAN":["账户"],"Variant":[{"ABBR":["a/c","acct."],"LINKWORD":["written abbreviation <i>书面缩写为<\/i>","or"]}]},{"DEF":["to consider or include particular facts or details when making a decision or judgment about something"],"EXAMPLE":["These figures do not take account of changes in the rate of inflation."],"EXAMPLETRAN":["这些数字没有把通货膨胀率的变化考虑进去。"],"LEXUNIT":["take account of sth"],"TRAN":["考虑到某事，把某事考虑进去"],"Variant":[{"LEXVAR":["take sth into account"],"LINKWORD":["also <i>又作<\/i>"]}]}]}},{"Entry":{"Head":[{"FREQ":["S3","W2"],"HOMNUM":["2"],"HWD":["account"],"HYPHENATION":["account"],"POS":["v"],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}]}}]
         */

        private String isGood;
        private List<WordListBeanX> wordList;

        public String getIsGood() {
            return isGood;
        }

        public void setIsGood(String isGood) {
            this.isGood = isGood;
        }

        public List<WordListBeanX> getWordList() {
            return wordList;
        }

        public void setWordList(List<WordListBeanX> wordList) {
            this.wordList = wordList;
        }

        public static class WordListBeanX {
            /**
             * Entry : {"Head":[{"FREQ":["S1","W1"],"GRAM":["C"],"HOMNUM":["1"],"HWD":["account"],"HYPHENATION":["ac\u2027count"],"POS":["n"],"PronCodes":[{"PRON":["əˈkaʊnt"],"PRONKK":["əˋka u nt"]}],"VIDEOCAL":["http://ydschool-online.nos.netease.com/account_v0205.mp3"]}],"Sense":[{"DEF":["a written or spoken description that says what happens in an event or process"],"EXAMPLE":["Chomsky\u2019s account of how children learn their first language"],"EXAMPLETRAN":["乔姆斯基关于儿童如何学习第一语言的描述"],"SIGNPOST":["description"],"SIGNTRAN":["描述"],"TRAN":["叙述，描写，报道"],"Variant":[{"ABBR":["a/c","acct."],"LINKWORD":["written abbreviation <i>书面缩写为<\/i>","or"]}],"LEXUNIT":["take account of sth"]},{"DEF":["an arrangement in which a bank keeps your money safe so that you can pay more in or take money out"],"EXAMPLE":["My salary is paid into my bank account.","I\u2019ve <i>opened an account<\/i> with Barclay\u2019s Bank.","My husband and I have a <i>joint account<\/i> (= <em> one that is shared between two people <\/em> ) ."],"EXAMPLETRAN":["我的工资直接存入我的银行账户。","我在巴克莱银行开了一个账户。","我和丈夫有个联名账户。"],"SIGNPOST":["at a bank"],"SIGNTRAN":["在银行"],"TRAN":["账户"],"Variant":[{"ABBR":["a/c","acct."],"LINKWORD":["written abbreviation <i>书面缩写为<\/i>","or"]}]},{"DEF":["to consider or include particular facts or details when making a decision or judgment about something"],"EXAMPLE":["These figures do not take account of changes in the rate of inflation."],"EXAMPLETRAN":["这些数字没有把通货膨胀率的变化考虑进去。"],"LEXUNIT":["take account of sth"],"TRAN":["考虑到某事，把某事考虑进去"],"Variant":[{"LEXVAR":["take sth into account"],"LINKWORD":["also <i>又作<\/i>"]}]}]}
             */

            private EntryBeanXXX Entry;

            public EntryBeanXXX getEntry() {
                return Entry;
            }

            public void setEntry(EntryBeanXXX Entry) {
                this.Entry = Entry;
            }

            public static class EntryBeanXXX {
                private List<HeadBeanX> Head;
                private List<SenseBeanX> Sense;

                public List<HeadBeanX> getHead() {
                    return Head;
                }

                public void setHead(List<HeadBeanX> Head) {
                    this.Head = Head;
                }

                public List<SenseBeanX> getSense() {
                    return Sense;
                }

                public void setSense(List<SenseBeanX> Sense) {
                    this.Sense = Sense;
                }

                public static class HeadBeanX {
                    private List<String> FREQ;
                    private List<String> GRAM;
                    private List<String> HOMNUM;
                    private List<String> HWD;
                    private List<String> HYPHENATION;
                    private List<String> POS;
                    private List<PronCodesBeanX> PronCodes;
                    private List<String> VIDEOCAL;

                    public List<String> getFREQ() {
                        return FREQ;
                    }

                    public void setFREQ(List<String> FREQ) {
                        this.FREQ = FREQ;
                    }

                    public List<String> getGRAM() {
                        return GRAM;
                    }

                    public void setGRAM(List<String> GRAM) {
                        this.GRAM = GRAM;
                    }

                    public List<String> getHOMNUM() {
                        return HOMNUM;
                    }

                    public void setHOMNUM(List<String> HOMNUM) {
                        this.HOMNUM = HOMNUM;
                    }

                    public List<String> getHWD() {
                        return HWD;
                    }

                    public void setHWD(List<String> HWD) {
                        this.HWD = HWD;
                    }

                    public List<String> getHYPHENATION() {
                        return HYPHENATION;
                    }

                    public void setHYPHENATION(List<String> HYPHENATION) {
                        this.HYPHENATION = HYPHENATION;
                    }

                    public List<String> getPOS() {
                        return POS;
                    }

                    public void setPOS(List<String> POS) {
                        this.POS = POS;
                    }

                    public List<PronCodesBeanX> getPronCodes() {
                        return PronCodes;
                    }

                    public void setPronCodes(List<PronCodesBeanX> PronCodes) {
                        this.PronCodes = PronCodes;
                    }

                    public List<String> getVIDEOCAL() {
                        return VIDEOCAL;
                    }

                    public void setVIDEOCAL(List<String> VIDEOCAL) {
                        this.VIDEOCAL = VIDEOCAL;
                    }

                    public static class PronCodesBeanX {
                        private List<String> PRON;
                        private List<String> PRONKK;

                        public List<String> getPRON() {
                            return PRON;
                        }

                        public void setPRON(List<String> PRON) {
                            this.PRON = PRON;
                        }

                        public List<String> getPRONKK() {
                            return PRONKK;
                        }

                        public void setPRONKK(List<String> PRONKK) {
                            this.PRONKK = PRONKK;
                        }
                    }
                }

                public static class SenseBeanX {
                    private List<String> DEF;
                    private List<String> EXAMPLE;
                    private List<String> EXAMPLETRAN;
                    private List<String> SIGNPOST;
                    private List<String> SIGNTRAN;
                    private List<String> TRAN;
                    private List<VariantBeanX> Variant;
                    private List<String> LEXUNIT;

                    public List<String> getDEF() {
                        return DEF;
                    }

                    public void setDEF(List<String> DEF) {
                        this.DEF = DEF;
                    }

                    public List<String> getEXAMPLE() {
                        return EXAMPLE;
                    }

                    public void setEXAMPLE(List<String> EXAMPLE) {
                        this.EXAMPLE = EXAMPLE;
                    }

                    public List<String> getEXAMPLETRAN() {
                        return EXAMPLETRAN;
                    }

                    public void setEXAMPLETRAN(List<String> EXAMPLETRAN) {
                        this.EXAMPLETRAN = EXAMPLETRAN;
                    }

                    public List<String> getSIGNPOST() {
                        return SIGNPOST;
                    }

                    public void setSIGNPOST(List<String> SIGNPOST) {
                        this.SIGNPOST = SIGNPOST;
                    }

                    public List<String> getSIGNTRAN() {
                        return SIGNTRAN;
                    }

                    public void setSIGNTRAN(List<String> SIGNTRAN) {
                        this.SIGNTRAN = SIGNTRAN;
                    }

                    public List<String> getTRAN() {
                        return TRAN;
                    }

                    public void setTRAN(List<String> TRAN) {
                        this.TRAN = TRAN;
                    }

                    public List<VariantBeanX> getVariant() {
                        return Variant;
                    }

                    public void setVariant(List<VariantBeanX> Variant) {
                        this.Variant = Variant;
                    }

                    public List<String> getLEXUNIT() {
                        return LEXUNIT;
                    }

                    public void setLEXUNIT(List<String> LEXUNIT) {
                        this.LEXUNIT = LEXUNIT;
                    }

                    public static class VariantBeanX {
                        private List<String> ABBR;
                        private List<String> LINKWORD;

                        public List<String> getABBR() {
                            return ABBR;
                        }

                        public void setABBR(List<String> ABBR) {
                            this.ABBR = ABBR;
                        }

                        public List<String> getLINKWORD() {
                            return LINKWORD;
                        }

                        public void setLINKWORD(List<String> LINKWORD) {
                            this.LINKWORD = LINKWORD;
                        }
                    }
                }
            }
        }
    }

    public static class SynoBeanX {
        /**
         * synos : [{"syno":{"pos":"n.","tran":"[会计]帐户；解释；帐目，帐单；理由","ws":[{"w":"interpretation"},{"w":"explanation"},{"w":"construction"},{"w":"sake"},{"w":"reason"}]}},{"syno":{"pos":"vi.","tran":"解释；导致；报帐","ws":[{"w":"result in"},{"w":"to interpret"}]}},{"syno":{"pos":"vt.","tran":"认为；把\u2026视为","ws":[{"w":"count"},{"w":"find"},{"w":"guess"},{"w":"feel"},{"w":"rate"}]}}]
         * word : account
         */

        private String word;
        private List<SynosBean> synos;

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public List<SynosBean> getSynos() {
            return synos;
        }

        public void setSynos(List<SynosBean> synos) {
            this.synos = synos;
        }

        public static class SynosBean {
            /**
             * syno : {"pos":"n.","tran":"[会计]帐户；解释；帐目，帐单；理由","ws":[{"w":"interpretation"},{"w":"explanation"},{"w":"construction"},{"w":"sake"},{"w":"reason"}]}
             */

            private SynoBean syno;

            public SynoBean getSyno() {
                return syno;
            }

            public void setSyno(SynoBean syno) {
                this.syno = syno;
            }

            public static class SynoBean {
                /**
                 * pos : n.
                 * tran : [会计]帐户；解释；帐目，帐单；理由
                 * ws : [{"w":"interpretation"},{"w":"explanation"},{"w":"construction"},{"w":"sake"},{"w":"reason"}]
                 */

                private String pos;
                private String tran;
                private List<WsBean> ws;

                public String getPos() {
                    return pos;
                }

                public void setPos(String pos) {
                    this.pos = pos;
                }

                public String getTran() {
                    return tran;
                }

                public void setTran(String tran) {
                    this.tran = tran;
                }

                public List<WsBean> getWs() {
                    return ws;
                }

                public void setWs(List<WsBean> ws) {
                    this.ws = ws;
                }

                public static class WsBean {
                    /**
                     * w : interpretation
                     */

                    private String w;

                    public String getW() {
                        return w;
                    }

                    public void setW(String w) {
                        this.w = w;
                    }
                }
            }
        }
    }

    public static class UgcBean {
        /**
         * data : {"content":"在广告行业中，account也是一种职能分工，意为客户部，负责与客户对接的工种","num":10,"userName":"爱丽狮"}
         * success : true
         */

        private DataBean data;
        private boolean success;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public static class DataBean {
            /**
             * content : 在广告行业中，account也是一种职能分工，意为客户部，负责与客户对接的工种
             * num : 10
             * userName : 爱丽狮
             */

            private String content;
            private int num;
            private String userName;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }

            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }
        }
    }

    public static class WebTransBean {
        @SerializedName("web-translation")
        private List<WebtranslationBean> webtranslation;

        public List<WebtranslationBean> getWebtranslation() {
            return webtranslation;
        }

        public void setWebtranslation(List<WebtranslationBean> webtranslation) {
            this.webtranslation = webtranslation;
        }

        public static class WebtranslationBean {
            @SerializedName("@same")
            private String _$Same246; // FIXME check this code
            private String key;
            @SerializedName("key-speech")
            private String keyspeech;
            private List<TransBean> trans;

            public String get_$Same246() {
                return _$Same246;
            }

            public void set_$Same246(String _$Same246) {
                this._$Same246 = _$Same246;
            }

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public String getKeyspeech() {
                return keyspeech;
            }

            public void setKeyspeech(String keyspeech) {
                this.keyspeech = keyspeech;
            }

            public List<TransBean> getTrans() {
                return trans;
            }

            public void setTrans(List<TransBean> trans) {
                this.trans = trans;
            }

            public static class TransBean {
                /**
                 * summary : {"line":["...现金日记帐总分记帐分类帐明细分类帐试算表帐户调整工作底稿资产负债表利润表现金流量表会计报表报表附注(分录。1、<b>账户<\/b>(<b>account<\/b>)和会计科目（<b>account<\/b> title）（2）<b>账户<\/b>基本结构第二章会计循环（一）：分录、记账与调整二、<b>账户<\/b>和复式记账."]}
                 * support : 900
                 * url :
                 * value : 账户
                 * cls : {"cl":["会计"]}
                 */

                private SummaryBeanX summary;
                private int support;
                private String url;
                private String value;
                private ClsBean cls;

                public SummaryBeanX getSummary() {
                    return summary;
                }

                public void setSummary(SummaryBeanX summary) {
                    this.summary = summary;
                }

                public int getSupport() {
                    return support;
                }

                public void setSupport(int support) {
                    this.support = support;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public ClsBean getCls() {
                    return cls;
                }

                public void setCls(ClsBean cls) {
                    this.cls = cls;
                }

                public static class SummaryBeanX {
                    private List<String> line;

                    public List<String> getLine() {
                        return line;
                    }

                    public void setLine(List<String> line) {
                        this.line = line;
                    }
                }

                public static class ClsBean {
                    private List<String> cl;

                    public List<String> getCl() {
                        return cl;
                    }

                    public void setCl(List<String> cl) {
                        this.cl = cl;
                    }
                }
            }
        }
    }

    public static class WebsterBean {
        /**
         * encryptedData : VcKA3WTZEeIeiUjhssApF-Rw8is5r7T_8GW9fsFlNzo8-bWtmAC_OKhiQed5gVHcngAldduVR-6c4THgZnh5rVwJtM4RHPewiAuvihBSWptG_-Kl-41k6vkiEnukWIq3Le90K4Kq3h_E8p34siY5ZyZvANBIp8myJtmPga7ZOTVR_JnvbNlNmbmFPVvHd2Px_hUE52T0zfAsGXmBRn6ru73Jd6pfzShEPRYsVdGhtxwPlo2aBIc0kG2pS-n0w99Ttyx-yayHjEWJJShrhmAOALiRrVSWCYIwndGwzU3WJy1vSIfsIBHmg5Ey27LolGRFJ4GFtvUZRQFEE0LLs1n0ke_dIYBBAof99RwcTf5anbouhYSOUZoA3x-gFim0JfHjTV7JbtzPYECFAe0ccDBluJdRAKiHM8io65LHCZZrvggycn-re_MWp93bIfMPPZrraYQbnCCMaZQKrqA34u-D2Hh8HwUYsRtTPwooAvOSvYY_Ek3jx19pOAH3Yk8yRRHZjX0D8R5ArPh-TZ1qDeh4aHxqIeAlzslfDMcmIsuw5UqfZya6HzNLT_R5KuwgixCHmucfZ70qd564SmRHtuL3_qiZXCmLSw6rJpBcud_bV2elsO4e8gyjAxH9rL5Y-IL_e_meMvz0SVuZ3hdeM71UgQyNJuvNZ9PuprT0OLeAjbpqMjPhS6se-kJ0hQmjydXErnFBxzX-SqKkKrRSkIivBjX4_au8CjUeY2fib45yGsGhzjcr9R-IvIzXUAY02xrxNbIxbqx8Zkfljz4zu6CHU1Wb7hE9x9rXmNZ0o_llwh2HgA5tC8GqYBym-oB6OKKfT3hPdZ4Uvlnx02R2hD-ALeoPBgxjSK4SQFWUk-2FvgHQ7-1BG7QvUl2x9JIgjsPQXnaq0j7pqIFsJYRGgFcxYEFehUEQri_Cq3zMXAT5nK8UGo3sHq_zWCTlRhtkYaxzCXMeTs4zSYz3HFCNDtNBWUbca0aEwwOQMFpG2dT6tDYOsH4uFbi1feP9jBG8xrccGZ6pGfjgXcFm_pPow4RouYlb64GxxDeu4dzDyNrl4nTXQHd63OQ4VkizzX_iOKwis7DeeBHvXAVJpZSgEJcR2TZaEteA6tE4LJQva-3Rhc3EnT9mMYuVFEvV0anPVeltArxwUDxz0ktBEmpMG_-XU8VoubM4T4xpLGUDJe97JioDzgryvaT9TF7bmLBHCELmTC--JhVTsKhtiSQNpKOtEFEjKSBTZwju2Fk5xiZ9OL6y2bHO2n9BgKxIR-jauJHv7wqJoVOuY5-nOUk2nOvnBjDUqwds4EoBsj5ZRZsPZ8YZcfSbQ_szS6F7ApP5T2nY-vwDClr3LrZbTHJgRca_Kz1iFGHXwJ1hU0ERvZftx206eYkJowvjOmt8ckjuN8HgXEheD3kcuvWb3Aa0tAxPkfu0HAPAOcQDSq6ZQ4oYKFxXbBncKwoKd84lHEtkstLBT5OAfEsWVZCvNzen_BOi7CbDQV3yEojlL8ySwRPjjovyR23paciFvPMFcQsdkWjM0sSBMRthmR_6ozIyKNe8oBYA2YMUHjJdAhakrrWPa1EP7nl1F92ulvLZhe-n7SJpDewginOPu0zuwLqkG2H4b6UGKCfAGIM2lotZ--_cgHL_QCvJg3IuyKfrcwhAplhSvRXvWUhATI4VOiidkPEQdtZ_zlL4LE13skmhx4oO3x8uWC7Xj1eo-h4PJ1AsEtM1-lTq7uU2zWnNmrHjACl3jdoj5-UZcqekBMc3SFjFze2ov3g2oyloJKgBOh-Oeig3Z5ADIVrYOU2LJhvxdR4eo26YfbjsKrEJo7mdXtuSn5u323VSupB-r2tzdFdPVOJHcrtreHArd66054kwn5fLNhk05fSJEXKVB9gsM6iNxg320Cc2A7OV3MtU84fTQI_yH0X3DuSvzcmm_FdXZ3XFyYt0Tomnns3CI_JW3Tk5819u9dcKa81iHo4Alj0c-3nsp7XK14rL0tGBYukBW-muGgIw0QucChhhMjtcorECyTPYKiFkNi0cXtbtXtjqPknFm0PjKDm5G_BNOFBzW0e4muXDstJPTBj85J7wuQyj3o8JshV_1l32vsEeEZ_mESkKuVLZqPhF0H-ljtEKNdbg1NRW0O7tHenUv3zaiILIGt8jgnFJUsHYB1LomqTlb64Ai8ZQIoZP3RMb04D3L4rprTcAanqYi6S7kVn1-kgmPJ2EWuWzVDABBwBkt2nk6JqAAK0uI56ncI8bHblF5u_ZkPigPYVhiTuMpPLaZOYeRQPjREDDkNHUzoemfbeqc-uSJMN-lvC6MAcRkhgbtCRJqNlKqZKE6XJhXtnvKlutjCxK4Wf5zMMdEzh8gEVjZiK_k47ExQSlrh9EF8WcGtYtI-1mZqiHC_gQZkTEzqFK39C5vmuj4B6WvfKXOIsUIVlt1CBlb10SM7pVUHF4wfXJ0IPgT-XiYXZNUAT3akSP7MW5-0x2BTl-YNm9wbihFv4TbuavT7bODrb_5G5J3uR8alYoAel8h9PeYLam8jGA3uTef5MCzpnPKmb21Cm0JHIw5aJkw0SraDEzqhFPkp2HtOpOjSYf9xviE7iRUoEKjs6eHJwPA6HFIWvgmTjxBQG1bZ6uKT0ej6V0l2ZxxSiO4Hw9ZkzcmcpZzTuDGbBRQNyxIL1gF3LvGfr7M8MwZQeqbhXZ8qc-YGxivs0C15auvup2B4eBNVZUrj9YqHX9iNJ08HjuniDnGpCaRK_3hwzffzo5Wv9xkGJs-gjtY_mEIz2GqzqkR7BX7AW9U3KCtWwJzNjJJ00df0D6QOuhjqtBH49Vz5zIP1066RtsUNOVYnnlThoLIV_ChyIy-qIUR5Mh8Y18I05YRegchSIivJQXpmcgjoRK1pS8n8hjz85Hn8Z5GalSrZ9GU5bvjNFAgfz1xAy9W9wbfOPYPiT6GEoz2iKvEWk27XwCzNEiftZ7fytKzofIfmL4CpvKETomls0rYpcLOoY8R3dKXfEag-YjZgCrKfXisBzhObrbBglAE8Ud6vCHdmiqjS4gbtCMfa4B5UfDJo5mRiaja0uPpmUVUPxQyB_3Z195wdGaSxhnQ3zfxbJVb_ER7KcwmLf1hE_GyuZ1cN5sfsgkMUc1ZwjklUSsO1HPpExhedUZ6dEUwcZBKPGqSLID8_DiXLqREUPkLO-eLWOtttGx27cQNzC5B4vk37i-EY-pA8hxv5a72bhN4g4j87GNFCPNY74OpRl2MLO2cAj8MSrfwB6cKffwlX5U4t_Ys-OfQTVv9SsaDgu61pNBA-wwLl2P1fxzGcnl4u6nQgZ6cszpsky24K82xUKRJ0PaWjt-OxtyhbNadDr5NeKcy1yF-K4-TTI8Q5L96_yFtbvljCZSPfqJABpli2xNWRbiEywhJgbfoduMoc5rM8igHJm48YqQCJqGPagjj6L6sdpoJxcH2MQfkMLzYYv0fEpmoIuyQnochf7sLUeg5GlZQVmuqZZykZOnKn1NcTO4C0grsdPgPgnVsHj_Sr1rvTJ_LmLJD_9fBitwe6CE3UVJJS1M0_PMUcjyzmOz-IclayomOifxNAH9X4Ry4ChwoYBHu0sgBXeH0g6v7fZn2MYSRIrAwv_ijN68RNz3bOJLvR3QjHl3FKEwuN8wwFxQAu2IHAOPhFEMy9Ah1BG1FbkyVrJGAPnXnZTfWVYaTFechX1Q15z1KvLPbv1u_439dGFq6ez1M_Zt3FiIIo4X_nxmGnvfUXKUmRcyCW8q6JrI5NAJNknJOeUER38P_X1EsyEgUmMEoxKSmZYQlKkdbzwLatEHtD9VfUzb3SOR4TBMO1k0PXFg4BeRD71YCVy4UbNMTTXJmbrxJVPPZRbW7msgqWCfyru8CMCYKWhg8oRDzgGtAh13HFu08H_-HKi4mbCeykBVQlS3pKL7P5cAbtGTf4WSvoXWYMSeUuDWyiOO5UVJIvW4cU_My3w__aPH3A2r_q1GfFvk7_izbHZMxomDliq-wMXulbfKAHMVibJs1ZNvQx52gq_AKi5adn0vbLlTDswsgLEnhgH2xJdMBgDEporqskhTaw_9ANsxX0CpP9GojYS9H2zyD0IWI2cE_o61pE0pXmQJA8wHxXbabA0_hfoYETOZVXQaN6NFylYRYhfuCMwhOkyb7j7qxjA0EeiDuccfxlDB_YxkTNEcrRs9Wb7JcEeUcVpSZUDo1TcRGV6jngXGnbvxWbg4A9suNAJn_eaUABqXhiLe1rl8HhFUvTHUJ5qYKie4PqP4nRO_rCAaFfEWxf7CpL03gVeeBuIQJNRP8Nbin2TcqZdccmImwRVlJjz3A8N4qLqKW2YUHlCsmmAJ3iBOEM0AiOGRxRl4jCGCU6d4oGN2x31RxYTWc55iyVHpNyLIC53JMnaVMK-Zt-pl4IhS-mudmkgaeqM8D9G5g4FTpeyRl7I7nD2p-XoMa7czoUtfUx3yJOMuJnZNw80xq4Gp0KcuzgqKARB1lqG3Sday-7pSuLeX3jcBjCBQstHGRVUwFyOAOIW-WHd2W-qSeCS5rGOr2dF6ssr8cmT-bjY0MBOkCUpd6390Dou6ZAr4-0NaBFgsw3EvMfqmPSqRlB7Pj5uLFP-toRtMjRO55qNd7TNhOWKlAOWDDFejrCP5-7-XvE2Fqne6yv155KPBfdjXmrFsxU2MHKkL8AbHr4QB2Lxfwn0KYLaxOkIVZn8ua0xFQUPuKQZ1DkuYv6ChncnNg4QJzR2jck5ESYlO9KUGB4EBCFVAfSB22jJbhXkx96xw1vTk-QU3uYvgihXDc6NM8ovv0GetMbBc3_yYOHO-Z13whmWTt4oN__dtr9jDOpHfiCsgz8IbXgC1Kb87-fA0RSlORLbrQXTBW1uOXYOKL9fA7hd6JtrTRwTvAwts4aO-cA7XYhVI28USTihBh5FLtqhuUvm4ogMV4lWECqIP6SBbJx9avOZGntGQHFXS4Ueg7PBjPsZaNRb5wAN_y4kpLjAL4T6fSn7glinTH3z-9YGgwCYiyRiOqPCdIdkwPZZRxmeSfWWSA3LoN5UesS852j58mQDBhMDJ3YVM-pqN-JLpB6WNlkMSvd9N0DGdExLAovPMVv52a9XhHc6_Qn8LjgfayyuQJYhN9Bcm31JbDiNqR78lVIB1KMe0-p9SG51W87RuGSPNDAHonqtTjRE0UN2OCCM4TdNzC3fA-opHDoLxMw==
         */

        private String encryptedData;

        public String getEncryptedData() {
            return encryptedData;
        }

        public void setEncryptedData(String encryptedData) {
            this.encryptedData = encryptedData;
        }
    }

    public static class WikipediaDigestBean {
        /**
         * source : {"name":"维基百科","url":"http://en.wikipedia.org/wiki/Account"}
         * summarys : [{"key":"Account","summary":"Account may refer to:Accounts is a British term for financial statements."}]
         */

        private SourceBeanXXXX source;
        private List<SummarysBean> summarys;

        public SourceBeanXXXX getSource() {
            return source;
        }

        public void setSource(SourceBeanXXXX source) {
            this.source = source;
        }

        public List<SummarysBean> getSummarys() {
            return summarys;
        }

        public void setSummarys(List<SummarysBean> summarys) {
            this.summarys = summarys;
        }

        public static class SourceBeanXXXX {
            /**
             * name : 维基百科
             * url : http://en.wikipedia.org/wiki/Account
             */

            private String name;
            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class SummarysBean {
            /**
             * key : Account
             * summary : Account may refer to:Accounts is a British term for financial statements.
             */

            private String key;
            private String summary;

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }
        }
    }
}
