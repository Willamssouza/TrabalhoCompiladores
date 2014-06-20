/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStartStart(AStartStart node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProgramProgram(AProgramProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariableDecl(AVariableDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstantDecl(AConstantDecl node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdVar(AIdVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdArrayVar(AIdArrayVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarlist(AVarlist node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIntegerValor(AIntegerValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealValor(ARealValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAttributionCommand(AAttributionCommand node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAReadCommand(AReadCommand node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWriteCommand(AWriteCommand node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfCommand(AIfCommand node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASwitchCommand(ASwitchCommand node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAWhileCommand(AWhileCommand node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepeatCommand(ARepeatCommand node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAForCommand(AForCommand node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAForPassoCommand(AForPassoCommand node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElsepart(AElsepart node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACasepart(ACasepart node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElseswitch(AElseswitch node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpSumExp(AExpSumExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpSubExp(AExpSubExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpTermExp(AExpTermExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExplist(AExplist node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermMultTerm(ATermMultTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermDivTerm(ATermDivTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermFactorTerm(ATermFactorTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValorFactor(AValorFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarFactor(AVarFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParExpFactor(AParExpFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAOrExplogic(AOrExplogic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAXorExplogic(AXorExplogic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATermLogicExplogic(ATermLogicExplogic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAndTermlogic(AAndTermlogic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFactorLogicTermlogic(AFactorLogicTermlogic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANotFactorlogic(ANotFactorlogic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParExpFactorlogic(AParExpFactorlogic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpRelationalFactorlogic(AExpRelationalFactorlogic node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExprelational(AExprelational node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIgualOperator(AIgualOperator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADiferenteOperator(ADiferenteOperator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorOperator(AMaiorOperator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorOperator(AMenorOperator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMaiorIgualOperator(AMaiorIgualOperator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMenorIgualOperator(AMenorIgualOperator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPrograma(TPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFim(TFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscreva(TEscreva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeia(TLeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimEnquanto(TFimEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimSe(TFimSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPasso(TPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPara(TFimPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAte(TAte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFaca(TFaca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAvalie(TAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaso(TCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimAvalie(TFimAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConst(TConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTipo(TTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMais(TMais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDivisao(TDivisao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiferente(TDiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaior(TMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXor(TXor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParD(TParD node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParE(TParE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColD(TColD node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColE(TColE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdArray(TIdArray node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNInt(TNInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNReal(TNReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentLine(TCommentLine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentEnd(TCommentEnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentBody(TCommentBody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStar(TStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSlash(TSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
