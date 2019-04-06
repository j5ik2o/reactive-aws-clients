// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class GetResolverResponseBuilderOps(val self: GetResolverResponse.Builder) extends AnyVal {

  final def withResolverAsScala(value: Option[Resolver]): GetResolverResponse.Builder = {
    value.fold(self) { v =>
      self.resolver(v)
    }
  } // Resolver

}

final class GetResolverResponseOps(val self: GetResolverResponse) extends AnyVal {

  final def resolverAsScala: Option[Resolver] = Option(self.resolver) // Resolver

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetResolverResponseOps {

  implicit def toGetResolverResponseBuilderOps(v: GetResolverResponse.Builder): GetResolverResponseBuilderOps =
    new GetResolverResponseBuilderOps(v)

  implicit def toGetResolverResponseOps(v: GetResolverResponse): GetResolverResponseOps = new GetResolverResponseOps(v)

}
