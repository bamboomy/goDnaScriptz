package genetic;
import java.util.ArrayList;
class Thought302 extends Thought{
private static ArrayList<Thought302> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 971.1499432371332;
private double fd1 = 604.2710242212627;
private Thought fo0 = null;
private Thought fo1 = null;
Thought302 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought302 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought302 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought302 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought302 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought302 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought302 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought302 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought302 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought302 instance = new Thought302 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought302 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought302 instance = new Thought302 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought302 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought302 instance = new Thought302 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought302 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought302 instance = new Thought302 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought302 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought302 instance = new Thought302 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought302 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought302 instance = new Thought302 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought302 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought302 instance = new Thought302 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought302 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought302 instance = new Thought302 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        Thought lo0 = Thought273.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
        fb0 = fd0 > fd1;
        Thought lo1 = Thought157.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        double ld2 = 348.2213288093038;
        boolean lb3 = false;
        boolean lb4 = false;
        fd0 *= -1;
        fd1 = ld2 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    Thought lo1 = Thought328.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
    double ld2 = 24.76662048766647;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
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
    boolean lb0 = false;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = fb0 && fb1;
    Thought lo1 = Thought260.getInstance(ad1, ad2, ad3, ad4);
    fd0 *= -1;
    fd1 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    lb0 = fb0 || fb1;
    lb0 = !fb0;
    ad2 *= -1;
    fb1 = !lb0;
    for(int i0=0; i0<10; i0++){
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ad1 < ad2;
    ab3 = ad3 > ad4;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    lb0 = lb1 && ab1;
    Thought lo2 = Thought307.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, lb0, lb1, ab1);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb3 = true;
    ad1 = ad2 + ad3;
    fb0 = fb1 || lb0;
    lb1 = lb3 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 || ab4;

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
    fd1 *= -1;
    if (fb1) {
        fb0 = fb1 && fb0;
if(ao2 != null){
          fb1 = ao2.m2(fd0, fd1, fd0, fd1);
}
        fb0 = fd0 > fd1;
        Thought lo0 = Thought170.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
if(ao1 != null){
          ao1.m2();
}
        fb1 = fb0 || fb1;
        fb0 = fb1 && fb0;
        boolean lb1 = true;
        fb0 = fd0 > fd1;
        fb1 = lb1 && fb0;
        fb1 = fd0 < fd1;
        fd0 *= -1;
        boolean lb2 = false;
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
    boolean lb0 = true;
if(ao2 != null){
      lb0 = ao2.m2(fb0, fb1, lb0, fb0);
}
    double ld1 = 656.5773440172828;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    boolean lb2 = false;
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb2);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, ad1, fb0, fb1, lb0, lb2);
}
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb2);
}
    Thought lo3 = Thought285.getInstance(ao3, ao4, fo0, fo1);

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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
    Thought lo1 = Thought334.getInstance();
    fd0 = fd1 + fd0;
    boolean lb2 = false;
if(ao2 != null){
      ao2.m1(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    fd1 *= -1;
    double ld1 = 951.2715766754809;
    ab4 = fb0 || fb1;
    Thought lo2 = Thought169.getInstance(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld1, ad1, ad2, ad3);
}
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1);
}
    Thought lo3 = Thought61.getInstance();
    ad1 *= -1;
        ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    ad2 *= -1;
    lb0 = !ab1;

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
        fb0 = fd1 < fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fb0 = fb1 && lb0;
    lb1 = fb0 || fb1;
    lb0 = fd1 > fd0;
    Output.points[7][5] += fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
    lb1 = fd0 > fd1;
    lb2 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
    fb0 = !fb1;
    lb0 = lb1 && lb2;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
    double ld3 = 473.5257819077223;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
    ld3 = fd0 + fd1;
    ld3 = fd0 - fd1;
    lb2 = fb0 || fb1;
    ld3 = fd0 - fd1;

