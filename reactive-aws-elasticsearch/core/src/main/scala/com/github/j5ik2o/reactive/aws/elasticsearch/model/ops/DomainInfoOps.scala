// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DomainInfoBuilderOps(val self: DomainInfo.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala(value: Option[String]): DomainInfo.Builder = {
    value.fold(self) { v =>
      self.domainName(v)
    }
  }

}

final class DomainInfoOps(val self: DomainInfo) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def domainNameAsScala: Option[String] = Option(self.domainName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDomainInfoOps {

  implicit def toDomainInfoBuilderOps(v: DomainInfo.Builder): DomainInfoBuilderOps = new DomainInfoBuilderOps(v)

  implicit def toDomainInfoOps(v: DomainInfo): DomainInfoOps = new DomainInfoOps(v)

}
