package genetic;
import java.util.ArrayList;
class Thought368 extends Thought{
private static ArrayList<Thought368> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 538.7934944403952;
private double fd1 = 768.2705033217375;
private Thought fo0 = null;
private Thought fo1 = null;
Thought368 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought368 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought368 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought368 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought368 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought368 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought368 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought368 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought368 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought368 instance = new Thought368 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought368 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought368 instance = new Thought368 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought368 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought368 instance = new Thought368 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought368 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought368 instance = new Thought368 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought368 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought368 instance = new Thought368 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought368 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought368 instance = new Thought368 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought368 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought368 instance = new Thought368 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought368 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought368 instance = new Thought368 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought2.getInstance();
        fd0 *= -1;
        double ld1 = 587.9572223511987;
        fb1 = !fb0;
        fd0 *= -1;
        }
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            ab1 = fd0 > fd1;
            fd0 = fd1 + fd0;
            ab2 = fd1 > fd0;
            fd1 *= -1;
if(fo0 != null){
              fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
              ab1 = fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
            fb1 = ab1 || ab2;
            ab3 = ab4 || fb0;
            fb1 = fd1 > fd0;
            ab1 = !ab2;
            }
        fd1 = fd0 + fd1;
        Thought lo0 = Thought195.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 - fd0;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
        Thought lo0 = Thought280.getInstance(fd0, fd1, ad1, ad2);
        boolean lb1 = false;
        ad3 = ad4 + fd0;
        boolean lb2 = true;
        Thought lo3 = Thought87.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
        for(int i1=0; i1<10; i1++){
            ad4 *= -1;
            double ld4 = 876.8036825572325;
            Thought lo5 = Thought146.getInstance();
            ad4 = fd0 + fd1;
if(fo0 != null){
              fo0.m1(lb1, lb2, fb0, fb1);
}
            ld4 = ad1 + ad2;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + ad1;
    Thought lo0 = Thought266.getInstance(fo0, fo1, fo0, fo1);
    double ld1 = 697.8786186007325;
    Thought lo2 = Thought11.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);
}
    ab3 = !ab4;
    fb0 = fb1 && ab1;
    ab2 = ad2 < ad3;
    boolean lb3 = false;
    Thought lo4 = Thought27.getInstance();
if(fo1 != null){
      ad4 = fo1.m3(ab2, ab3, ab4, fb0);
}
    Output.points[2][0] -= fd0;
    Thought lo5 = Thought241.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2, fb1, lb3, ab1, ab2);
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    Thought lo6 = Thought114.getInstance(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
    ad1 = ad2 - ad3;
    boolean lb7 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd1 > fd0;
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
    Output.points[2][1] += fd1;
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        fb1 = fd1 > fd0;
        fb0 = fd1 < fd0;
        fd1 = fd0 - fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
        double ld0 = 822.7643389445127;
if(fo0 != null){
          fb1 = fo0.m2();
}
        fb0 = !fb1;
        ld0 = fd0 + fd1;
        fb0 = ld0 > fd0;
        fb1 = fb0 && fb1;
if(ao1 != null){
          fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought57.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
        fb0 = !fb1;
        ad3 = ad4 - fd0;
        boolean lb1 = true;
        lb1 = !fb0;
        fd1 = ad1 + ad2;
        ad3 *= -1;
        fb1 = ad4 < fd0;
        lb1 = fd1 > ad1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
        }
    ad2 *= -1;
    fb0 = ad3 < ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    for(int i1=0; i1<10; i1++){
        fb1 = ad4 > fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    double ld0 = 232.25521973131154;
    boolean lb1 = false;
    ab2 = fd0 < fd1;
    if (ab3) {
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb1);
}
        ld0 *= -1;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          fd0 = ao3.m3(fd1, ld0, fd0, fd1);
}
        if (ab1) {
            ab2 = !ab3;
            if (ab4) {
                fb0 = ld0 > fd0;
                fd1 *= -1;
                double ld2 = 885.9564323481029;
if(fo0 != null){
                  ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ld0, fd0, fd1);
}
                fb1 = !lb1;
                ab1 = ab2 && ab3;
                ld2 = ld0 - fd0;
}}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ad1 = ao2.m3();
}
    ad2 = ad3 + ad4;
    boolean lb0 = false;
    Output.points[2][2] += fd0;
    lb0 = !ab1;
    fd1 = ad1 - ad2;
