// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeregisterInstanceTagAttributeRequestBuilderOps(val self: DeregisterInstanceTagAttributeRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeAllTagsOfInstanceAsScala(value: Option[Boolean]): DeregisterInstanceTagAttributeRequest.Builder = {
    value.fold(self) { v => self.includeAllTagsOfInstance(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTagKeysAsScala(value: Option[Seq[String]]): DeregisterInstanceTagAttributeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceTagKeys(v.asJava)
    }
  }

}

final class DeregisterInstanceTagAttributeRequestOps(val self: DeregisterInstanceTagAttributeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeAllTagsOfInstanceAsScala: Option[Boolean] = Option(self.includeAllTagsOfInstance)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTagKeysAsScala: Option[Seq[String]] =
    Option(self.instanceTagKeys).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeregisterInstanceTagAttributeRequestOps {

  implicit def toDeregisterInstanceTagAttributeRequestBuilderOps(
      v: DeregisterInstanceTagAttributeRequest.Builder
  ): DeregisterInstanceTagAttributeRequestBuilderOps = new DeregisterInstanceTagAttributeRequestBuilderOps(v)

  implicit def toDeregisterInstanceTagAttributeRequestOps(
      v: DeregisterInstanceTagAttributeRequest
  ): DeregisterInstanceTagAttributeRequestOps = new DeregisterInstanceTagAttributeRequestOps(v)

}
