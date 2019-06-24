// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class ListKeyPoliciesResponseBuilderOps(val self: ListKeyPoliciesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyNamesAsScala(value: Option[Seq[String]]): ListKeyPoliciesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.policyNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala(value: Option[String]): ListKeyPoliciesResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def truncatedAsScala(value: Option[Boolean]): ListKeyPoliciesResponse.Builder = {
    value.fold(self) { v =>
      self.truncated(v)
    }
  }

}

final class ListKeyPoliciesResponseOps(val self: ListKeyPoliciesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def policyNamesAsScala: Option[Seq[String]] = Option(self.policyNames).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def truncatedAsScala: Option[Boolean] = Option(self.truncated)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListKeyPoliciesResponseOps {

  implicit def toListKeyPoliciesResponseBuilderOps(
      v: ListKeyPoliciesResponse.Builder
  ): ListKeyPoliciesResponseBuilderOps = new ListKeyPoliciesResponseBuilderOps(v)

  implicit def toListKeyPoliciesResponseOps(v: ListKeyPoliciesResponse): ListKeyPoliciesResponseOps =
    new ListKeyPoliciesResponseOps(v)

}
