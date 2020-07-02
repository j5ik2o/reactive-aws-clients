// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RegisterInstanceTagAttributeRequestBuilderOps(val self: RegisterInstanceTagAttributeRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeAllTagsOfInstanceAsScala(value: Option[Boolean]): RegisterInstanceTagAttributeRequest.Builder = {
    value.fold(self) { v => self.includeAllTagsOfInstance(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTagKeysAsScala(value: Option[Seq[String]]): RegisterInstanceTagAttributeRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.instanceTagKeys(v.asJava)
    }
  }

}

final class RegisterInstanceTagAttributeRequestOps(val self: RegisterInstanceTagAttributeRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeAllTagsOfInstanceAsScala: Option[Boolean] = Option(self.includeAllTagsOfInstance)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceTagKeysAsScala: Option[Seq[String]] =
    Option(self.instanceTagKeys).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegisterInstanceTagAttributeRequestOps {

  implicit def toRegisterInstanceTagAttributeRequestBuilderOps(
      v: RegisterInstanceTagAttributeRequest.Builder
  ): RegisterInstanceTagAttributeRequestBuilderOps = new RegisterInstanceTagAttributeRequestBuilderOps(v)

  implicit def toRegisterInstanceTagAttributeRequestOps(
      v: RegisterInstanceTagAttributeRequest
  ): RegisterInstanceTagAttributeRequestOps = new RegisterInstanceTagAttributeRequestOps(v)

}
