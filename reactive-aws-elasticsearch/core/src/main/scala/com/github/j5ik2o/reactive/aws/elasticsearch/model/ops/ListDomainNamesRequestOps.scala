// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class ListDomainNamesRequestBuilderOps(val self: ListDomainNamesRequest.Builder) extends AnyVal {}

final class ListDomainNamesRequestOps(val self: ListDomainNamesRequest) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListDomainNamesRequestOps {

  implicit def toListDomainNamesRequestBuilderOps(v: ListDomainNamesRequest.Builder): ListDomainNamesRequestBuilderOps =
    new ListDomainNamesRequestBuilderOps(v)

  implicit def toListDomainNamesRequestOps(v: ListDomainNamesRequest): ListDomainNamesRequestOps =
    new ListDomainNamesRequestOps(v)

}
