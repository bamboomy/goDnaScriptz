package genetic;
import java.util.ArrayList;
class Thought267 extends Thought{
private static ArrayList<Thought267> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 529.5429128843896;
private double fd1 = 92.35139155805184;
private Thought fo0 = null;
private Thought fo1 = null;
Thought267 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought267 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought267 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought267 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought267 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought267 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought267 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought267 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought267 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought267 instance = new Thought267 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought267 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought267 instance = new Thought267 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought267 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought267 instance = new Thought267 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought267 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought267 instance = new Thought267 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought267 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought267 instance = new Thought267 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought267 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought267 instance = new Thought267 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought267 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought267 instance = new Thought267 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought267 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought267 instance = new Thought267 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought287.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld1 = 946.8947237409599;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    if (fb1) {
        ld1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        ld1 = fd0 + fd1;
        ld1 *= -1;
        for(int i0=0; i0<10; i0++){
            }
        Thought lo2 = Thought170.getInstance(fb0, fb1, fb0, fb1);
        fd0 *= -1;
        fd1 *= -1;
        fb0 = ld1 > fd0;
        Output.points[0][8] += fd1;
        double ld3 = 618.4856678313217;
        fb1 = ld3 < ld1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, ld1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
        boolean lb4 = false;
        fb0 = fb1 || lb4;
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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    ab4 = fb0 && fb1;
    fd1 = fd0 + fd1;
    ab1 = ab2 || ab3;
        ab4 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[1][0] += fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    Output.points[1][1] += fd0;
    lb1 = !ab1;
    ab2 = ab3 || ab4;
    fd1 = fd0 - fd1;
    fb0 = fb1 && lb0;
    boolean lb2 = false;

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
    ad1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 < fd0;
    double ld0 = 612.4207026791452;
    fd0 = fd1 + ld0;
    ad1 = ad2 - ad3;
    Thought lo1 = Thought242.getInstance(fo0, fo1, fo0, fo1);
    ad4 *= -1;
    fd0 = fd1 - ld0;
    fb0 = fb1 && fb0;
    double ld2 = 622.1963744051855;
if(fo1 != null){
      fo0 = fo1.m4(ld2, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    Output.points[1][2] -= ld2;
if(fo1 != null){
      ad1 = fo1.m3();
}
    fb1 = !fb0;
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ad1, fb1, fb0, fb1, fb0);
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
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
    ab1 = !ab2;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    double ld0 = 781.0812922080248;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab4 = fo1.m2(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ld0;
    Output.points[1][3] += ad1;
    Output.points[1][4] -= ad2;
    double ld1 = 519.5496939417268;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        fb1 = fd1 > ld0;

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
      fd1 = ao2.m3();
}
    Output.points[1][5] -= fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    Output.points[1][6] += fd1;
    fd0 = fd1 - fd0;
    if (fb0) {
if(fo0 != null){
          fo0.m1(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
        Output.points[1][7] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        Thought lo1 = Thought127.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        fb0 = !fb1;
if(fo0 != null){
          fd1 = fo0.m3();
}
if(fo1 != null){
          fd0 = fo1.m3(lb0, fb0, fb1, lb0);
}
        fb0 = fd1 < fd0;
        fd1 = fd0 - fd1;
        fd0 *= -1;
        boolean lb2 = true;
        fb0 = fd1 > fd0;
        boolean lb3 = true;
        fd1 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb2, lb3);
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
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    Thought lo1 = Thought245.getInstance(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
    fd1 = ad1 - ad2;
    ad3 *= -1;
        fb0 = fb1 && lb0;
    fb0 = !fb1;
    ad4 *= -1;
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    Output.points[1][8] += fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      lb0 = ao1.m2(fb0, fb1, lb0, fb0);
}
    double ld2 = 591.1345829522893;
    Output.points[2][0] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld2, ad1, ad2, fb1, lb0, fb0, fb1);
}
    Thought lo3 = Thought211.getInstance(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
    fb0 = fb1 && lb0;
    ld2 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
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
    fd1 = fd0 + fd1;
    ab1 = ab2 || ab3;
    Thought lo0 = Thought348.getInstance(ao2, ao3, ao4, fo0);
    ab4 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 < fd1;
    ab3 = ab4 || fb0;
    Thought lo1 = Thought136.getInstance();
    fb1 = !ab1;

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
    Output.points[2][1] += ad1;
    ab2 = ab3 && ab4;
if(ao1 != null){
      fb0 = ao1.m2(fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought159.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
    boolean lb1 = true;
    boolean lb2 = true;
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3, lb2, lb3, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(ad4, fd0, fd1, ad1);
}
    boolean lb4 = true;
    lb1 = !lb2;
if(ao3 != null){
      lb3 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    lb4 = fd1 > ad1;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab4 = !fb0;
    fb1 = lb1 && lb2;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    lb3 = ad2 > ad3;
if(ao4 != null){
          ao4.m1(lb4, ab1, ab2, ab3);
}
    ad4 = fd0 - fd1;
    boolean lb5 = false;
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
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
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought392.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 993.6068557561895;
    lb2 = ld3 < fd0;
    fb0 = fd1 > ld3;
    fb1 = lb0 && lb2;
    fb0 = fd0 > fd1;
if(fo0 != null){
      ld3 = fo0.m3(fd0, fd1, ld3, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2();
}

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
    Thought lo0 = Thought82.getInstance(ab2, ab3, ab4, fb0);
    fb1 = fd0 < fd1;
    Thought lo1 = Thought209.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb1 = !ab1;
    fd1 *= -1;
    Thought lo2 = Thought61.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fd0 *= -1;
    Thought lo3 = Thought379.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb4 = false;
    double ld5 = 511.28254045551535;
    Output.points[2][2] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld5);
}
    ab3 = fd0 > fd1;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb4 = ld5 > fd0;
    for(int i0=0; i0<10; i0++){
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][3] -= ad1;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    double ld0 = 528.8426294802356;
    Thought lo1 = Thought191.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ad1, ad2, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;

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
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ab1 = ab2 && ab3;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    Thought lo1 = Thought262.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
if(fo0 != null){
          fo1 = fo0.m4();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Output.points[2][4] += fd1;
    boolean lb0 = false;
if(ao2 != null){
      fd0 = ao2.m3(lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Output.points[2][5] -= fd1;
    fd0 *= -1;
    fd1 *= -1;
    Output.points[2][6] -= fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = lb0 || fb0;
    double ld1 = 452.6542911788383;
    Thought lo2 = Thought282.getInstance(fd0, fd1, ld1, fd0);
    boolean lb3 = true;
    fd1 = ld1 - fd0;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1);
}
    Output.points[2][7] -= ld1;
    fb1 = lb0 || lb3;
if(ao2 != null){
      ao1 = ao2.m4();
}
        fd0 = fd1 - ld1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought285.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought318.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    if (fb1) {
        Output.points[2][8] += fd0;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        boolean lb2 = false;
        Thought lo3 = Thought119.getInstance(fd1, ad1, ad2, ad3);
        fb0 = fb1 && lb2;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          fo0.m1();
}
        Thought lo4 = Thought205.getInstance(fb0, fb1, lb2, fb0);
if(fo1 != null){
          ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, lb2, fb0, fb1);
}
        ad1 = ad2 - ad3;
        ad4 = fd0 + fd1;
        lb2 = fb0 && fb1;
        ad1 = ad2 - ad3;
        boolean lb5 = false;
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ad1, ad2, lb2, lb5, fb0, fb1);
}
        Thought lo6 = Thought309.getInstance(fo1, ao1, ao2, ao3, lb2, lb5, fb0, fb1);
        lb2 = ad3 > ad4;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
        lb5 = fb0 || fb1;
        if (lb2) {
            boolean lb7 = false;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 558.7410324316837;
    boolean lb1 = true;
    double ld2 = 899.9654713666113;
    Thought lo3 = Thought127.getInstance(ld2, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
    ab1 = ab2 || ab3;
    double ld4 = 117.28653567257933;
    ab4 = fb0 && fb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought195.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fb1 = fo1.m2(ad4, fd0, fd1, ad1);
}
    boolean lb2 = true;
    lb0 = ad2 < ad3;
    boolean lb3 = false;
    Thought lo4 = Thought374.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
    lb2 = ad2 < ad3;
    lb3 = ad4 > fd0;
    ab1 = fd1 > ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = fd0 > fd1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought34.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fd0 *= -1;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(lb1, fb0, fb1, lb1);
}
    fd0 = fd1 - fd0;
    double ld2 = 120.11919016165791;
    fd0 = fd1 + ld2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, fb0, fb1, lb1, fb0);
}
    ld2 = fd0 + fd1;

Thought.STACK_COUNTER++;
return ld2;
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
    double ld0 = 948.1982568946478;
    Output.points[3][0] -= fd0;
if(fo1 != null){
      ab1 = fo1.m2(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    boolean lb1 = true;
    ld0 *= -1;
    fd0 *= -1;
    ab2 = ab3 && ab4;
    fd1 = ld0 - fd0;
    fd1 *= -1;
    Thought lo2 = Thought221.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
    Thought lo3 = Thought195.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
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
    ad1 *= -1;
    ad2 *= -1;
    Output.points[3][1] -= ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought324.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    fb0 = ad4 > fd0;
    fb1 = fd1 > ad1;
    double ld2 = 363.3201581183075;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    double ld3 = 778.857900356331;
    double ld4 = 838.581520376431;
    ld4 *= -1;
    boolean lb5 = true;
    ad1 = ad2 - ad3;

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
    double ld0 = 214.64131455626202;
    double ld1 = 701.8758071354945;
    ab2 = ab3 || ab4;
    Output.points[3][2] -= ld1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
    ld1 = ad1 + ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
    if (fb0) {
        double ld2 = 259.42239168046893;
        fb1 = ab1 && ab2;
        ab3 = ab4 && fb0;
        boolean lb3 = true;
        ld0 *= -1;
        fb0 = ld1 < ad1;
        double ld4 = 433.77700250316514;
        ad1 *= -1;
        Output.points[3][3] += ad2;
if(fo1 != null){
          fo0 = fo1.m4();
}
        double ld5 = 520.2234578816347;
        ad2 = ad3 + ad4;
        Output.points[3][4] -= fd0;
        double ld6 = 962.6109467382998;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    if (fb0) {
        fd1 = fd0 - fd1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
          lb0 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
        fb1 = fd0 < fd1;
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought146.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    boolean lb1 = false;
    fb0 = ad3 > ad4;
    boolean lb2 = false;
    double ld3 = 895.4361290670405;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad4 = fd0 - fd1;
if(ao2 != null){
      ld3 = ao2.m3(fb0, fb1, lb1, lb2);
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
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
    Output.points[3][5] += fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    if (ab2) {
        ab3 = ab4 || fb0;
        } else {
        fb1 = fd0 > fd1;
        Thought lo1 = Thought209.getInstance();
if(ao2 != null){
          ao2.m1(lb0, ab1, ab2, ab3);
}
        ab4 = fd0 > fd1;
        Thought lo2 = Thought264.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
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
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld0 = 113.62008168731539;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ld0 = ad1 + ad2;
    Thought lo1 = Thought14.getInstance(ao2, ao3, ao4, fo0);
    ad3 = ad4 - fd0;
    Output.points[3][6] += fd1;
if(fo1 != null){
      ld0 = fo1.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ld0;
    Thought lo2 = Thought44.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
    fd0 *= -1;
    fd1 *= -1;

Thought.STACK_COUNTER++;
return ld0;
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
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1();
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    lb0 = lb1 || fb0;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, lb2, fb0);
}
    fb1 = !lb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
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
    Thought lo0 = Thought46.getInstance(fd1, fd0, fd1, fd0);
        Output.points[3][7] += fd1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4();
}
    lb2 = fd0 < fd1;
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb1, lb2, ab1);
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
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    ad2 *= -1;
    fb0 = ad3 < ad4;
    fb1 = lb0 || fb0;
    fd0 *= -1;
    fb1 = !lb0;
    fb0 = !fb1;
    Thought lo1 = Thought238.getInstance(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
    fb0 = fb1 && lb0;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
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
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld0 = 790.3630245286284;
    double ld1 = 522.9952336301192;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
    Output.points[3][8] -= ad1;
if(fo0 != null){
      ab1 = fo0.m2();
}
        ab2 = ab3 || ab4;
    fb0 = ad2 > ad3;
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, ab1, ab2, ab3);
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
    Thought lo0 = Thought206.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Output.points[4][0] -= fd0;
    fb0 = fb1 && fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 && fb1;
        for(int i1=0; i1<10; i1++){
            fd1 = fd0 + fd1;
            Thought lo1 = Thought221.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
            fb0 = !fb1;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
              fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
            if (fb1) {
                fb0 = fd0 > fd1;
if(ao1 != null){
                  fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
                  fo1.m3();
}
                Thought lo2 = Thought335.getInstance(fb1, fb0, fb1, fb0);
                fb1 = fd0 > fd1;
                } else {
                fb0 = !fb1;
                fd0 = fd1 - fd0;
if(ao1 != null){
                  fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
                Thought lo3 = Thought238.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
                  fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
                  fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
                fd1 = fd0 - fd1;
}}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][1] += ad1;
    if (fb0) {
        fb1 = fb0 && fb1;
        ad2 = ad3 + ad4;
        fd0 = fd1 - ad1;
        ad2 *= -1;
        fb0 = !fb1;
        } else {
if(ao2 != null){
          fb0 = ao2.m2(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
        double ld0 = 476.0191795805684;
        ad4 = fd0 - fd1;
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
    double ld0 = 786.8421443836626;
    double ld1 = 6.395270008051297;
    boolean lb2 = false;
if(ao2 != null){
      ld0 = ao2.m3(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld0, fb0, fb1, lb2, ab1);
}
    boolean lb3 = false;
    ld1 = fd0 + fd1;
    Output.points[4][2] -= ld0;
    ab1 = ld1 < fd0;
if(ao3 != null){
          ao3.m1(fd1, ld0, ld1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ld0;
    ld1 = fd0 - fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, lb2, lb3, ab1, ab2);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ld0 = ao2.m3(ld1, fd0, fd1, ld0);
}
    double ld4 = 346.6059663899636;
    boolean lb5 = false;
    boolean lb6 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, ld4, fd0, fd1);
}
if(ao3 != null){
      ab2 = ao3.m2();
}
if(ao4 != null){
      ab3 = ao4.m2(ab4, fb0, fb1, lb2);
}
    lb3 = !lb5;
    Thought lo7 = Thought362.getInstance(fo0, fo1, ao1, ao2, ld0, ld1, ld4, fd0, lb6, ab1, ab2, ab3);
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, ld1, ld4, ab4, fb0, fb1, lb2);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, lb3, lb5, lb6, ab1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ab2 = ad2 < ad3;
    Thought lo0 = Thought280.getInstance(ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
    Thought lo2 = Thought283.getInstance();
    ab2 = ab3 || ab4;
    fb0 = fb1 || lb1;
    boolean lb3 = true;
    lb3 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    lb1 = ad3 < ad4;
    lb3 = fd0 < fd1;
    Thought lo4 = Thought181.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fb0 = fb1 || lb1;
    boolean lb5 = true;
    fd0 = fd1 - ad1;
    lb3 = lb5 && ab1;
    Thought lo6 = Thought58.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, lb1, lb3, lb5, ab1);
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
    Output.points[4][3] -= fd1;
    Thought lo0 = Thought43.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    Output.points[4][4] += fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = fb0 && fb1;
    lb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    Output.points[4][5] -= fd1;
    fb1 = lb1 || fb0;
    fb1 = fd0 < fd1;
    lb1 = fb0 && fb1;

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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = !fb0;
    boolean lb0 = false;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    lb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;

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
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
        fd0 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
        fb0 = fb1 || fb0;
        fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    Output.points[4][6] -= fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    Output.points[4][7] += fd0;
    fb0 = !fb1;

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
