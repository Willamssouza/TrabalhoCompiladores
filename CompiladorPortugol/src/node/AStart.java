/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AStart extends PStart
{
    private PProgram _program_;

    public AStart()
    {
        // Constructor
    }

    public AStart(
        @SuppressWarnings("hiding") PProgram _program_)
    {
        // Constructor
        setProgram(_program_);

    }

    @Override
    public Object clone()
    {
        return new AStart(
            cloneNode(this._program_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStart(this);
    }

    public PProgram getProgram()
    {
        return this._program_;
    }

    public void setProgram(PProgram node)
    {
        if(this._program_ != null)
        {
            this._program_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._program_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._program_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._program_ == child)
        {
            this._program_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._program_ == oldChild)
        {
            setProgram((PProgram) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
