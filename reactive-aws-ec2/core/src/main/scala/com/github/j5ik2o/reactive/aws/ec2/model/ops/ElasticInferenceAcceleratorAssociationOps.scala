// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ElasticInferenceAcceleratorAssociationBuilderOps(val self: ElasticInferenceAcceleratorAssociation.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticInferenceAcceleratorArnAsScala(value: Option[String]): ElasticInferenceAcceleratorAssociation.Builder = {
            value.fold(self){ v => self.elasticInferenceAcceleratorArn(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticInferenceAcceleratorAssociationIdAsScala(value: Option[String]): ElasticInferenceAcceleratorAssociation.Builder = {
            value.fold(self){ v => self.elasticInferenceAcceleratorAssociationId(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticInferenceAcceleratorAssociationStateAsScala(value: Option[String]): ElasticInferenceAcceleratorAssociation.Builder = {
            value.fold(self){ v => self.elasticInferenceAcceleratorAssociationState(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticInferenceAcceleratorAssociationTimeAsScala(value: Option[java.time.Instant]): ElasticInferenceAcceleratorAssociation.Builder = {
            value.fold(self){ v => self.elasticInferenceAcceleratorAssociationTime(v) }
            } 


}

final class ElasticInferenceAcceleratorAssociationOps(val self: ElasticInferenceAcceleratorAssociation) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticInferenceAcceleratorArnAsScala: Option[String] = Option(self.elasticInferenceAcceleratorArn) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticInferenceAcceleratorAssociationIdAsScala: Option[String] = Option(self.elasticInferenceAcceleratorAssociationId) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticInferenceAcceleratorAssociationStateAsScala: Option[String] = Option(self.elasticInferenceAcceleratorAssociationState) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def elasticInferenceAcceleratorAssociationTimeAsScala: Option[java.time.Instant] = Option(self.elasticInferenceAcceleratorAssociationTime) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToElasticInferenceAcceleratorAssociationOps {

implicit def toElasticInferenceAcceleratorAssociationBuilderOps(v: ElasticInferenceAcceleratorAssociation.Builder): ElasticInferenceAcceleratorAssociationBuilderOps = new ElasticInferenceAcceleratorAssociationBuilderOps(v)

implicit def toElasticInferenceAcceleratorAssociationOps(v: ElasticInferenceAcceleratorAssociation): ElasticInferenceAcceleratorAssociationOps = new ElasticInferenceAcceleratorAssociationOps(v)

}

