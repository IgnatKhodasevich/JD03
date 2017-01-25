package com.company.carservice.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Ignat on 04.11.16.
 */
@Entity
public class Messages {
    private int messageId;
    private String messageText;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    @Id
    @Column(name = "message_id")
    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    @Basic
    @Column(name = "message_text")
    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    @Basic
    @Column(name = "CustomerName")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "CustomerEmail")
    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Basic
    @Column(name = "CustomerPhone")
    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Messages messages = (Messages) o;

        if (messageId != messages.messageId) return false;
        if (messageText != null ? !messageText.equals(messages.messageText) : messages.messageText != null)
            return false;
        if (customerName != null ? !customerName.equals(messages.customerName) : messages.customerName != null)
            return false;
        if (customerEmail != null ? !customerEmail.equals(messages.customerEmail) : messages.customerEmail != null)
            return false;
        if (customerPhone != null ? !customerPhone.equals(messages.customerPhone) : messages.customerPhone != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = messageId;
        result = 31 * result + (messageText != null ? messageText.hashCode() : 0);
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (customerEmail != null ? customerEmail.hashCode() : 0);
        result = 31 * result + (customerPhone != null ? customerPhone.hashCode() : 0);
        return result;
    }
}
