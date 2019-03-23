package wrapper.${packageName}Gen

import com.github.j5ik2o.reactive.aws.dynamodb.model._
import scala.concurrent.{ExecutionContext, Future}
import scala.compat.java8.FutureConverters._
import software.amazon.awssdk.services.dynamodb

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.name?ends_with("Paginator")>
        <#return false>
    </#if>
    <#local target=true>
    <#list methodDesc.parameters as parameter>
        <#if parameter.typeName.fullTypeName == "Consumer[Builder]">
            <#local target = false>
            <#break >
        </#if>
    </#list>
    <#return target>
</#function>
trait Scala${simpleTypeName} {

import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.BatchGetItemRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.BatchGetItemResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.BatchWriteItemRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.BatchWriteItemResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.CreateBackupRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.CreateBackupResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.CreateGlobalTableRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.CreateGlobalTableResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.CreateTableRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.CreateTableResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteBackupRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteBackupResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteItemRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteItemResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteTableRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DeleteTableResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeBackupRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeBackupResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeContinuousBackupsRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeContinuousBackupsResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeEndpointsRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeEndpointsResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeGlobalTableRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeGlobalTableResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeGlobalTableSettingsRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeGlobalTableSettingsResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeLimitsRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeLimitsResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeTableRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeTableResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeTimeToLiveRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.DescribeTimeToLiveResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.GetItemRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.GetItemResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListBackupsRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListBackupsResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListGlobalTablesRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListGlobalTablesResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListTablesRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListTablesResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListTagsOfResourceRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ListTagsOfResourceResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.PutItemRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.PutItemResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.QueryRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.QueryResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.RestoreTableFromBackupRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.RestoreTableFromBackupResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.RestoreTableToPointInTimeRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.RestoreTableToPointInTimeResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ScanRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.ScanResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TagResourceRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TagResourceResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TransactGetItemsRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TransactGetItemsResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TransactWriteItemsRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.TransactWriteItemsResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UntagResourceRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UntagResourceResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateContinuousBackupsRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateContinuousBackupsResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateGlobalTableRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateGlobalTableResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateGlobalTableSettingsRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateGlobalTableSettingsResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateItemRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateItemResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateTableRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateTableResponseOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateTimeToLiveRequestOps._
import com.github.j5ik2o.reactive.aws.dynamodb.model.v2.UpdateTimeToLiveResponseOps._

    implicit val ec: ExecutionContext

    val underlying${simpleTypeName}: ${packageName}.${simpleTypeName}

<#list methods as method>
    <#if targetMethod(method)>
    def ${method.name}(<#list method.parameters as parameter>${parameter.name}: ${parameter.typeName.fullTypeName}<#if parameter_has_next>,</#if></#list>): <#if method.notNull || method.returnType.simpleTypeName == "Unit" || method.returnType.simpleTypeName == "Future">${method.returnType.fullTypeName}<#else>Option[${method.returnType.fullTypeName}]</#if> =
        underlying${simpleTypeName}.${method.name}(<#list method.parameters as parameter>${parameter.name}.toJava<#if parameter_has_next>,</#if></#list>).toScala.map(_.toScala)
    </#if>

</#list>

}

