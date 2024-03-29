Easemob.im.config = (function () {
    var protocol = location.protocol === 'https:' ? 'https:' : 'http:';

    return {
        /*
            The global value set for xmpp server
        */
        xmppURL: 'im-api.easemob.com',
        /*
            The global value set for Easemob backend REST API
            "http://a1.easemob.com"
        */
        apiURL: protocol + '//a1.easemob.com',
        /*
            连接时提供appkey
        */
        //appkey: "easemob-demo#chatdemoui",
        appkey: "dqys#qsweb",
        /*
         * 是否使用https
         */
        https : protocol === 'https:',
        /*
         * 是否使用多resource
         */
        multiResources: false
    };
}());
