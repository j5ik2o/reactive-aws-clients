// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class UpdateTableRequestBuilderOps(val self: UpdateTableRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributeDefinitionsAsScala(value: Option[Seq[AttributeDefinition]]): UpdateTableRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributeDefinitions(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableNameAsScala(value: Option[String]): UpdateTableRequest.Builder = {
            value.fold(self){ v => self.tableName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def billingModeAsScala(value: Option[BillingMode]): UpdateTableRequest.Builder = {
            value.fold(self){ v => self.billingMode(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def provisionedThroughputAsScala(value: Option[ProvisionedThroughput]): UpdateTableRequest.Builder = {
            value.fold(self){ v => self.provisionedThroughput(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def globalSecondaryIndexUpdatesAsScala(value: Option[Seq[GlobalSecondaryIndexUpdate]]): UpdateTableRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.globalSecondaryIndexUpdates(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamSpecificationAsScala(value: Option[StreamSpecification]): UpdateTableRequest.Builder = {
            value.fold(self){ v => self.streamSpecification(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseSpecificationAsScala(value: Option[SSESpecification]): UpdateTableRequest.Builder = {
            value.fold(self){ v => self.sseSpecification(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicaUpdatesAsScala(value: Option[Seq[ReplicationGroupUpdate]]): UpdateTableRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.replicaUpdates(v.asJava) } 
            }


}

final class UpdateTableRequestOps(val self: UpdateTableRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def attributeDefinitionsAsScala: Option[Seq[AttributeDefinition]] = Option(self.attributeDefinitions).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableNameAsScala: Option[String] = Option(self.tableName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def billingModeAsScala: Option[BillingMode] = Option(self.billingMode) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def provisionedThroughputAsScala: Option[ProvisionedThroughput] = Option(self.provisionedThroughput) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def globalSecondaryIndexUpdatesAsScala: Option[Seq[GlobalSecondaryIndexUpdate]] = Option(self.globalSecondaryIndexUpdates).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def streamSpecificationAsScala: Option[StreamSpecification] = Option(self.streamSpecification) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def sseSpecificationAsScala: Option[SSESpecification] = Option(self.sseSpecification) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def replicaUpdatesAsScala: Option[Seq[ReplicationGroupUpdate]] = Option(self.replicaUpdates).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateTableRequestOps {

implicit def toUpdateTableRequestBuilderOps(v: UpdateTableRequest.Builder): UpdateTableRequestBuilderOps = new UpdateTableRequestBuilderOps(v)

implicit def toUpdateTableRequestOps(v: UpdateTableRequest): UpdateTableRequestOps = new UpdateTableRequestOps(v)

}

