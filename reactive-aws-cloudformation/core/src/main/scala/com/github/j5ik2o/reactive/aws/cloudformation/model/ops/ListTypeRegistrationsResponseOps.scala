// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ListTypeRegistrationsResponseBuilderOps(val self: ListTypeRegistrationsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registrationTokenListAsScala(value: Option[Seq[String]]): ListTypeRegistrationsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.registrationTokenList(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListTypeRegistrationsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListTypeRegistrationsResponseOps(val self: ListTypeRegistrationsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registrationTokenListAsScala: Option[Seq[String]] = Option(self.registrationTokenList).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListTypeRegistrationsResponseOps {

  implicit def toListTypeRegistrationsResponseBuilderOps(
      v: ListTypeRegistrationsResponse.Builder
  ): ListTypeRegistrationsResponseBuilderOps = new ListTypeRegistrationsResponseBuilderOps(v)

  implicit def toListTypeRegistrationsResponseOps(v: ListTypeRegistrationsResponse): ListTypeRegistrationsResponseOps =
    new ListTypeRegistrationsResponseOps(v)

}
