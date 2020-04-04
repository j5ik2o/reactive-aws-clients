// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ListDomainsForPackageResponseBuilderOps(val self: ListDomainsForPackageResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainPackageDetailsListAsScala(
      value: Option[Seq[DomainPackageDetails]]
  ): ListDomainsForPackageResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.domainPackageDetailsList(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListDomainsForPackageResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListDomainsForPackageResponseOps(val self: ListDomainsForPackageResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainPackageDetailsListAsScala: Option[Seq[DomainPackageDetails]] =
    Option(self.domainPackageDetailsList).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListDomainsForPackageResponseOps {

  implicit def toListDomainsForPackageResponseBuilderOps(
      v: ListDomainsForPackageResponse.Builder
  ): ListDomainsForPackageResponseBuilderOps = new ListDomainsForPackageResponseBuilderOps(v)

  implicit def toListDomainsForPackageResponseOps(v: ListDomainsForPackageResponse): ListDomainsForPackageResponseOps =
    new ListDomainsForPackageResponseOps(v)

}