if(ao3 != null){
      ao3.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ad1;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, lb0, lb1, ab1, ab2);
}
    ad2 *= -1;
    ab3 = !ab4;
    Thought lo2 = Thought175.getInstance(fo0, fo1, ao1, ao2);
    Output.points[2][3] -= ad3;
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ad1, ad2);
}
    boolean lb3 = false;
    ab4 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    lb0 = !lb1;
if(ao1 != null){
      fo1 = ao1.m4(lb3, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    boolean lb0 = false;
    lb0 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    lb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    boolean lb1 = false;
    Thought lo2 = Thought148.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
    boolean lb3 = true;
    Thought lo4 = Thought133.getInstance(fo1, fo0, fo1, fo0);
    lb3 = fb0 || fb1;
    Thought lo5 = Thought273.getInstance(fd1, fd0, fd1, fd0);
    lb0 = lb1 && lb3;
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb6 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 || lb0;

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab1 = fd0 < fd1;
if(fo1 != null){
      fo1.m1();
}
    double ld0 = 278.3021178882836;
    if (ab2) {
        double ld1 = 698.5771552569739;
        ab3 = ab4 && fb0;
        ld1 = ld0 + fd0;
if(fo0 != null){
          fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
        } else {
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fd1 = ld0 - fd0;
        fd1 = ld0 + fd0;
        fd1 = ld0 + fd0;
        Thought lo2 = Thought45.getInstance(fo1, fo0, fo1, fo0);
        fb0 = fb1 && ab1;
        fd1 = ld0 - fd0;
if(fo1 != null){
          ab2 = fo1.m2(fd1, ld0, fd0, fd1);
}
        ld0 = fd0 - fd1;
        Output.points[2][4] += ld0;
}
Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld0 = 106.42256266598828;
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    Thought lo2 = Thought147.getInstance();
if(fo0 != null){
      fd0 = fo0.m3(lb1, fb0, fb1, lb1);
}
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, lb3, fb0, fb1, lb1);
}
    boolean lb4 = false;
    lb3 = ad3 > ad4;
    lb4 = fb0 && fb1;
    Output.points[2][5] += fd0;
    boolean lb5 = false;
    if (lb1) {
        fd1 = ld0 - ad1;
        for(int i0=0; i0<10; i0++){
            Thought lo6 = Thought118.getInstance(ad2, ad3, ad4, fd0, lb3, lb4, lb5, fb0);
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, lb3, lb4);
}
            lb5 = fd1 > ld0;
            ad1 = ad2 + ad3;
            ad4 *= -1;
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, ld0, ad1);
}
            Output.points[2][6] -= ad2;
if(fo1 != null){
              ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
              fo0.m1();
}
            fb0 = !fb1;
}}
Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ad2 < ad3;
    ad4 *= -1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought238.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    ad1 = ad2 - ad3;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad4 *= -1;
    ab3 = fd0 > fd1;
    boolean lb1 = false;
    boolean lb2 = true;
    Output.points[2][7] += ad1;
    ad2 = ad3 + ad4;
    boolean lb3 = false;
    boolean lb4 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    lb4 = !ab1;
    Thought lo5 = Thought221.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m2();
}

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 < fd0;
        fd1 = fd0 - fd1;
        fb1 = fb0 || fb1;
        boolean lb0 = true;
        lb0 = !fb0;
        fb1 = lb0 && fb0;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = true;
    lb0 = lb1 || fb0;
    Output.points[2][8] -= ad1;
    fb1 = ad2 > ad3;
    Thought lo2 = Thought170.getInstance(ao2, ao3, ao4, fo0);
    Thought lo3 = Thought269.getInstance(ad4, fd0, fd1, ad1);
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ad1 = ao1.m3(lb1, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    double ld0 = 273.04112942517105;
    Thought lo1 = Thought239.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(ab3, ab4, fb0, fb1);
}
    double ld3 = 278.7143470636675;
    fd0 *= -1;
    lb2 = ab1 || ab2;
    Thought lo4 = Thought26.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, ld3, fd0, ab3, ab4, fb0, fb1);
    fd1 = ld0 - ld3;
    lb2 = ab1 && ab2;
    double ld5 = 156.01371819847844;
if(ao2 != null){
      ao2.m1(ld5, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ld3 = ld5 - fd0;
    lb2 = ab1 && ab2;
    fd1 = ld0 - ld3;
    ab3 = ld5 > fd0;
        ab4 = fb0 && fb1;
    double ld6 = 224.5926558809454;
    lb2 = ab1 || ab2;
    ab3 = ab4 || fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought29.getInstance(ao1, ao2, ao3, ao4, lb0, ab1, ab2, ab3);
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3);
}
    fb0 = fb1 && lb0;
    double ld2 = 950.1839708574905;
    boolean lb3 = false;
    lb3 = ab1 && ab2;
    boolean lb4 = true;
    ld2 = ad1 + ad2;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ab2 = ab3 || ab4;
    boolean lb5 = true;
    ld2 = ad1 + ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ab4 = ld2 > ad1;
    fb0 = fb1 && lb0;
    Thought lo6 = Thought212.getInstance();
    ad2 = ad3 - ad4;
    double ld7 = 368.28851159385084;
    lb3 = !lb4;
