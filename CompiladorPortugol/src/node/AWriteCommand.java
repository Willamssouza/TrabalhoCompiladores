/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AWriteCommand extends PCommand
{
    private TEscreva _escreva_;
    private TParE _parE_;
    private final LinkedList<PExplist> _explist_ = new LinkedList<PExplist>();
    private PExp _exp_;
    private TParD _parD_;
    private TSemicolon _semicolon_;

    public AWriteCommand()
    {
        // Constructor
    }

    public AWriteCommand(
        @SuppressWarnings("hiding") TEscreva _escreva_,
        @SuppressWarnings("hiding") TParE _parE_,
        @SuppressWarnings("hiding") List<?> _explist_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TParD _parD_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setEscreva(_escreva_);

        setParE(_parE_);

        setExplist(_explist_);

        setExp(_exp_);

        setParD(_parD_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AWriteCommand(
            cloneNode(this._escreva_),
            cloneNode(this._parE_),
            cloneList(this._explist_),
            cloneNode(this._exp_),
            cloneNode(this._parD_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWriteCommand(this);
    }

    public TEscreva getEscreva()
    {
        return this._escreva_;
    }

    public void setEscreva(TEscreva node)
    {
        if(this._escreva_ != null)
        {
            this._escreva_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._escreva_ = node;
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

    public LinkedList<PExplist> getExplist()
    {
        return this._explist_;
    }

    public void setExplist(List<?> list)
    {
        for(PExplist e : this._explist_)
        {
            e.parent(null);
        }
        this._explist_.clear();

        for(Object obj_e : list)
        {
            PExplist e = (PExplist) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._explist_.add(e);
        }
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
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
            + toString(this._escreva_)
            + toString(this._parE_)
            + toString(this._explist_)
            + toString(this._exp_)
            + toString(this._parD_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._escreva_ == child)
        {
            this._escreva_ = null;
            return;
        }

        if(this._parE_ == child)
        {
            this._parE_ = null;
            return;
        }

        if(this._explist_.remove(child))
        {
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._parD_ == child)
        {
            this._parD_ = null;
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
        if(this._escreva_ == oldChild)
        {
            setEscreva((TEscreva) newChild);
            return;
        }

        if(this._parE_ == oldChild)
        {
            setParE((TParE) newChild);
            return;
        }

        for(ListIterator<PExplist> i = this._explist_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExplist) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._parD_ == oldChild)
        {
            setParD((TParD) newChild);
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
