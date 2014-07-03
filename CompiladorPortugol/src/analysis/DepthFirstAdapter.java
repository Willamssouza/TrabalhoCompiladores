/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPStart().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAStart(AStart node)
    {
        defaultIn(node);
    }

    public void outAStart(AStart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStart(AStart node)
    {
        inAStart(node);
        if(node.getProgram() != null)
        {
            node.getProgram().apply(this);
        }
        outAStart(node);
    }

    public void inAProgram(AProgram node)
    {
        defaultIn(node);
    }

    public void outAProgram(AProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        inAProgram(node);
        if(node.getPrograma() != null)
        {
            node.getPrograma().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getInicio() != null)
        {
            node.getInicio().apply(this);
        }
        {
            List<PDecl> copy = new ArrayList<PDecl>(node.getDecl());
            for(PDecl e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PCommand> copy = new ArrayList<PCommand>(node.getCommand());
            for(PCommand e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getFim() != null)
        {
            node.getFim().apply(this);
        }
        outAProgram(node);
    }

    public void inAVariableDecl(AVariableDecl node)
    {
        defaultIn(node);
    }

    public void outAVariableDecl(AVariableDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariableDecl(AVariableDecl node)
    {
        inAVariableDecl(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        if(node.getDoisPontos() != null)
        {
            node.getDoisPontos().apply(this);
        }
        {
            List<PVarlist> copy = new ArrayList<PVarlist>(node.getVarlist());
            for(PVarlist e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAVariableDecl(node);
    }

    public void inAConstantDecl(AConstantDecl node)
    {
        defaultIn(node);
    }

    public void outAConstantDecl(AConstantDecl node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstantDecl(AConstantDecl node)
    {
        inAConstantDecl(node);
        if(node.getConst() != null)
        {
            node.getConst().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAConstantDecl(node);
    }

    public void inAIdVar(AIdVar node)
    {
        defaultIn(node);
    }

    public void outAIdVar(AIdVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdVar(AIdVar node)
    {
        inAIdVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdVar(node);
    }

    public void inAIdArrayVar(AIdArrayVar node)
    {
        defaultIn(node);
    }

    public void outAIdArrayVar(AIdArrayVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdArrayVar(AIdArrayVar node)
    {
        inAIdArrayVar(node);
        if(node.getIdArray() != null)
        {
            node.getIdArray().apply(this);
        }
        outAIdArrayVar(node);
    }

    public void inAVarlist(AVarlist node)
    {
        defaultIn(node);
    }

    public void outAVarlist(AVarlist node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarlist(AVarlist node)
    {
        inAVarlist(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        outAVarlist(node);
    }

    public void inAStringValor(AStringValor node)
    {
        defaultIn(node);
    }

    public void outAStringValor(AStringValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        inAStringValor(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringValor(node);
    }

    public void inAIntegerValor(AIntegerValor node)
    {
        defaultIn(node);
    }

    public void outAIntegerValor(AIntegerValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntegerValor(AIntegerValor node)
    {
        inAIntegerValor(node);
        if(node.getNInt() != null)
        {
            node.getNInt().apply(this);
        }
        outAIntegerValor(node);
    }

    public void inARealValor(ARealValor node)
    {
        defaultIn(node);
    }

    public void outARealValor(ARealValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealValor(ARealValor node)
    {
        inARealValor(node);
        if(node.getNReal() != null)
        {
            node.getNReal().apply(this);
        }
        outARealValor(node);
    }

    public void inAAttributionCommand(AAttributionCommand node)
    {
        defaultIn(node);
    }

    public void outAAttributionCommand(AAttributionCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAttributionCommand(AAttributionCommand node)
    {
        inAAttributionCommand(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getAtribuicao() != null)
        {
            node.getAtribuicao().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAAttributionCommand(node);
    }

    public void inAReadCommand(AReadCommand node)
    {
        defaultIn(node);
    }

    public void outAReadCommand(AReadCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReadCommand(AReadCommand node)
    {
        inAReadCommand(node);
        if(node.getLeia() != null)
        {
            node.getLeia().apply(this);
        }
        if(node.getParE() != null)
        {
            node.getParE().apply(this);
        }
        {
            List<PVarlist> copy = new ArrayList<PVarlist>(node.getVarlist());
            for(PVarlist e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getParD() != null)
        {
            node.getParD().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAReadCommand(node);
    }

    public void inAWriteCommand(AWriteCommand node)
    {
        defaultIn(node);
    }

    public void outAWriteCommand(AWriteCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWriteCommand(AWriteCommand node)
    {
        inAWriteCommand(node);
        if(node.getEscreva() != null)
        {
            node.getEscreva().apply(this);
        }
        if(node.getParE() != null)
        {
            node.getParE().apply(this);
        }
        {
            List<PExplist> copy = new ArrayList<PExplist>(node.getExplist());
            for(PExplist e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getParD() != null)
        {
            node.getParD().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAWriteCommand(node);
    }

    public void inAIfCommand(AIfCommand node)
    {
        defaultIn(node);
    }

    public void outAIfCommand(AIfCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfCommand(AIfCommand node)
    {
        inAIfCommand(node);
        if(node.getSe() != null)
        {
            node.getSe().apply(this);
        }
        if(node.getParE() != null)
        {
            node.getParE().apply(this);
        }
        if(node.getExpLogic() != null)
        {
            node.getExpLogic().apply(this);
        }
        if(node.getParD() != null)
        {
            node.getParD().apply(this);
        }
        if(node.getEntao() != null)
        {
            node.getEntao().apply(this);
        }
        {
            List<PCommand> copy = new ArrayList<PCommand>(node.getCommand());
            for(PCommand e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getElsepart() != null)
        {
            node.getElsepart().apply(this);
        }
        if(node.getFimSe() != null)
        {
            node.getFimSe().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAIfCommand(node);
    }

    public void inASwitchCommand(ASwitchCommand node)
    {
        defaultIn(node);
    }

    public void outASwitchCommand(ASwitchCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASwitchCommand(ASwitchCommand node)
    {
        inASwitchCommand(node);
        if(node.getAvalie() != null)
        {
            node.getAvalie().apply(this);
        }
        if(node.getParE() != null)
        {
            node.getParE().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getParD() != null)
        {
            node.getParD().apply(this);
        }
        {
            List<PCasepart> copy = new ArrayList<PCasepart>(node.getCasepart());
            for(PCasepart e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getElseswitch() != null)
        {
            node.getElseswitch().apply(this);
        }
        if(node.getFimAvalie() != null)
        {
            node.getFimAvalie().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outASwitchCommand(node);
    }

    public void inAWhileCommand(AWhileCommand node)
    {
        defaultIn(node);
    }

    public void outAWhileCommand(AWhileCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWhileCommand(AWhileCommand node)
    {
        inAWhileCommand(node);
        if(node.getEnquanto() != null)
        {
            node.getEnquanto().apply(this);
        }
        if(node.getParE() != null)
        {
            node.getParE().apply(this);
        }
        if(node.getExpLogic() != null)
        {
            node.getExpLogic().apply(this);
        }
        if(node.getParD() != null)
        {
            node.getParD().apply(this);
        }
        if(node.getFaca() != null)
        {
            node.getFaca().apply(this);
        }
        {
            List<PCommand> copy = new ArrayList<PCommand>(node.getCommand());
            for(PCommand e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getFimEnquanto() != null)
        {
            node.getFimEnquanto().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAWhileCommand(node);
    }

    public void inARepeatCommand(ARepeatCommand node)
    {
        defaultIn(node);
    }

    public void outARepeatCommand(ARepeatCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepeatCommand(ARepeatCommand node)
    {
        inARepeatCommand(node);
        if(node.getRepita() != null)
        {
            node.getRepita().apply(this);
        }
        {
            List<PCommand> copy = new ArrayList<PCommand>(node.getCommand());
            for(PCommand e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getAte() != null)
        {
            node.getAte().apply(this);
        }
        if(node.getParE() != null)
        {
            node.getParE().apply(this);
        }
        if(node.getExpLogic() != null)
        {
            node.getExpLogic().apply(this);
        }
        if(node.getParD() != null)
        {
            node.getParD().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outARepeatCommand(node);
    }

    public void inAForCommand(AForCommand node)
    {
        defaultIn(node);
    }

    public void outAForCommand(AForCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAForCommand(AForCommand node)
    {
        inAForCommand(node);
        if(node.getPara() != null)
        {
            node.getPara().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getDe() != null)
        {
            node.getDe().apply(this);
        }
        if(node.getX1() != null)
        {
            node.getX1().apply(this);
        }
        if(node.getAte() != null)
        {
            node.getAte().apply(this);
        }
        if(node.getX2() != null)
        {
            node.getX2().apply(this);
        }
        if(node.getFaca() != null)
        {
            node.getFaca().apply(this);
        }
        {
            List<PCommand> copy = new ArrayList<PCommand>(node.getCommand());
            for(PCommand e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getFimPara() != null)
        {
            node.getFimPara().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAForCommand(node);
    }

    public void inAForPassoCommand(AForPassoCommand node)
    {
        defaultIn(node);
    }

    public void outAForPassoCommand(AForPassoCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAForPassoCommand(AForPassoCommand node)
    {
        inAForPassoCommand(node);
        if(node.getPara() != null)
        {
            node.getPara().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getDe() != null)
        {
            node.getDe().apply(this);
        }
        if(node.getX1() != null)
        {
            node.getX1().apply(this);
        }
        if(node.getPasso() != null)
        {
            node.getPasso().apply(this);
        }
        if(node.getX2() != null)
        {
            node.getX2().apply(this);
        }
        if(node.getAte() != null)
        {
            node.getAte().apply(this);
        }
        if(node.getX3() != null)
        {
            node.getX3().apply(this);
        }
        if(node.getFaca() != null)
        {
            node.getFaca().apply(this);
        }
        {
            List<PCommand> copy = new ArrayList<PCommand>(node.getCommand());
            for(PCommand e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getFimPara() != null)
        {
            node.getFimPara().apply(this);
        }
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        outAForPassoCommand(node);
    }

    public void inAElsepart(AElsepart node)
    {
        defaultIn(node);
    }

    public void outAElsepart(AElsepart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElsepart(AElsepart node)
    {
        inAElsepart(node);
        if(node.getSenao() != null)
        {
            node.getSenao().apply(this);
        }
        {
            List<PCommand> copy = new ArrayList<PCommand>(node.getCommand());
            for(PCommand e : copy)
            {
                e.apply(this);
            }
        }
        outAElsepart(node);
    }

    public void inACasepart(ACasepart node)
    {
        defaultIn(node);
    }

    public void outACasepart(ACasepart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACasepart(ACasepart node)
    {
        inACasepart(node);
        if(node.getCaso() != null)
        {
            node.getCaso().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getDoisPontos() != null)
        {
            node.getDoisPontos().apply(this);
        }
        {
            List<PCommand> copy = new ArrayList<PCommand>(node.getCommand());
            for(PCommand e : copy)
            {
                e.apply(this);
            }
        }
        outACasepart(node);
    }

    public void inAElseswitch(AElseswitch node)
    {
        defaultIn(node);
    }

    public void outAElseswitch(AElseswitch node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElseswitch(AElseswitch node)
    {
        inAElseswitch(node);
        if(node.getSenao() != null)
        {
            node.getSenao().apply(this);
        }
        if(node.getDoisPontos() != null)
        {
            node.getDoisPontos().apply(this);
        }
        {
            List<PCommand> copy = new ArrayList<PCommand>(node.getCommand());
            for(PCommand e : copy)
            {
                e.apply(this);
            }
        }
        outAElseswitch(node);
    }

    public void inAExplist(AExplist node)
    {
        defaultIn(node);
    }

    public void outAExplist(AExplist node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExplist(AExplist node)
    {
        inAExplist(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        outAExplist(node);
    }

    public void inAExpression(AExpression node)
    {
        defaultIn(node);
    }

    public void outAExpression(AExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpression(AExpression node)
    {
        inAExpression(node);
        if(node.getConditionalOr() != null)
        {
            node.getConditionalOr().apply(this);
        }
        outAExpression(node);
    }

    public void inAExpLogic(AExpLogic node)
    {
        defaultIn(node);
    }

    public void outAExpLogic(AExpLogic node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLogic(AExpLogic node)
    {
        inAExpLogic(node);
        if(node.getConditionalOr() != null)
        {
            node.getConditionalOr().apply(this);
        }
        outAExpLogic(node);
    }

    public void inAOuConditionalOr(AOuConditionalOr node)
    {
        defaultIn(node);
    }

    public void outAOuConditionalOr(AOuConditionalOr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuConditionalOr(AOuConditionalOr node)
    {
        inAOuConditionalOr(node);
        if(node.getConditionalOr() != null)
        {
            node.getConditionalOr().apply(this);
        }
        if(node.getOu() != null)
        {
            node.getOu().apply(this);
        }
        if(node.getConditionalAnd() != null)
        {
            node.getConditionalAnd().apply(this);
        }
        outAOuConditionalOr(node);
    }

    public void inAEConditionalOr(AEConditionalOr node)
    {
        defaultIn(node);
    }

    public void outAEConditionalOr(AEConditionalOr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEConditionalOr(AEConditionalOr node)
    {
        inAEConditionalOr(node);
        if(node.getConditionalAnd() != null)
        {
            node.getConditionalAnd().apply(this);
        }
        outAEConditionalOr(node);
    }

    public void inAEConditionalAnd(AEConditionalAnd node)
    {
        defaultIn(node);
    }

    public void outAEConditionalAnd(AEConditionalAnd node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEConditionalAnd(AEConditionalAnd node)
    {
        inAEConditionalAnd(node);
        if(node.getConditionalAnd() != null)
        {
            node.getConditionalAnd().apply(this);
        }
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        if(node.getConditionalXor() != null)
        {
            node.getConditionalXor().apply(this);
        }
        outAEConditionalAnd(node);
    }

    public void inAXorConditionalAnd(AXorConditionalAnd node)
    {
        defaultIn(node);
    }

    public void outAXorConditionalAnd(AXorConditionalAnd node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorConditionalAnd(AXorConditionalAnd node)
    {
        inAXorConditionalAnd(node);
        if(node.getConditionalXor() != null)
        {
            node.getConditionalXor().apply(this);
        }
        outAXorConditionalAnd(node);
    }

    public void inAXorConditionalXor(AXorConditionalXor node)
    {
        defaultIn(node);
    }

    public void outAXorConditionalXor(AXorConditionalXor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorConditionalXor(AXorConditionalXor node)
    {
        inAXorConditionalXor(node);
        if(node.getConditionalXor() != null)
        {
            node.getConditionalXor().apply(this);
        }
        if(node.getXor() != null)
        {
            node.getXor().apply(this);
        }
        if(node.getExpEquality() != null)
        {
            node.getExpEquality().apply(this);
        }
        outAXorConditionalXor(node);
    }

    public void inAIgualConditionalXor(AIgualConditionalXor node)
    {
        defaultIn(node);
    }

    public void outAIgualConditionalXor(AIgualConditionalXor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualConditionalXor(AIgualConditionalXor node)
    {
        inAIgualConditionalXor(node);
        if(node.getExpEquality() != null)
        {
            node.getExpEquality().apply(this);
        }
        outAIgualConditionalXor(node);
    }

    public void inAIgualExpEquality(AIgualExpEquality node)
    {
        defaultIn(node);
    }

    public void outAIgualExpEquality(AIgualExpEquality node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualExpEquality(AIgualExpEquality node)
    {
        inAIgualExpEquality(node);
        if(node.getExpEquality() != null)
        {
            node.getExpEquality().apply(this);
        }
        if(node.getIgual() != null)
        {
            node.getIgual().apply(this);
        }
        if(node.getExpRelational() != null)
        {
            node.getExpRelational().apply(this);
        }
        outAIgualExpEquality(node);
    }

    public void inADiferenteExpEquality(ADiferenteExpEquality node)
    {
        defaultIn(node);
    }

    public void outADiferenteExpEquality(ADiferenteExpEquality node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADiferenteExpEquality(ADiferenteExpEquality node)
    {
        inADiferenteExpEquality(node);
        if(node.getExpEquality() != null)
        {
            node.getExpEquality().apply(this);
        }
        if(node.getDiferente() != null)
        {
            node.getDiferente().apply(this);
        }
        if(node.getExpRelational() != null)
        {
            node.getExpRelational().apply(this);
        }
        outADiferenteExpEquality(node);
    }

    public void inAExpressaoExpEquality(AExpressaoExpEquality node)
    {
        defaultIn(node);
    }

    public void outAExpressaoExpEquality(AExpressaoExpEquality node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressaoExpEquality(AExpressaoExpEquality node)
    {
        inAExpressaoExpEquality(node);
        if(node.getExpRelational() != null)
        {
            node.getExpRelational().apply(this);
        }
        outAExpressaoExpEquality(node);
    }

    public void inAMaiorExpRelational(AMaiorExpRelational node)
    {
        defaultIn(node);
    }

    public void outAMaiorExpRelational(AMaiorExpRelational node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorExpRelational(AMaiorExpRelational node)
    {
        inAMaiorExpRelational(node);
        if(node.getExpRelational() != null)
        {
            node.getExpRelational().apply(this);
        }
        if(node.getMaior() != null)
        {
            node.getMaior().apply(this);
        }
        if(node.getExpAdditive() != null)
        {
            node.getExpAdditive().apply(this);
        }
        outAMaiorExpRelational(node);
    }

    public void inAMenorExpRelational(AMenorExpRelational node)
    {
        defaultIn(node);
    }

    public void outAMenorExpRelational(AMenorExpRelational node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorExpRelational(AMenorExpRelational node)
    {
        inAMenorExpRelational(node);
        if(node.getExpRelational() != null)
        {
            node.getExpRelational().apply(this);
        }
        if(node.getMenor() != null)
        {
            node.getMenor().apply(this);
        }
        if(node.getExpAdditive() != null)
        {
            node.getExpAdditive().apply(this);
        }
        outAMenorExpRelational(node);
    }

    public void inAMaiorIgualExpRelational(AMaiorIgualExpRelational node)
    {
        defaultIn(node);
    }

    public void outAMaiorIgualExpRelational(AMaiorIgualExpRelational node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorIgualExpRelational(AMaiorIgualExpRelational node)
    {
        inAMaiorIgualExpRelational(node);
        if(node.getExpRelational() != null)
        {
            node.getExpRelational().apply(this);
        }
        if(node.getMaiorIgual() != null)
        {
            node.getMaiorIgual().apply(this);
        }
        if(node.getExpAdditive() != null)
        {
            node.getExpAdditive().apply(this);
        }
        outAMaiorIgualExpRelational(node);
    }

    public void inAMenorIgualExpRelational(AMenorIgualExpRelational node)
    {
        defaultIn(node);
    }

    public void outAMenorIgualExpRelational(AMenorIgualExpRelational node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorIgualExpRelational(AMenorIgualExpRelational node)
    {
        inAMenorIgualExpRelational(node);
        if(node.getExpRelational() != null)
        {
            node.getExpRelational().apply(this);
        }
        if(node.getMenorIgual() != null)
        {
            node.getMenorIgual().apply(this);
        }
        if(node.getExpAdditive() != null)
        {
            node.getExpAdditive().apply(this);
        }
        outAMenorIgualExpRelational(node);
    }

    public void inAExpressaoExpRelational(AExpressaoExpRelational node)
    {
        defaultIn(node);
    }

    public void outAExpressaoExpRelational(AExpressaoExpRelational node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressaoExpRelational(AExpressaoExpRelational node)
    {
        inAExpressaoExpRelational(node);
        if(node.getExpAdditive() != null)
        {
            node.getExpAdditive().apply(this);
        }
        outAExpressaoExpRelational(node);
    }

    public void inASomaExpAdditive(ASomaExpAdditive node)
    {
        defaultIn(node);
    }

    public void outASomaExpAdditive(ASomaExpAdditive node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomaExpAdditive(ASomaExpAdditive node)
    {
        inASomaExpAdditive(node);
        if(node.getExpAdditive() != null)
        {
            node.getExpAdditive().apply(this);
        }
        if(node.getMais() != null)
        {
            node.getMais().apply(this);
        }
        if(node.getExpMultiplicative() != null)
        {
            node.getExpMultiplicative().apply(this);
        }
        outASomaExpAdditive(node);
    }

    public void inASubtracaoExpAdditive(ASubtracaoExpAdditive node)
    {
        defaultIn(node);
    }

    public void outASubtracaoExpAdditive(ASubtracaoExpAdditive node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubtracaoExpAdditive(ASubtracaoExpAdditive node)
    {
        inASubtracaoExpAdditive(node);
        if(node.getExpAdditive() != null)
        {
            node.getExpAdditive().apply(this);
        }
        if(node.getMenos() != null)
        {
            node.getMenos().apply(this);
        }
        if(node.getExpMultiplicative() != null)
        {
            node.getExpMultiplicative().apply(this);
        }
        outASubtracaoExpAdditive(node);
    }

    public void inAMultiplicacaoExpAdditive(AMultiplicacaoExpAdditive node)
    {
        defaultIn(node);
    }

    public void outAMultiplicacaoExpAdditive(AMultiplicacaoExpAdditive node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplicacaoExpAdditive(AMultiplicacaoExpAdditive node)
    {
        inAMultiplicacaoExpAdditive(node);
        if(node.getExpMultiplicative() != null)
        {
            node.getExpMultiplicative().apply(this);
        }
        outAMultiplicacaoExpAdditive(node);
    }

    public void inAMultiplicacaoExpMultiplicative(AMultiplicacaoExpMultiplicative node)
    {
        defaultIn(node);
    }

    public void outAMultiplicacaoExpMultiplicative(AMultiplicacaoExpMultiplicative node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplicacaoExpMultiplicative(AMultiplicacaoExpMultiplicative node)
    {
        inAMultiplicacaoExpMultiplicative(node);
        if(node.getExpMultiplicative() != null)
        {
            node.getExpMultiplicative().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getExpUnary() != null)
        {
            node.getExpUnary().apply(this);
        }
        outAMultiplicacaoExpMultiplicative(node);
    }

    public void inADivisaoExpMultiplicative(ADivisaoExpMultiplicative node)
    {
        defaultIn(node);
    }

    public void outADivisaoExpMultiplicative(ADivisaoExpMultiplicative node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivisaoExpMultiplicative(ADivisaoExpMultiplicative node)
    {
        inADivisaoExpMultiplicative(node);
        if(node.getExpMultiplicative() != null)
        {
            node.getExpMultiplicative().apply(this);
        }
        if(node.getDivisao() != null)
        {
            node.getDivisao().apply(this);
        }
        if(node.getExpUnary() != null)
        {
            node.getExpUnary().apply(this);
        }
        outADivisaoExpMultiplicative(node);
    }

    public void inAUnarioExpMultiplicative(AUnarioExpMultiplicative node)
    {
        defaultIn(node);
    }

    public void outAUnarioExpMultiplicative(AUnarioExpMultiplicative node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAUnarioExpMultiplicative(AUnarioExpMultiplicative node)
    {
        inAUnarioExpMultiplicative(node);
        if(node.getExpUnary() != null)
        {
            node.getExpUnary().apply(this);
        }
        outAUnarioExpMultiplicative(node);
    }

    public void inANegativoExpUnary(ANegativoExpUnary node)
    {
        defaultIn(node);
    }

    public void outANegativoExpUnary(ANegativoExpUnary node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANegativoExpUnary(ANegativoExpUnary node)
    {
        inANegativoExpUnary(node);
        if(node.getMenos() != null)
        {
            node.getMenos().apply(this);
        }
        if(node.getExpUnary() != null)
        {
            node.getExpUnary().apply(this);
        }
        outANegativoExpUnary(node);
    }

    public void inANegacaoExpUnary(ANegacaoExpUnary node)
    {
        defaultIn(node);
    }

    public void outANegacaoExpUnary(ANegacaoExpUnary node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANegacaoExpUnary(ANegacaoExpUnary node)
    {
        inANegacaoExpUnary(node);
        if(node.getNao() != null)
        {
            node.getNao().apply(this);
        }
        if(node.getExpUnary() != null)
        {
            node.getExpUnary().apply(this);
        }
        outANegacaoExpUnary(node);
    }

    public void inAPrimarioExpUnary(APrimarioExpUnary node)
    {
        defaultIn(node);
    }

    public void outAPrimarioExpUnary(APrimarioExpUnary node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrimarioExpUnary(APrimarioExpUnary node)
    {
        inAPrimarioExpUnary(node);
        if(node.getPrimary() != null)
        {
            node.getPrimary().apply(this);
        }
        outAPrimarioExpUnary(node);
    }

    public void inAValorPrimary(AValorPrimary node)
    {
        defaultIn(node);
    }

    public void outAValorPrimary(AValorPrimary node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorPrimary(AValorPrimary node)
    {
        inAValorPrimary(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorPrimary(node);
    }

    public void inAVarPrimary(AVarPrimary node)
    {
        defaultIn(node);
    }

    public void outAVarPrimary(AVarPrimary node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarPrimary(AVarPrimary node)
    {
        inAVarPrimary(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVarPrimary(node);
    }

    public void inAParExpPrimary(AParExpPrimary node)
    {
        defaultIn(node);
    }

    public void outAParExpPrimary(AParExpPrimary node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParExpPrimary(AParExpPrimary node)
    {
        inAParExpPrimary(node);
        if(node.getParE() != null)
        {
            node.getParE().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getParD() != null)
        {
            node.getParD().apply(this);
        }
        outAParExpPrimary(node);
    }
}