if(fo1 != null){
      ad4 = fo1.m3(lb5, ab1, ab2, ab3);
}
    fd0 *= -1;
        fd1 *= -1;
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, ld2, ld7, ad1, ad2, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, lb4, lb5, ab1, ab2);
}
    boolean lb8 = false;
    Output.points[3][0] -= ld2;
    ab2 = ab3 && ab4;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    Output.points[3][1] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[3][2] -= fd0;
if(fo1 != null){
      lb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought385.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb3 = false;
    Thought lo4 = Thought61.getInstance();

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought87.getInstance(ab1, ab2, ab3, ab4);
    fd0 = fd1 - fd0;
    fb0 = fb1 && ab1;
    if (ab2) {
        boolean lb1 = false;
        ab2 = !ab3;
        Thought lo2 = Thought164.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fd1 < fd0;
        fb1 = fd1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fb0 = fd1 > fd0;
        boolean lb3 = false;
        double ld4 = 175.78759909084621;
        fd0 = fd1 - ld4;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    boolean lb0 = true;
    double ld1 = 804.1842433316938;
    Thought lo2 = Thought350.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
    lb0 = !fb0;
    ad2 *= -1;
    Thought lo3 = Thought121.getInstance();
    Thought lo4 = Thought233.getInstance(fb1, lb0, fb0, fb1);
    lb0 = ad3 > ad4;
    Thought lo5 = Thought241.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, fb0, fb1, lb0, fb0);
    Thought lo6 = Thought124.getInstance(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab2 = fo1.m2(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought270.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = !ab4;
    ad3 = ad4 - fd0;
    Thought lo1 = Thought30.getInstance(fb0, fb1, ab1, ab2);
    ab3 = fd1 < ad1;
    ad2 = ad3 - ad4;
    boolean lb2 = true;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb2, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb2);
}
    ab1 = ad2 < ad3;
    double ld3 = 505.153118160123;

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    boolean lb1 = true;
    boolean lb2 = false;
    lb0 = !lb1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    lb2 = fb0 && fb1;
    lb0 = !lb1;
if(fo0 != null){
      fd1 = fo0.m3();
}
    lb2 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(lb0, lb1, lb2, fb0);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    lb0 = lb1 || lb2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    lb1 = lb2 || fb0;
    fb1 = fd0 < fd1;
    Output.points[3][3] -= fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, lb0, lb1, lb2, fb0);
}
    fb1 = !lb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    Thought lo0 = Thought100.getInstance();
    fb1 = !fb0;
    Thought lo1 = Thought371.getInstance(fb1, fb0, fb1, fb0);
    double ld2 = 804.2802887742116;
    Output.points[3][4] -= ad4;
    fd0 *= -1;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fd1 = ld2 - ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld2, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    boolean lb3 = false;
    double ld4 = 454.88929557451314;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld2, ld4, ad1, ad2);
}
    lb3 = fb0 && fb1;
    Thought lo5 = Thought129.getInstance();
    boolean lb6 = true;

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 351.6152620523891;
    ab1 = fd0 < fd1;
    ab2 = ld0 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(ao3 != null){
      ao3.m2(ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 + ld0;
    ab4 = fd0 > fd1;
    Output.points[3][5] -= ld0;
    Thought lo1 = Thought22.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
    fd0 *= -1;
    Thought lo2 = Thought34.getInstance(ao2, ao3, ao4, fo0);
    ab3 = fd1 > ld0;
    fd0 = fd1 + ld0;
    ab4 = fb0 && fb1;
    Thought lo3 = Thought283.getInstance(fd0, fd1, ld0, fd0);

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab2 = fd0 < fd1;
    Output.points[3][6] -= ad1;
if(ao1 != null){
      ao1.m1();
}
    Thought lo0 = Thought387.getInstance(ab3, ab4, fb0, fb1);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 + ad2;
    fb0 = ad3 > ad4;
    Thought lo1 = Thought262.getInstance(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ab3 = ab4 || fb0;
    ad3 *= -1;
    fb1 = ab1 && ab2;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = fd1 < ad1;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    Output.points[3][7] += fd0;
    double ld0 = 460.8834223529417;
    double ld1 = 447.69476733736974;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ld1 < fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, fd0, fd1);
}
    fb1 = !fb0;
    Output.points[3][8] += ld0;
    Thought lo2 = Thought1.getInstance(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought341.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    ab4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    Output.points[4][0] += fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    fd1 *= -1;
    Output.points[4][1] += fd0;
    ab1 = ab2 && ab3;
    fd1 = fd0 - fd1;
    if (ab4) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        Thought lo1 = Thought13.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
        fd0 = fd1 + fd0;
        boolean lb2 = true;
        Thought lo3 = Thought205.getInstance();
if(fo0 != null){
          ab4 = fo0.m2(fb0, fb1, lb2, ab1);
}
        ab2 = ab3 && ab4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb2, ab1);
}
        Thought lo4 = Thought376.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ad2 > ad3;
    fb1 = !fb0;
    boolean lb0 = true;
    Thought lo1 = Thought86.getInstance(ad4, fd0, fd1, ad1);
    boolean lb2 = true;
    double ld3 = 457.6081827409088;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          lb2 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        Thought lo4 = Thought359.getInstance();
        fd0 = fd1 + ld3;
        fb0 = fb1 && lb0;
        boolean lb5 = false;
        Output.points[4][2] -= ad1;
        lb0 = !lb2;
        boolean lb6 = true;
        boolean lb7 = true;
        ad2 *= -1;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    Output.points[4][3] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = ad1 < ad2;
    fb0 = fb1 && ab1;
    ab2 = !ab3;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
        ad1 *= -1;
        ab2 = ab3 && ab4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
        ad2 = ad3 + ad4;
        ab3 = ab4 || fb0;
        fb1 = ab1 || ab2;
        ab3 = ab4 || fb0;
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld0 = 183.95683113202622;
    fd0 = fd1 - ld0;
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    fb0 = fd1 > ld0;
if(ao2 != null){
      ao2.m1();
}
    double ld1 = 281.3732228574754;
    ld1 = fd0 + fd1;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    boolean lb0 = true;
    Output.points[4][4] -= fd1;
    fb0 = fb1 && lb0;
    if (fb0) {
        double ld1 = 96.997306646391;
if(ao4 != null){
          ld1 = ao4.m3(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        boolean lb2 = true;
        lb0 = !fb0;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ld1, ad1);
}
        Thought lo3 = Thought365.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
        boolean lb4 = true;
        fd1 = ld1 + ad1;
        fb0 = ad2 > ad3;
if(ao4 != null){
          ao4.m2();
}
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
    double ld0 = 456.8859666168294;
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
    boolean lb1 = false;
        ab2 = ld0 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
    fd1 = ld0 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    fd1 = ld0 - fd0;
    fb0 = fd1 < ld0;
    fb1 = fd0 < fd1;
    Thought lo2 = Thought16.getInstance(ao4, fo0, fo1, ao1);
    lb1 = ab1 && ab2;
    ab3 = ab4 && fb0;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    Thought lo0 = Thought310.getInstance(ad3, ad4, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought37.getInstance();
    ab2 = ab3 && ab4;
    fd0 = fd1 + ad1;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    ad2 *= -1;
    boolean lb2 = true;
    Thought lo3 = Thought344.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb2);
    double ld4 = 644.8743231504548;
if(ao2 != null){
      ao1 = ao2.m4(ld4, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb2, ab1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld4, ad1, ad2, ad3);
}
    Thought lo5 = Thought220.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld4);
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = ab3 && ab4;
    ad1 = ad2 + ad3;

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m3();
}
    Thought lo0 = Thought396.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    fb0 = fd0 < fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Output.points[4][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
    lb1 = fd0 > fd1;
    Output.points[4][6] += fd0;
if(fo0 != null){
          lb2 = fo0.m2();
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, lb2, fb0);
}
    double ld3 = 250.31722643548048;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, fb1, lb0, lb1, lb2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = !fb0;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
        fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought258.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = !lb1;
    boolean lb3 = false;
    double ld4 = 691.2920146872533;
    Thought lo5 = Thought261.getInstance(lb3, fb0, fb1, lb0);
    lb1 = ld4 > fd0;
    lb3 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld4, fd0, fd1, lb0, lb1, lb3, fb0);
}
    ld4 = fd0 + fd1;
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld4, fd0, fd1, ld4, fb0, fb1, lb0, lb1);
}
    Thought lo7 = Thought39.getInstance(fo0, fo1, fo0, fo1, lb3, lb6, fb0, fb1);
    lb0 = lb1 && lb3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
