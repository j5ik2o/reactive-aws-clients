// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ListDomainNamesResponseBuilderOps(val self: ListDomainNamesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNamesAsScala(value: Option[Seq[DomainInfo]]): ListDomainNamesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.domainNames(v.asJava)
    }
  }

}

final class ListDomainNamesResponseOps(val self: ListDomainNamesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNamesAsScala: Option[Seq[DomainInfo]] = Option(self.domainNames).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListDomainNamesResponseOps {

  implicit def toListDomainNamesResponseBuilderOps(
      v: ListDomainNamesResponse.Builder
  ): ListDomainNamesResponseBuilderOps = new ListDomainNamesResponseBuilderOps(v)

  implicit def toListDomainNamesResponseOps(v: ListDomainNamesResponse): ListDomainNamesResponseOps =
    new ListDomainNamesResponseOps(v)

}
