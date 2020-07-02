// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ListPackagesForDomainResponseBuilderOps(val self: ListPackagesForDomainResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainPackageDetailsListAsScala(
      value: Option[Seq[DomainPackageDetails]]
  ): ListPackagesForDomainResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.domainPackageDetailsList(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListPackagesForDomainResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class ListPackagesForDomainResponseOps(val self: ListPackagesForDomainResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainPackageDetailsListAsScala: Option[Seq[DomainPackageDetails]] =
    Option(self.domainPackageDetailsList).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListPackagesForDomainResponseOps {

  implicit def toListPackagesForDomainResponseBuilderOps(
      v: ListPackagesForDomainResponse.Builder
  ): ListPackagesForDomainResponseBuilderOps = new ListPackagesForDomainResponseBuilderOps(v)

  implicit def toListPackagesForDomainResponseOps(v: ListPackagesForDomainResponse): ListPackagesForDomainResponseOps =
    new ListPackagesForDomainResponseOps(v)

}
