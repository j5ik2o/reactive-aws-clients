// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ParquetInputBuilderOps(val self: ParquetInput.Builder) extends AnyVal {}

final class ParquetInputOps(val self: ParquetInput) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToParquetInputOps {

  implicit def toParquetInputBuilderOps(v: ParquetInput.Builder): ParquetInputBuilderOps = new ParquetInputBuilderOps(v)

  implicit def toParquetInputOps(v: ParquetInput): ParquetInputOps = new ParquetInputOps(v)

}
