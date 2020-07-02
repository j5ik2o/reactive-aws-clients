// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class LambdaConflictHandlerConfigBuilderOps(val self: LambdaConflictHandlerConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lambdaConflictHandlerArnAsScala(value: Option[String]): LambdaConflictHandlerConfig.Builder = {
    value.fold(self) { v => self.lambdaConflictHandlerArn(v) }
  }

}

final class LambdaConflictHandlerConfigOps(val self: LambdaConflictHandlerConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lambdaConflictHandlerArnAsScala: Option[String] = Option(self.lambdaConflictHandlerArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLambdaConflictHandlerConfigOps {

  implicit def toLambdaConflictHandlerConfigBuilderOps(
      v: LambdaConflictHandlerConfig.Builder
  ): LambdaConflictHandlerConfigBuilderOps = new LambdaConflictHandlerConfigBuilderOps(v)

  implicit def toLambdaConflictHandlerConfigOps(v: LambdaConflictHandlerConfig): LambdaConflictHandlerConfigOps =
    new LambdaConflictHandlerConfigOps(v)

}
