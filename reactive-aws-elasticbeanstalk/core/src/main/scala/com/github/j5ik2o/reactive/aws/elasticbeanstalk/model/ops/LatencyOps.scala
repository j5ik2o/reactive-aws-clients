// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class LatencyBuilderOps(val self: Latency.Builder) extends AnyVal {

  final def p999AsScala(value: Option[Double]): Latency.Builder = {
    value.fold(self) { v =>
      self.p999(v)
    }
  } // Double

  final def p99AsScala(value: Option[Double]): Latency.Builder = {
    value.fold(self) { v =>
      self.p99(v)
    }
  } // Double

  final def p95AsScala(value: Option[Double]): Latency.Builder = {
    value.fold(self) { v =>
      self.p95(v)
    }
  } // Double

  final def p90AsScala(value: Option[Double]): Latency.Builder = {
    value.fold(self) { v =>
      self.p90(v)
    }
  } // Double

  final def p85AsScala(value: Option[Double]): Latency.Builder = {
    value.fold(self) { v =>
      self.p85(v)
    }
  } // Double

  final def p75AsScala(value: Option[Double]): Latency.Builder = {
    value.fold(self) { v =>
      self.p75(v)
    }
  } // Double

  final def p50AsScala(value: Option[Double]): Latency.Builder = {
    value.fold(self) { v =>
      self.p50(v)
    }
  } // Double

  final def p10AsScala(value: Option[Double]): Latency.Builder = {
    value.fold(self) { v =>
      self.p10(v)
    }
  } // Double

}

final class LatencyOps(val self: Latency) extends AnyVal {

  final def p999AsScala: Option[Double] = Option(self.p999) // Double

  final def p99AsScala: Option[Double] = Option(self.p99) // Double

  final def p95AsScala: Option[Double] = Option(self.p95) // Double

  final def p90AsScala: Option[Double] = Option(self.p90) // Double

  final def p85AsScala: Option[Double] = Option(self.p85) // Double

  final def p75AsScala: Option[Double] = Option(self.p75) // Double

  final def p50AsScala: Option[Double] = Option(self.p50) // Double

  final def p10AsScala: Option[Double] = Option(self.p10) // Double

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLatencyOps {

  implicit def toLatencyBuilderOps(v: Latency.Builder): LatencyBuilderOps = new LatencyBuilderOps(v)

  implicit def toLatencyOps(v: Latency): LatencyOps = new LatencyOps(v)

}
