// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateKeyPairRequestBuilderOps(val self: CreateKeyPairRequest.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyNameAsScala(value: Option[String]): CreateKeyPairRequest.Builder = {
            value.fold(self){ v => self.keyName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateKeyPairRequest.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava) } 
            }


}

final class CreateKeyPairRequestOps(val self: CreateKeyPairRequest) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyNameAsScala: Option[String] = Option(self.keyName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala } 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateKeyPairRequestOps {

implicit def toCreateKeyPairRequestBuilderOps(v: CreateKeyPairRequest.Builder): CreateKeyPairRequestBuilderOps = new CreateKeyPairRequestBuilderOps(v)

implicit def toCreateKeyPairRequestOps(v: CreateKeyPairRequest): CreateKeyPairRequestOps = new CreateKeyPairRequestOps(v)

}

