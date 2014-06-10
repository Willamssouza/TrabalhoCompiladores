/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AIfCommand extends PCommand
{
    private TSe _se_;
    private TParE _parE_;
    private PExplogic _explogic_;
    private TParD _parD_;
    private TEntao _entao_;
    private final LinkedList<PCommand> _command_ = new LinkedList<PCommand>();
    private PElsepart _elsepart_;
    private TFimSe _fimSe_;
    private TSemicolon _semicolon_;

    public AIfCommand()
    {
        // Constructor
    }

    public AIfCommand(
        @SuppressWarnings("hiding") TSe _se_,
        @SuppressWarnings("hiding") TParE _parE_,
        @SuppressWarnings("hiding") PExplogic _explogic_,
        @SuppressWarnings("hiding") TParD _parD_,
        @SuppressWarnings("hiding") TEntao _entao_,
        @SuppressWarnings("hiding") List<?> _command_,
        @SuppressWarnings("hiding") PElsepart _elsepart_,
        @SuppressWarnings("hiding") TFimSe _fimSe_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setSe(_se_);

        setParE(_parE_);

        setExplogic(_explogic_);

        setParD(_parD_);

        setEntao(_entao_);

        setCommand(_command_);

        setElsepart(_elsepart_);

        setFimSe(_fimSe_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AIfCommand(
            cloneNode(this._se_),
            cloneNode(this._parE_),
            cloneNode(this._explogic_),
            cloneNode(this._parD_),
            cloneNode(this._entao_),
            cloneList(this._command_),
            cloneNode(this._elsepart_),
            cloneNode(this._fimSe_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfCommand(this);
    }

    public TSe getSe()
    {
        return this._se_;
    }

    public void setSe(TSe node)
    {
        if(this._se_ != null)
        {
            this._se_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._se_ = node;
    }

    public TParE getParE()
    {
        return this._parE_;
    }

    public void setParE(TParE node)
    {
        if(this._parE_ != null)
        {
            this._parE_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parE_ = node;
    }

    public PExplogic getExplogic()
    {
        return this._explogic_;
    }

    public void setExplogic(PExplogic node)
    {
        if(this._explogic_ != null)
        {
            this._explogic_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._explogic_ = node;
    }

    public TParD getParD()
    {
        return this._parD_;
    }

    public void setParD(TParD node)
    {
        if(this._parD_ != null)
        {
            this._parD_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parD_ = node;
    }

    public TEntao getEntao()
    {
        return this._entao_;
    }

    public void setEntao(TEntao node)
    {
        if(this._entao_ != null)
        {
            this._entao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._entao_ = node;
    }

    public LinkedList<PCommand> getCommand()
    {
        return this._command_;
    }

    public void setCommand(List<?> list)
    {
        for(PCommand e : this._command_)
        {
            e.parent(null);
        }
        this._command_.clear();

        for(Object obj_e : list)
        {
            PCommand e = (PCommand) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._command_.add(e);
        }
    }

    public PElsepart getElsepart()
    {
        return this._elsepart_;
    }

    public void setElsepart(PElsepart node)
    {
        if(this._elsepart_ != null)
        {
            this._elsepart_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elsepart_ = node;
    }

    public TFimSe getFimSe()
    {
        return this._fimSe_;
    }

    public void setFimSe(TFimSe node)
    {
        if(this._fimSe_ != null)
        {
            this._fimSe_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimSe_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._se_)
            + toString(this._parE_)
            + toString(this._explogic_)
            + toString(this._parD_)
            + toString(this._entao_)
            + toString(this._command_)
            + toString(this._elsepart_)
            + toString(this._fimSe_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._se_ == child)
        {
            this._se_ = null;
            return;
        }

        if(this._parE_ == child)
        {
            this._parE_ = null;
            return;
        }

        if(this._explogic_ == child)
        {
            this._explogic_ = null;
            return;
        }

        if(this._parD_ == child)
        {
            this._parD_ = null;
            return;
        }

        if(this._entao_ == child)
        {
            this._entao_ = null;
            return;
        }

        if(this._command_.remove(child))
        {
            return;
        }

        if(this._elsepart_ == child)
        {
            this._elsepart_ = null;
            return;
        }

        if(this._fimSe_ == child)
        {
            this._fimSe_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._se_ == oldChild)
        {
            setSe((TSe) newChild);
            return;
        }

        if(this._parE_ == oldChild)
        {
            setParE((TParE) newChild);
            return;
        }

        if(this._explogic_ == oldChild)
        {
            setExplogic((PExplogic) newChild);
            return;
        }

        if(this._parD_ == oldChild)
        {
            setParD((TParD) newChild);
            return;
        }

        if(this._entao_ == oldChild)
        {
            setEntao((TEntao) newChild);
            return;
        }

        for(ListIterator<PCommand> i = this._command_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PCommand) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._elsepart_ == oldChild)
        {
            setElsepart((PElsepart) newChild);
            return;
        }

        if(this._fimSe_ == oldChild)
        {
            setFimSe((TFimSe) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