Thought.STACK_COUNTER++;
return lb0;
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
    if (ab2) {
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            ab3 = !ab4;
            Output.points[7][6] += fd0;
            fd1 = fd0 - fd1;
            Thought lo0 = Thought364.getInstance(fd0, fd1, fd0, fd1);
            Thought lo1 = Thought178.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
              fo0 = fo1.m4();
}
if(fo1 != null){
              fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
              fo0.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
            fb0 = fd0 > fd1;
            fb1 = fd0 > fd1;
}}
Thought.STACK_COUNTER++;
return ab1;
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
    ad1 = ad2 + ad3;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = ad4 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    if (fb0) {
        fb1 = ad4 < fd0;
        lb0 = !fb0;
        } else {
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb1 = true;
        fb0 = ad4 > fd0;
if(fo0 != null){
          fd1 = fo0.m3(fb1, lb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb1, lb0, fb0);
}
        Output.points[7][7] += fd0;
        double ld2 = 915.5668412250062;
        boolean lb3 = true;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld2, ad1, ad2, fb0, fb1, lb1, lb3);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, lb1, ab1, ab2);
}
    fd0 *= -1;
    Thought lo2 = Thought15.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ab3 = fo1.m2(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    ab4 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}

Thought.STACK_COUNTER++;
return ab1;
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
    fd0 = fd1 - fd0;
    if (fb1) {
        fb0 = fb1 || fb0;
        boolean lb0 = false;
        fd1 = fd0 - fd1;
        fb0 = fd0 > fd1;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        lb0 = fd0 < fd1;
        boolean lb1 = false;
        fd0 *= -1;
        fd1 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
        fd0 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb0);
}
        fd1 *= -1;
        double ld2 = 622.5227280933245;
        Output.points[7][8] += ld2;
        boolean lb3 = true;
if(ao3 != null){
          lb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
        double ld4 = 869.0025444218618;
        lb3 = ld4 > fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld2, ld4, fd0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld2, ld4, fd0);
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
    Thought lo0 = Thought97.getInstance();
    boolean lb1 = false;
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(lb1, fb0, fb1, lb1);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 > ad1;
        lb1 = fb0 || fb1;
        ad2 = ad3 - ad4;
        fd0 = fd1 + ad1;
        lb1 = !fb0;
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
        Thought lo2 = Thought225.getInstance(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb1);
        fd1 *= -1;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2);
}
        ad1 *= -1;
        Output.points[8][0] -= ad2;
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
        Output.points[8][1] -= ad1;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][2] -= fd1;
    ab1 = fd0 < fd1;
    ab2 = ab3 && ab4;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Output.points[8][3] += fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    boolean lb0 = true;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb1 = false;
    double ld2 = 928.7810965479662;
    ld2 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(lb0, lb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld2, fd0, fd1, ld2, lb0, lb1, ab1, ab2);
}
    boolean lb3 = true;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb1;

Thought.STACK_COUNTER++;
return lb3;
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
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab2 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Output.points[8][4] -= ad1;
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    Output.points[8][5] += fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}

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
    fd0 *= -1;
    Output.points[8][6] -= fd1;
    double ld0 = 94.3035979352156;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld1 = 362.1050050867978;
if(fo0 != null){
          fo0.m2(ld0, ld1, fd0, fd1);
}
    ld0 = ld1 + fd0;
        Thought lo2 = Thought124.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
if(fo1 != null){
      fo1.m3();
}
    fb1 = fd1 < ld0;
    boolean lb3 = false;
    ld1 = fd0 + fd1;
    ld0 = ld1 - fd0;
    for(int i0=0; i0<10; i0++){
        double ld4 = 572.3747243195126;
        }
    lb3 = fd1 < ld0;
    ld1 = fd0 - fd1;
    fb0 = ld0 < ld1;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    boolean lb1 = true;
    boolean lb2 = true;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd1 = fd0 + fd1;
    lb1 = lb2 || ab1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      lb1 = fo1.m2();
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
    boolean lb0 = false;
    Output.points[8][7] += ad4;
    boolean lb1 = false;
    Thought lo2 = Thought236.getInstance(lb1, fb0, fb1, lb0);
    boolean lb3 = true;
    Output.points[8][8] -= fd0;
    lb1 = lb3 || fb0;
    fb1 = lb0 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb3, fb0, fb1, lb0);
}
    double ld4 = 835.4562714412536;
    ad3 = ad4 + fd0;
    lb1 = !lb3;
    Output.points[0][0] += fd1;
    double ld5 = 260.4728228488879;
    double ld6 = 296.58216211217797;
    boolean lb7 = false;
    ld4 *= -1;
    ld5 = ld6 - ad1;
    boolean lb8 = false;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, lb7, lb8, fb0, fb1);
}
    ld4 = ld5 - ld6;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, lb3, lb7);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb8 = ad2 > ad3;
    boolean lb9 = false;

