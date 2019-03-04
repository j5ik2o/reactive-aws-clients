package com.github.j5ik2o.reactive.aws.dynamodb

trait JavaClientMetricsInterceptor {

  protected def currentTime: Long = System.nanoTime()

  protected val reporter: MetricsReporter

  protected def collectSync[A, B](name: String, request: A)(f: A => B): B = {
    val start = currentTime
    try {
      f(request)
    } finally {
      reporter.record(name, currentTime - start)
      reporter.increment(name)
    }
  }

}
