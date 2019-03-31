<#function toJavaMethodName scala>
    <#switch scala>
        <#case "Ss">
            <#return "SS">
        <#case "Ns">
            <#return "NS">
        <#case "Bs">
            <#return "BS">
        <#case "Bool">
            <#return "BOOL">
        <#case "Nul">
            <#return "NULL">
        <#case "SseSpecification">
            <#return "SSESpecification">
        <#case "SseType">
            <#return "SSEType">
        <#case "KmsMasterKeyArn">
            <#return "KMSMasterKeyArn">
        <#case "KmsMasterKeyId">
            <#return "KMSMasterKeyId">
        <#case "SseDescription">
            <#return "SSEDescription">
        <#default>
            <#return scala>
    </#switch>
</#function>