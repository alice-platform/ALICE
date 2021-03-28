package ai.alice.internal.containers

import ai.alice.api.Consumer
import ai.alice.api.Transformer
import ai.alice.api.datastore.DataStore
import ai.alice.api.engine.Engine
import ai.alice.api.engine.EngineContainer
import ai.alice.api.objects.ObjectContainer
import ai.alice.api.objects.provider.Provider
import ai.alice.internal.AliceImpl

class EngineContainerImpl(override val root: AliceImpl) : EngineContainer {
  override fun <TFactory : Engine.Factory<TConfig, *>, TConfig : Engine.Config> install(factory: TFactory, configure: TConfig.() -> Unit) {
    TODO("Not yet implemented")
  }

  override fun ofNamed(name: String): Provider<Engine<*, *, *, *>> {
    TODO("Not yet implemented")
  }

  override fun <R : Engine<*, *, *, *>> ofNamed(name: String, type: Class<R>): Provider<R> {
    TODO("Not yet implemented")
  }

  override fun configure(name: String, action: Consumer<Engine<*, *, *, *>>) {
    TODO("Not yet implemented")
  }

  override fun <R : Engine<*, *, *, *>> configure(name: String, type: Class<R>, action: Consumer<R>) {
    TODO("Not yet implemented")
  }

  override fun <R : Engine<*, *, *, *>> configure(type: Class<R>, action: Consumer<R>) {
    TODO("Not yet implemented")
  }

  override fun <R : Engine<*, *, *, *>> ofType(type: Class<R>): Provider<R> {
    TODO("Not yet implemented")
  }

  override fun <R : Any> map(transformer: Transformer<Engine<*, *, *, *>, R>): ObjectContainer<R> {
    TODO("Not yet implemented")
  }

  override fun <R : Any> flatMap(transformer: Transformer<Engine<*, *, *, *>, Iterable<R>>): ObjectContainer<R> {
    TODO("Not yet implemented")
  }

  override fun configureEach(action: Consumer<Engine<*, *, *, *>>) {
    TODO("Not yet implemented")
  }

  override val size: Int
    get() = TODO("Not yet implemented")

  override fun contains(element: Engine<*, *, *, *>): Boolean {
    TODO("Not yet implemented")
  }

  override fun containsAll(elements: Collection<Engine<*, *, *, *>>): Boolean {
    TODO("Not yet implemented")
  }

  override fun isEmpty(): Boolean {
    TODO("Not yet implemented")
  }

  override fun iterator(): Iterator<Engine<*, *, *, *>> {
    TODO("Not yet implemented")
  }

}

class DataStoreImpl(override val root: AliceImpl) : DataStore {
  override fun <T : Any> create(type: Class<T>): Provider<T> {
    TODO("Not yet implemented")
  }

  override val isActive: Boolean
    get() = TODO("Not yet implemented")

  override fun run() {
    TODO("Not yet implemented")
  }

  override val isClosed: Boolean
    get() = TODO("Not yet implemented")

  override fun close() {
    TODO("Not yet implemented")
  }

}