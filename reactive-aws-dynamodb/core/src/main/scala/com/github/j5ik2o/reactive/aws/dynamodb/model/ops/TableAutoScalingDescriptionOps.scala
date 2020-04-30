// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class TableAutoScalingDescriptionBuilderOps(val self: TableAutoScalingDescription.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableNameAsScala(value: Option[String]): TableAutoScalingDescription.Builder = {
            value.fold(self){ v => self.tableName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableStatusAsScala(value: Option[TableStatus]): TableAutoScalingDescription.Builder = {
            value.fold(self){ v => self.tableStatus(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def replicasAsScala(value: Option[Seq[ReplicaAutoScalingDescription]]): TableAutoScalingDescription.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.replicas(v.asJava) } 
            }


}

final class TableAutoScalingDescriptionOps(val self: TableAutoScalingDescription) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableNameAsScala: Option[String] = Option(self.tableName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableStatusAsScala: Option[TableStatus] = Option(self.tableStatus) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def replicasAsScala: Option[Seq[ReplicaAutoScalingDescription]] = Option(self.replicas).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTableAutoScalingDescriptionOps {

implicit def toTableAutoScalingDescriptionBuilderOps(v: TableAutoScalingDescription.Builder): TableAutoScalingDescriptionBuilderOps = new TableAutoScalingDescriptionBuilderOps(v)

implicit def toTableAutoScalingDescriptionOps(v: TableAutoScalingDescription): TableAutoScalingDescriptionOps = new TableAutoScalingDescriptionOps(v)

}