Thought.STACK_COUNTER++;
return ad4;
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
    ad2 *= -1;
        ab2 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
              ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        Thought lo0 = Thought58.getInstance();

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m3(fb0, fb1, lb0, fb0);
}
    double ld1 = 581.4769284556203;
    ld1 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld1, fd0, lb0, lb2, fb0, fb1);
}
    fd1 = ld1 - fd0;
    fd1 = ld1 + fd0;
    boolean lb3 = false;
    Thought lo4 = Thought391.getInstance(fo0, fo1, ao1, ao2, lb0, lb2, lb3, fb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb0) {
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
        fb1 = fb0 && fb1;
        double ld0 = 796.7897253181548;
if(ao2 != null){
          ad2 = ao2.m3();
}
        ad3 = ad4 + fd0;
if(ao3 != null){
          ao3.m3(fb0, fb1, fb0, fb1);
}
        fd1 = ld0 + ad1;
        Thought lo1 = Thought71.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
        Output.points[0][1] -= fd1;
        Thought lo2 = Thought21.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
        fb0 = ad4 > fd0;
}
Thought.STACK_COUNTER++;
return ad1;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = true;
        ab4 = fb0 && fb1;
if(ao3 != null){
      fd1 = ao3.m3(lb0, lb1, ab1, ab2);
}
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Output.points[0][2] += fd1;
if(ao3 != null){
      ao3.m2(fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    if (lb0) {
        double ld2 = 776.1950627772067;
        Thought lo3 = Thought335.getInstance(ao3, ao4, fo0, fo1);
        lb1 = !ab1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][3] += ad2;
        ab2 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao2.m3();
}
    ab1 = ad1 < ad2;
    ab2 = !ab3;
    Output.points[0][4] -= ad3;
    ad4 *= -1;
    fd0 = fd1 - ad1;

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
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd1 *= -1;
    Thought lo1 = Thought92.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    fb1 = !lb0;
    fb0 = fb1 && lb0;
    fd0 = fd1 - fd0;
    double ld2 = 6.998934332417789;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought339.getInstance(fd1, ld2, fd0, fd1);
    ld2 = fd0 - fd1;
    lb0 = fb0 || fb1;
    ld2 = fd0 + fd1;
    Thought lo4 = Thought17.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
    boolean lb5 = false;
if(fo0 != null){
      lb0 = fo0.m2();
}
if(fo1 != null){
      fd0 = fo1.m3(lb5, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, lb5, fb0, fb1, lb0);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought210.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    Thought lo2 = Thought197.getInstance(fd0, fd1, fd0, fd1);
    ab3 = fd0 < fd1;
    double ld3 = 339.70399084725204;
    Thought lo4 = Thought313.getInstance(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
    ab4 = !fb0;
    Thought lo5 = Thought214.getInstance();
    fd0 = fd1 + ld3;
    Output.points[0][5] -= fd0;
    double ld6 = 727.4966217969475;
    fd0 = fd1 + ld3;
if(fo1 != null){
      fo1.m3(fb1, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    boolean lb7 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld6, fd0, fd1, ld3, fb0, fb1, lb1, lb7);
}
if(fo1 != null){
      fo0 = fo1.m4(ld6, fd0, fd1, ld3, ab1, ab2, ab3, ab4);
}
    boolean lb8 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
    lb7 = lb8 || ab1;

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    Thought lo0 = Thought40.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fd0 < fd1;
    Output.points[0][6] += ad1;
    ad2 *= -1;
    Thought lo1 = Thought377.getInstance(ad3, ad4, fd0, fd1);
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad1 = ad2 - ad3;
    Thought lo2 = Thought374.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought262.getInstance(fo1, fo0, fo1, fo0);
    fd1 = ad1 + ad2;
        Output.points[0][7] -= ad3;
    ad4 = fd0 + fd1;
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
        Thought lo4 = Thought52.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
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
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    Output.points[0][8] += ad1;
    Output.points[1][0] += ad2;
    ab2 = !ab3;
    ab4 = ad3 > ad4;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && ab1;
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ab1 = fo0.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        ad1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb0 = false;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        ab3 = ab4 && fb0;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
        boolean lb1 = false;
if(fo0 != null){
          fo0.m3();
}
if(fo1 != null){
          fd0 = fo1.m3(lb0, lb1, ab1, ab2);
}
        fd1 *= -1;
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
    fd0 *= -1;
    double ld0 = 760.6418494677289;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd1 = ao2.m3(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fb0 && fb1;
    fd0 = fd1 - ld0;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          lb1 = ao4.m2();
}
if(fo0 != null){
          ld0 = fo0.m3(lb2, fb0, fb1, lb1);
}
        }
    Thought lo3 = Thought271.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb1);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought68.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought320.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
    ad1 = ad2 + ad3;
if(ao4 != null){
      ao4.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    fb0 = fb1 && fb0;
    double ld2 = 279.1163329368724;
    Thought lo3 = Thought323.getInstance();
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo4 = Thought263.getInstance(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    fb1 = ad4 > fd0;
    fd1 *= -1;
    Thought lo5 = Thought295.getInstance(ld2, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    ad4 = fd0 - fd1;
        fb0 = ld2 > ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    Output.points[1][1] -= fd0;
    boolean lb0 = true;
    ab1 = fd1 > fd0;
    double ld1 = 270.1914170512769;
    ab2 = ab3 && ab4;
    double ld2 = 629.3283886426555;
    ld2 = fd0 + fd1;
    Thought lo3 = Thought372.getInstance(ao1, ao2, ao3, ao4);
    boolean lb4 = false;
if(fo0 != null){
      fo0.m2(ld1, ld2, fd0, fd1);
}
        ab4 = ld1 > ld2;
    Output.points[1][2] -= fd0;
    fb0 = fb1 && lb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld1, ld2, fd0);
}
    lb4 = fd1 < ld1;
    ld2 *= -1;
    fd0 = fd1 - ld1;
    Thought lo5 = Thought206.getInstance();
    boolean lb6 = false;
    lb6 = ld2 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    fd1 = ld1 - ld2;
    double ld7 = 177.07826754401864;
    lb4 = !lb6;

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
    double ld0 = 277.8038982250292;
    Thought lo1 = Thought348.getInstance(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
        Thought lo2 = Thought19.getInstance(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 + ld0;
    fb1 = ad1 < ad2;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ab2 = !ab3;
    ld0 = ad1 + ad2;
if(fo0 != null){
      fo0.m1();
}
    boolean lb3 = true;
    Thought lo4 = Thought249.getInstance(ab3, ab4, fb0, fb1);
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2, lb3, ab1, ab2, ab3);
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld0, ab4, fb0, fb1, lb3);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb3);
}
    Output.points[1][3] -= ad1;
    ad2 = ad3 + ad4;
    ab1 = ab2 && ab3;
    boolean lb5 = false;

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
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    boolean lb1 = false;
    Thought lo2 = Thought32.getInstance(fo1, fo0, fo1, fo0);
    Thought lo3 = Thought145.getInstance(fd1, fd0, fd1, fd0);
    Output.points[1][4] -= fd1;
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
    Output.points[1][5] += fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    lb0 = lb1 && fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb4 = true;
    boolean lb5 = false;
        Output.points[1][6] -= fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb5 = !fb0;
    boolean lb6 = true;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = !fb1;
    fd1 = fd0 - fd1;

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
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought19.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Output.points[1][7] += fd0;
    Output.points[1][8] -= fd1;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fb0 && fb1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought84.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
    fb1 = fd1 < fd0;
        fd1 *= -1;

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
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    Output.points[2][0] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
}
