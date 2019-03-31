package com.lyq.conf.mq;

import lombok.Data;

@Data
public class BaseMqProperty {
    private MqInfo mq;
    private OtherInfo other;

    public MqInfo getMq() {
        return mq;
    }

    public void setMq(MqInfo mq) {
        this.mq = mq;
    }

    public OtherInfo getOther() {
        return other;
    }

    public void setOther(OtherInfo other) {
        this.other = other;
    }
}
