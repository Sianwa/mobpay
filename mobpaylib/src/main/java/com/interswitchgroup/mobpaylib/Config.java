package com.interswitchgroup.mobpaylib;

import android.webkit.URLUtil;

import com.interswitchgroup.mobpaylib.model.CardToken;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Config implements Serializable {
    //All channels are enabled by default
    private List<MobPay.PaymentChannel> channels = new LinkedList<>(Arrays.asList(MobPay.PaymentChannel.class.getEnumConstants()));
    private final List<CardToken> cardTokens = new ArrayList<>();
    private String iconUrl;
    private String primaryAccentColor;
    private String providerIconUrl;
    private String redirectUrl;


    public List<MobPay.PaymentChannel> getChannels() {
        return channels;
    }

    public void setChannels(MobPay.PaymentChannel... channels) {
        if (channels != null && channels.length > 0) {
            // Set enabled channels by first converting all channels varargs to set to remove duplicates
            this.channels = new ArrayList<>(new LinkedHashSet<>(Arrays.asList(channels)));
        }
    }

    public List<CardToken> getCardTokens() {
        return cardTokens;
    }

    public void setCardTokens(List<CardToken> cardTokens) {
        this.cardTokens.clear();
        this.cardTokens.addAll(cardTokens);
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        if (URLUtil.isValidUrl(iconUrl)) {
            this.iconUrl = iconUrl;
        }
    }

    public String getProviderIconUrl() {
        return providerIconUrl;
    }

    public void setProviderIconUrl(String providerIconUrl) {
        this.providerIconUrl = providerIconUrl;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getPrimaryAccentColor() {
        return primaryAccentColor;
    }

    public void setPrimaryAccentColor(String primaryAccentColor) {
        this.primaryAccentColor = primaryAccentColor;
    }
}
