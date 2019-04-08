// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class LambdaDataSourceConfigBuilderOps(val self: LambdaDataSourceConfig.Builder) extends AnyVal {

  final def lambdaFunctionArnAsScala(value: Option[String]): LambdaDataSourceConfig.Builder = {
    value.fold(self) { v =>
      self.lambdaFunctionArn(v)
    }
  }

}

final class LambdaDataSourceConfigOps(val self: LambdaDataSourceConfig) extends AnyVal {

  final def lambdaFunctionArnAsScala: Option[String] = Option(self.lambdaFunctionArn)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLambdaDataSourceConfigOps {

  implicit def toLambdaDataSourceConfigBuilderOps(v: LambdaDataSourceConfig.Builder): LambdaDataSourceConfigBuilderOps =
    new LambdaDataSourceConfigBuilderOps(v)

  implicit def toLambdaDataSourceConfigOps(v: LambdaDataSourceConfig): LambdaDataSourceConfigOps =
    new LambdaDataSourceConfigOps(v)

}
